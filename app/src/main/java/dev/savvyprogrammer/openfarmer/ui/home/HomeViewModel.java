package dev.savvyprogrammer.openfarmer.ui.home;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import dev.savvyprogrammer.openfarmer.data.NewsRepository;
import dev.savvyprogrammer.openfarmer.model.Article;

public class HomeViewModel extends AndroidViewModel {
    private final NewsRepository newsRepository;

    public HomeViewModel(@NonNull Application application) {
        super(application);
        newsRepository = NewsRepository.getInstance(application.getApplicationContext());
    }

    public LiveData<List<Article>> getNewsHeadlines(String query) {
        return newsRepository.getHeadlines(query);
    }

}