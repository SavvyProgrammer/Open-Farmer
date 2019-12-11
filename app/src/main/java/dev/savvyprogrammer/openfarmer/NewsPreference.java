package dev.savvyprogrammer.openfarmer;

import android.content.Context;
import android.content.SharedPreferences;

import java.io.IOException;

import dev.savvyprogrammer.openfarmer.main.BaseApplication;
import dev.savvyprogrammer.openfarmer.model.Article;




public class NewsPreference {

    Context mContext;
    SharedPreferences sharedPreferences;

    public NewsPreference() {
        mContext = BaseApplication.getInstance().getApplicationContext();
        sharedPreferences = mContext.getSharedPreferences(mContext.getPackageName() + "." + getClass().getSimpleName(), Context.MODE_PRIVATE);
    }
    public void putString(String key, String value) {
        sharedPreferences.edit().putString(key, value).apply();//.commit();
    }

}
