package dev.savvyprogrammer.openfarmer.data;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import java.util.List;

import dev.savvyprogrammer.openfarmer.model.Article;
import dev.savvyprogrammer.openfarmer.network.NewsApiClient;

public class NewsRepository {

    private static final Object LOCK = new Object();
    private static NewsRepository sInstance;

    private final NewsApiClient newsApiService;
    private final MutableLiveData<List<Article>> networkNewsLiveData;


    // required private constructor for Singleton pattern
    private NewsRepository(Context context) {
        newsApiService = NewsApiClient.getInstance(context);
        networkNewsLiveData = new MutableLiveData<>();
        networkNewsLiveData.observeForever(articles -> {
            if (articles != null) {

            }
        });
    }

    public synchronized static NewsRepository getInstance(Context context) {
        if (sInstance == null) {
            synchronized (LOCK) {
                sInstance = new NewsRepository(context);
            }
        }
        return sInstance;
    }



    public LiveData<List<Article>> getHeadlines(String query) {
        System.out.println("I'll be free");
        final LiveData<List<Article>> networkData = newsApiService.getHeadlines(query);
        networkData.observeForever(new Observer<List<Article>>() {
            @Override
            public void onChanged(@Nullable List<Article> articles) {
                if (articles != null) {
                    networkNewsLiveData.setValue(articles);
                    networkData.removeObserver(this);
                }
            }
        });

        return networkData;
    }






}
