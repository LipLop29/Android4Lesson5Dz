package com.example.android4lesson5dz.ui.fragments

import com.example.android4lesson5dz.base.BaseViewModel
import com.example.android4lesson5dz.data.repositories.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RickAndMortyViewModel @Inject constructor(
    private val repository: CharacterRepository
) : BaseViewModel() {

    fun fetchCharacter() = repository.fetchCharacter()
}