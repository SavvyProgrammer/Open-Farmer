package dev.savvyprogrammer.openfarmer.network;


import dev.savvyprogrammer.openfarmer.model.ArticleResponseWrapper;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface NewsApi {

    String API_KEY = "8b9c3a6aee7b4330af04c1234d7b7ac1";

    @Headers("X-Api-Key:" + API_KEY)
    @GET("/v2/everything")
    Call<ArticleResponseWrapper> getAgricultureNews(@Query("q") String searchTopic);
}
