package com.example.android4lesson5dz.data.remote.apiserveces

import com.example.android4lesson5dz.models.ResponseModel
import com.example.android4lesson5dz.models.ResultsItem
import retrofit2.http.GET
import retrofit2.http.Query

interface LocationApiService {

    @GET("location")
    suspend fun fetchLocation(
        @Query("page") page : Int
    ): ResponseModel<ResultsItem>
}