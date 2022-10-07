package com.plcoding.tracker_domain.use_case

import com.plcoding.core.domain.model.ActivityLevel
import com.plcoding.core.domain.model.Gender
import com.plcoding.core.domain.model.GoalType
import com.plcoding.core.domain.model.UserInfo
import com.plcoding.core.domain.preferences.Preferences
import com.plcoding.tracker_domain.model.MealType
import com.plcoding.tracker_domain.model.TrackableFood
import com.plcoding.tracker_domain.model.TrackedFood
import com.plcoding.tracker_domain.repository.TrackerRepository
import java.time.LocalDate
import kotlin.math.roundToInt

class TrackAuthKey(
    private val repository: TrackerRepository,
    private val preferences: Preferences
) {

    suspend operator fun invoke(): AuthToken{
        return repository.getAuthToken(preferences)
    }

    data class AuthToken(
        val authKey: String,
        val expiration: Long
    )
}