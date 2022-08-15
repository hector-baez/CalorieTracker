package com.plcoding.tracker_data.remote.dto

import com.squareup.moshi.Json

data class Foods(
    val foodNutrients: List<FoodNutrients>,
    @field:Json(name = "description")
    val productName: String?
)

data class FoodNutrients(
    @field:Json(name = "nutrientId")
    val nutrientId: Int,
    @field:Json(name = "nutrientName")
    val nutrientName: String,
    @field:Json(name = "value")
    val value: Float
)