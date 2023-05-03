package com.example.android4lesson5dz.extention

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.setImage(uri: String) {
    Glide.with(this)
        .load(uri)
        .into(this)
}