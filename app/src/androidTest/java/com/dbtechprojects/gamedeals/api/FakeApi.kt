package com.dbtechprojects.gamedeals.api

import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.GameStore
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface FakeApi {
    @GET("games?")
    suspend fun getGames(
        @Query("title") title: String,
        @Query("limit") limit: Int,
        @Query("exact") exact: Int,
    ): Response<List<Game>>

    @GET("deals?")
    suspend fun getstoreDeals(
        @Query("storeID") Storeid: String,
        @Query("pageSize") PageSize: Int,
    ): Response<List<GameStore>>


}