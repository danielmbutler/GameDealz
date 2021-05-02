package com.dbtechprojects.gamedeals.repository

import android.util.Log
import com.dbtechprojects.gamedeals.data.Resource
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.GameStore
import com.dbtechprojects.gamedeals.util.networkBoundResource
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun search(Title: String) : Flow<Resource<List<Game>>>
    fun storeSearch(storeid: String): Flow<Resource<List<GameStore>>>
    fun getSavedDeals(): Flow<List<Game>>
    suspend fun saveGameDeal(game:Game)
    suspend fun deleteSearchCache()
    fun getGamesFromDB(title:String) : Flow<List<Game>>
    fun getLastThirtyStoreDeals(): Flow<List<GameStore>>
    suspend fun storeSearchTerm(term: String)
    fun getSearchTerm(): Flow<String>


}