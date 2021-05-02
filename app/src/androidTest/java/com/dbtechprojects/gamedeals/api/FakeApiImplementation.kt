package com.dbtechprojects.gamedeals.api

import com.dbtechprojects.gamedeals.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object FakeApiImplementation {
    fun provideGameApi(): FakeApi = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(FakeApi::class.java)
}