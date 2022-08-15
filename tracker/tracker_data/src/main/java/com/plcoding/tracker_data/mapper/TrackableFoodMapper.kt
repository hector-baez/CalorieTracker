package com.plcoding.tracker_data.mapper

import com.plcoding.tracker_data.remote.dto.Foods
import com.plcoding.tracker_domain.model.TrackableFood
import kotlin.math.roundToInt

fun Foods.toTrackableFood(): TrackableFood? {
    val carbsPer100g = foodNutrients[2].value.roundToInt()
//    val carbsPer100g = nutriments.carbohydrates100g.roundToInt()
    val proteinPer100g = foodNutrients[0].value.roundToInt()
//    val proteinPer100g = nutriments.proteins100g.roundToInt()
    val fatPer100g = foodNutrients[1].value.roundToInt()
//    val fatPer100g = nutriments.fat100g.roundToInt()
    val caloriesPer100g = foodNutrients[3].value.roundToInt()
//    val caloriesPer100g = nutriments.energyKcal100g.roundToInt()

    return TrackableFood(
        name = productName ?: return null,
        carbsPer100g = carbsPer100g,
        proteinPer100g = proteinPer100g,
        fatPer100g = fatPer100g,
        caloriesPer100g = caloriesPer100g,
        image = "https://images.openfoodfacts.org/images/products/002/571/392/1305/front_en.4.100.jpg"
    )
}