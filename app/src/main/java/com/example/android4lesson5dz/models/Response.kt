package com.example.android4lesson5dz.models

import com.google.gson.annotations.SerializedName

data class Response<T>(
    @SerializedName("results")
    val results: ArrayList<T>
)