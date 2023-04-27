package com.example.android4lesson5dz.models

import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("next")
    val next: String = "",
    @SerializedName("pages")
    val pages: Int = 0,
    @SerializedName("prev")
    val prev: String,
    @SerializedName("count")
    val count: Int = 0
)