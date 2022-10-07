package com.plcoding.core.domain.model

data class AuthTokenInfo(
    val auth_token: String,
    val auth_expiration: Long,
)
