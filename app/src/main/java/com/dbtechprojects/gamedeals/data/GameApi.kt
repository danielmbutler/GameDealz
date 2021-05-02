package com.dbtechprojects.gamedeals.data

import androidx.lifecycle.LiveData
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.GameStore
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GameApi {
    @GET("games?")
    suspend fun getGames(
        @Query("title") title: String,
        @Query("limit") limit: Int,
        @Query("exact") exact: Int,
    ): List<Game>

    @GET("deals?")
    suspend fun getstoreDeals(
        @Query("storeID") Storeid: String,
        @Query("pageSize") PageSize: Int,
    ): List<GameStore>
}

//https://www.cheapshark.com/api/1.0/games?title=Fable&limit=1&exact=0
//https://www.cheapshark.com/api/1.0/deals?id=M0ZWRMmjBKTNKBlDoqCv1fvQHpcOvXmc0V%2BazwIc9%2Bo%3D
//https://www.cheapshark.com/api/1.0/deals?storeID=1
