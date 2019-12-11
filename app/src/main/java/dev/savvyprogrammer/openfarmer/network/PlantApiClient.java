package dev.savvyprogrammer.openfarmer.network;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import dev.savvyprogrammer.openfarmer.model.Article;
import dev.savvyprogrammer.openfarmer.model.ArticleResponseWrapper;
import dev.savvyprogrammer.openfarmer.model.Plant;
import dev.savvyprogrammer.openfarmer.model.PlantResponseWrapper;
import dev.savvyprogrammer.openfarmer.util.DateDeserializer;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PlantApiClient {

    private static final String PLANT_API_URL = "http://harvesthelper.herokuapp.com/";
    private static final Object LOCK = new Object();
    private static PlantApi plantApi;
    private static PlantApiClient sInstance;

    // Required private constructor
    private PlantApiClient() {
    }

    public static PlantApiClient getInstance(Context context) {
        if (sInstance == null || plantApi == null) {
            synchronized (LOCK) {
                // 5 MB of cache
                Cache cache = new Cache(context.getApplicationContext().getCacheDir(), 5 * 1024 * 1024);

                // Used for cache connection
                Interceptor networkInterceptor = chain -> {
                    // set max-age and max-stale properties for cache header
                    CacheControl cacheControl = new CacheControl.Builder()
                            .maxAge(1, TimeUnit.HOURS)
                            .maxStale(3, TimeUnit.DAYS)
                            .build();
                    return chain.proceed(chain.request())
                            .newBuilder()
                            .removeHeader("Pragma")
                            .header("Cache-Control", cacheControl.toString())
                            .build();
                };

                // For logging
                HttpLoggingInterceptor loggingInterceptor =
                        new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);


                // Building OkHttp client
                OkHttpClient client = new OkHttpClient.Builder()
                        .cache(cache)
                        .addNetworkInterceptor(networkInterceptor)
                        .addInterceptor(loggingInterceptor)
                        .build();

                // Configure GSON
                Gson gson = new GsonBuilder()
                        .registerTypeAdapter(Date.class, new DateDeserializer())
                        .create();


                // Retrofit Builder
                Retrofit.Builder builder = new Retrofit
                        .Builder()
                        .baseUrl(PLANT_API_URL)
                        .client(client)
                        .addConverterFactory(GsonConverterFactory.create(gson));
                // Set NewsApi instance
                plantApi = builder.build().create(PlantApi.class);
                sInstance = new PlantApiClient();
            }
        }
        return sInstance;
    }


    public LiveData<List<Plant>> getPlants() {
        final MutableLiveData<List<Plant>> networkPlantsData = new MutableLiveData<>();

        Call<PlantResponseWrapper> networkCall = plantApi.getPlantData();

        networkCall.enqueue(new Callback<PlantResponseWrapper>() {
            @Override
            public void onResponse(@NonNull Call<PlantResponseWrapper> call, @NonNull retrofit2.Response<PlantResponseWrapper> response) {
                if (response.raw().cacheResponse() != null) {

                }

                if (response.raw().networkResponse() != null) {

                }
                if (response.body() != null) {
                    List<Plant> plants = response.body().getPlantList();
                    networkPlantsData.setValue(plants);
                }
            }

            @Override
            public void onFailure(@NonNull Call<PlantResponseWrapper> call, @NonNull Throwable t) {

            }
        });
        return networkPlantsData;
    }





}
