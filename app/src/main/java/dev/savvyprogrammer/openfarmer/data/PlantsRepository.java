package dev.savvyprogrammer.openfarmer.data;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import java.util.List;

import dev.savvyprogrammer.openfarmer.model.Plant;
import dev.savvyprogrammer.openfarmer.network.PlantApiClient;

public class PlantsRepository {

    private static final Object LOCK = new Object();
    private static PlantsRepository sInstance;

    private final PlantApiClient plantApiClient;
    private final MutableLiveData<List<Plant>> networkPlantLiveData;


    // required private constructor for Singleton pattern
    private PlantsRepository(Context context) {
        plantApiClient = PlantApiClient.getInstance(context);
        networkPlantLiveData = new MutableLiveData<>();
        networkPlantLiveData.observeForever(plants -> {
            if (plants != null) {

            }
        });
    }

    public synchronized static PlantsRepository getInstance(Context context) {
        if (sInstance == null) {
            synchronized (LOCK) {
                sInstance = new PlantsRepository(context);
            }
        }
        return sInstance;
    }



    public LiveData<List<Plant>> getPlants() {
        System.out.println("I'll be free");
        final LiveData<List<Plant>> networkData = plantApiClient.getPlants();
        networkData.observeForever(new Observer<List<Plant>>() {
            @Override
            public void onChanged(@Nullable List<Plant> plants) {
                if (plants != null) {
                    networkPlantLiveData.setValue(plants);
                    networkData.removeObserver(this);
                }
            }
        });

        return networkData;
    }




}
