package com.example.android4lesson5dz.data.repositories

import com.example.android4lesson5dz.base.BaseRepository
import com.example.android4lesson5dz.data.remote.apiserveces.CharacterApiService
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val characterApiService: CharacterApiService
) : BaseRepository() {

    fun fetchCharacter() {
        doRequest {
            characterApiService.fetchCharacters()
        }
    }
}