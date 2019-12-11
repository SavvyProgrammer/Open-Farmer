package dev.savvyprogrammer.openfarmer.ui.dashboard;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import dev.savvyprogrammer.openfarmer.data.PlantsRepository;
import dev.savvyprogrammer.openfarmer.model.Plant;

public class DashboardViewModel extends AndroidViewModel {
    private PlantsRepository plantsRespository;


    public DashboardViewModel(@NonNull Application application) {
        super(application);
        plantsRespository = PlantsRepository.getInstance(application.getApplicationContext());

    }

    public LiveData<List<Plant>> getPlantsData() {
        return plantsRespository.getPlants();
    }


}