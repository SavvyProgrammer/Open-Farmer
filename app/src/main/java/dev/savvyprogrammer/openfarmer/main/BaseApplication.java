package dev.savvyprogrammer.openfarmer.main;

import android.app.Application;

import dev.savvyprogrammer.openfarmer.NewsPreference;
import dev.savvyprogrammer.openfarmer.model.Article;


public class BaseApplication extends Application {


    private static BaseApplication mInstance;





    public static synchronized BaseApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        mInstance = this;
        super.onCreate();

    }



}
