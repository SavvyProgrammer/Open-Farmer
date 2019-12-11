package dev.savvyprogrammer.openfarmer.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dev.savvyprogrammer.openfarmer.R;
import dev.savvyprogrammer.openfarmer.adapters.CropAdapter;
import dev.savvyprogrammer.openfarmer.crops.CropActivity;
import dev.savvyprogrammer.openfarmer.model.Crop;

public class DashboardFragment extends Fragment implements CropAdapter.OnCropClickListener {
    public static final String CROP_POSITION = "crop_postion";
    private DashboardViewModel dashboardViewModel;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel = ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        RecyclerView mRecyclerView = root.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(layoutManager);


        List<Crop> cropList = new ArrayList<>();
        cropList.add(new Crop(R.drawable.avocado, "Avocado"));
        cropList.add(new Crop(R.drawable.beans, "Beans"));
        cropList.add(new Crop(R.drawable.carrot, "Carrot"));
        cropList.add(new Crop(R.drawable.cassava, "Cassava"));
        cropList.add(new Crop(R.drawable.cocoyam, "Cocoyam"));
        cropList.add(new Crop(R.drawable.mango, "Mango"));
        cropList.add(new Crop(R.drawable.onion, "Onion"));
        cropList.add(new Crop(R.drawable.pepper, "Pepper"));
        cropList.add(new Crop(R.drawable.potato, "Potato"));
        cropList.add(new Crop(R.drawable.pineapple, "Pineapple"));
        cropList.add(new Crop(R.drawable.tomato, "Tomato"));
        cropList.add(new Crop(R.drawable.watermelon, "Watermelon"));
        cropList.add(new Crop(R.drawable.yam, "Yam"));


        CropAdapter cropAdapter = new CropAdapter(cropList, this);
        mRecyclerView.setAdapter(cropAdapter);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCropClick(int position) {
        Intent intent = new Intent(getActivity(), CropActivity.class);
        switch (position) {
            case 0:
                intent.putExtra(CROP_POSITION, 1);
                startActivity(intent);
                break;
            case 1:
                intent.putExtra(CROP_POSITION, 2);
                startActivity(intent);
                break;
            case 2:
                intent.putExtra(CROP_POSITION, 3);
                startActivity(intent);
                break;
            case 3:
                intent.putExtra(CROP_POSITION, 4);
                startActivity(intent);
                break;
            case 4:
                intent.putExtra(CROP_POSITION, 5);
                startActivity(intent);
                break;
            case 5:
                intent.putExtra(CROP_POSITION, 6);
                startActivity(intent);
                break;
            case 6:
                intent.putExtra(CROP_POSITION, 7);
                startActivity(intent);
                break;
            case 7:
                intent.putExtra(CROP_POSITION, 8);
                startActivity(intent);
                break;
            case 8:
                intent.putExtra(CROP_POSITION, 9);
                startActivity(intent);
                break;
            case 9:
                intent.putExtra(CROP_POSITION, 10);
                startActivity(intent);
                break;
            case 10:
                intent.putExtra(CROP_POSITION, 11);
                startActivity(intent);
                break;
            case 11:
                intent.putExtra(CROP_POSITION, 12);
                startActivity(intent);
                break;
            case 12:
                intent.putExtra(CROP_POSITION, 13);
                startActivity(intent);
                break;

        }
    }
}