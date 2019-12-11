package dev.savvyprogrammer.openfarmer.adapters;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;


import java.util.List;

import dev.savvyprogrammer.openfarmer.R;
import dev.savvyprogrammer.openfarmer.model.Article;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
private Context mContext;
private List<Article> mNewsList;
private SharedPreferences sharedPrefs;


public NewsAdapter(Context context, List<Article> newsList) {
        mContext = context;
        mNewsList = newsList;
        }

@Override
@NonNull
public NewsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_card_item, parent, false);
        return new ViewHolder(v);
}

@Override
public int getItemCount() {
        return mNewsList.size();
}

class ViewHolder extends RecyclerView.ViewHolder {
    private TextView sourceTextView;
    private TextView authorTextView;
    private TextView titleTextView;
    private TextView descriptionTextView;
    private ImageView thumbnailImageView;
    private TextView publishedAtTextView;
    private TextView contentTextView;
    private CardView cardView;

    ViewHolder(View itemView) {
        super(itemView);
        sourceTextView = itemView.findViewById(R.id.source_card);
        authorTextView = itemView.findViewById(R.id.author_card);
        titleTextView = itemView.findViewById(R.id.title_card);
        descriptionTextView = itemView.findViewById(R.id.description_card);
        thumbnailImageView = itemView.findViewById(R.id.thumbnail_image_card);
        publishedAtTextView = itemView.findViewById(R.id.published_at_card);
        contentTextView = itemView.findViewById(R.id.content_card);
        cardView = itemView.findViewById(R.id.card_view);
    }
}

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(mContext);

        final Article currentNews = mNewsList.get(position);

        holder.sourceTextView.setText(currentNews.getSource().getName());
        holder.authorTextView.setText((String)currentNews.getAuthor());
        holder.titleTextView.setText(currentNews.getTitle());
        holder.descriptionTextView.setText(currentNews.getDescription());
        holder.publishedAtTextView.setText(currentNews.getPublishedAt());
        holder.contentTextView.setText(currentNews.getContent());

        if (currentNews.getUrlToImage() == null) {
            holder.thumbnailImageView.setVisibility(View.GONE);
        } else {
            holder.thumbnailImageView.setVisibility(View.VISIBLE);
            Picasso.get().load(currentNews.getUrlToImage()).into(holder.thumbnailImageView);
        }

        holder.cardView.setOnClickListener(view -> {

            Uri newsUri = Uri.parse(currentNews.getUrl());
            Intent websiteIntent = new Intent(Intent.ACTION_VIEW, newsUri);
            mContext.startActivity(websiteIntent);
        });
    }


    public void setArticles(List<Article> newsList) {
        if (newsList != null) {
            this.mNewsList = newsList;
            notifyDataSetChanged();
        }
    }

}
