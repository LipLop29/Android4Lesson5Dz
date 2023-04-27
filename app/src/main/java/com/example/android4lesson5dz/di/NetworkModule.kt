package com.example.android4lesson5dz.di

import com.example.android4lesson5dz.data.remote.RetrofitClient
import com.example.android4lesson5dz.data.remote.apiserveces.CharacterApiService
import com.example.android4lesson5dz.data.remote.apiserveces.LocationApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    val retrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun providerCharacter(): CharacterApiService{
        return retrofitClient.provideCharacterApiServices()
    }

    @Singleton
    @Provides
    fun providerLocation(): LocationApiService{
        return retrofitClient.provideLocationApiService()
    }
}