package com.example.apidemo.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retofit by lazy {
        Retrofit.Builder()
            .baseUrl(MyRestApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api:MyRestApi by lazy{
        retofit.create(MyRestApi::class.java)
    }
}