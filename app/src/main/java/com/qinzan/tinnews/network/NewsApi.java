package com.qinzan.tinnews.network;

import com.qinzan.tinnews.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApi {
    // https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=5b7951acbcbf4cbba894128bd6d3565c
    @GET("top-headlines")
    Call<NewsResponse> getTopHeadlines(@Query("country") String country);

    // https://newsapi.org/v2/everything?q=tesla&from=2022-09-12&sortBy=publishedAt&apiKey=5b7951acbcbf4cbba894128bd6d3565c
    @GET("everything")
    Call<NewsResponse> getEverything(
            @Query("q") String query, @Query("pageSize") int pageSize);
}
