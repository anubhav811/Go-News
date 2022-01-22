package com.anubhav.newsapi_mvvmretrofit.api

import com.anubhav.newsapi_mvvmretrofit.models.NewsResponse
import com.anubhav.newsapi_mvvmretrofit.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode : String = "in",
        @Query("page")
        page : Int = 1,
        @Query("apiKey")
        apiKey:String = API_KEY
    ) : Response<NewsResponse>


    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        countryCode : String ,
        @Query("page")
        page : Int = 1,
        @Query("apiKey")
        apiKey:String = API_KEY
    ) : Response<NewsResponse>

}