package com.androiddevs.shoppinglisttestingyt.data.remote.responses

/**
 * Created by Amalip on 2/6/2022.
 */
data class ImageResponse(
    val hits: List<ImageResult>,
    val total: Int,
    val totalHits: Int
)
