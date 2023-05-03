package com.example.android4lesson5dz.models


data class CharacterAndLocationModel(
    val character: CharacterModel,
    val location: LocationModel,
    val id: Int = 0,
)