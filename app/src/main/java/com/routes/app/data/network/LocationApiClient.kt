package com.routes.app.data.network

import android.provider.Settings.Global.getString
import com.routes.app.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object LocationApiClient {

    private const val BASE_URL = "https://tuservidor.com/api/"

    val service: LocationApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(LocationApiService::class.java)
    }
}
