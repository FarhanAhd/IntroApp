package com.example.introapp.network

import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//work breakdown structure -- tasks -- independently testable, discreet, small
data class MarsPhoto(
    val id: String,
    @Json(name = "img_src")
    val imgSrc: String
)


