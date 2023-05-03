package com.example.android4lesson5dz.data.remote.apiserveces

import com.example.android4lesson5dz.models.LocationModel
import com.example.android4lesson5dz.models.Response
import retrofit2.http.GET

interface LocationApiService {

    @GET("location")
    suspend fun fetchLocation(): Response<LocationModel>
}