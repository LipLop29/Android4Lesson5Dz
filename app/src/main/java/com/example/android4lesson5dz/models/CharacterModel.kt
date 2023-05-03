package com.example.android4lesson5dz.models

import com.google.gson.annotations.SerializedName

data class CharacterModel(

    @SerializedName("image")
    val image: String,

    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String
)