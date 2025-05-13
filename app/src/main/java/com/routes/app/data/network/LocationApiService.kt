package com.routes.app.data.network

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

data class LocationRequest(
    val latitude: Double,
    val longitude: Double,
    val timestamp: Long
)

interface LocationApiService {
    @POST("ubicacion")
    suspend fun enviarUbicacion(@Body location: LocationRequest): Response<Void>
}