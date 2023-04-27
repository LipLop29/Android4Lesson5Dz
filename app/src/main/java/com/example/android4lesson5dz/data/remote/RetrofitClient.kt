package com.example.android4lesson5dz.data.remote

import com.example.android4lesson5dz.data.remote.apiserveces.CharacterApiService
import com.example.android4lesson5dz.data.remote.apiserveces.LocationApiService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {

    private var OkHttpClient = OkHttpClient().newBuilder()
        .connectTimeout(30, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS).build()

    private val retrofitClient = Retrofit.Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(OkHttpClient)
        .build()

    fun provideCharacterApiServices(): CharacterApiService {
        return retrofitClient.create(CharacterApiService::class.java)
    }

    fun provideLocationApiService(): LocationApiService {
        return retrofitClient.create(LocationApiService::class.java)
    }
}