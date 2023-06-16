package com.example.faceup.utils

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Article(
    val tittle: String,
    val description: String,
    val photo: Int
) : Parcelable
