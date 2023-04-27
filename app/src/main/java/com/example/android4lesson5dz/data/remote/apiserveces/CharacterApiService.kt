package com.example.android4lesson5dz.data.remote.apiserveces

import com.example.android4lesson5dz.models.ResponseModel
import com.example.android4lesson5dz.models.ResultsItem
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterApiService {

    @GET("character")
    suspend fun fetchCharacters(): ResponseModel<ResultsItem>
}