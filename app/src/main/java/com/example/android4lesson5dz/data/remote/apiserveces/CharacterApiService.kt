package com.example.android4lesson5dz.data.remote.apiserveces

import com.example.android4lesson5dz.models.CharacterModel
import com.example.android4lesson5dz.models.Response
import retrofit2.http.GET

interface CharacterApiService {

    @GET("character")
    suspend fun fetchCharacters(): Response<CharacterModel>
}