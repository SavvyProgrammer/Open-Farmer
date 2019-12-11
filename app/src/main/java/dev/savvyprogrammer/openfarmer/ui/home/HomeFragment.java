package dev.savvyprogrammer.openfarmer.ui.home;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.loader.app.LoaderManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;

import dev.savvyprogrammer.openfarmer.adapters.NewsAdapter;
import dev.savvyprogrammer.openfarmer.R;

public class HomeFragment extends Fragment {


    private NewsAdapter newsAdapter;
    private TextView mEmptyStateTextView;
    private View mLoadingIndicator;
    private SwipeRefreshLayout mSwipeRefreshLayout;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);



        RecyclerView mRecyclerView = rootView.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(layoutManager);



        mLoadingIndicator = rootView.findViewById(R.id.loading_indicator);
        mEmptyStateTextView = rootView.findViewById(R.id.empty_view);
        newsAdapter = new NewsAdapter(getActivity(), new ArrayList<>());
        mRecyclerView.setAdapter(newsAdapter);

        mSwipeRefreshLayout = rootView.findViewById(R.id.swipe_refresh);
        mSwipeRefreshLayout.setColorSchemeColors(getResources().getColor(R.color.swipe_color_1),
                getResources().getColor(R.color.swipe_color_2),
                getResources().getColor(R.color.swipe_color_3),
                getResources().getColor(R.color.swipe_color_4));

        mSwipeRefreshLayout.setOnRefreshListener(() -> {

            initiateRefresh();
            Toast.makeText(getActivity(), "Updated", Toast.LENGTH_SHORT).show();
        });

        initializeLoader(isConnected());

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getNews();
    }

    private void getNews(){
        mSwipeRefreshLayout.setRefreshing(false);
        HomeViewModel viewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        viewModel.getNewsHeadlines("agriculture").observe(this, articles -> {
            if (articles != null) {
                newsAdapter.setArticles(articles);
            }
        });
        mLoadingIndicator.setVisibility(View.GONE);
    }






    @Override
    public void onResume() {
        super.onResume();

    }

    private boolean isConnected() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return (networkInfo != null && networkInfo.isConnected());
    }


    private void initializeLoader(boolean isConnected) {
        if (isConnected) {

            mEmptyStateTextView.setVisibility(View.GONE);
        } else {


            mLoadingIndicator.setVisibility(View.GONE);
            mEmptyStateTextView.setText(R.string.no_internet_connection);
            mEmptyStateTextView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_network_check, 0, 0);
        }
    }


    private void restartLoader(boolean isConnected) {
        if (isConnected) {
            mEmptyStateTextView.setVisibility(View.GONE);
            getNews();
        } else {

            mLoadingIndicator.setVisibility(View.GONE);
            mEmptyStateTextView.setText(R.string.no_internet_connection);
            mEmptyStateTextView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_network_check, 0,0);

            mSwipeRefreshLayout.setVisibility(View.GONE);

        }
    }

    private void initiateRefresh() {

        restartLoader(isConnected());
    }
}