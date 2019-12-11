package dev.savvyprogrammer.openfarmer.network;

import java.util.List;

import dev.savvyprogrammer.openfarmer.model.Plant;
import dev.savvyprogrammer.openfarmer.model.PlantResponseWrapper;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;


public interface PlantApi {

    String API_KEY = "fa615a25b53e9af11246e09cea688073";

    @Headers("X-Api-Key:" + API_KEY)
    @GET("/api/v1/plants")
    Call<PlantResponseWrapper> getPlantData();
}
