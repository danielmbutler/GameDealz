package com.dbtechprojects.gamedeals.repository

import android.util.Log
import androidx.lifecycle.MediatorLiveData
import com.dbtechprojects.gamedeals.data.GameApi
import com.dbtechprojects.gamedeals.data.Resource
import com.dbtechprojects.gamedeals.database.GameDAO
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.GameStore
import com.dbtechprojects.gamedeals.util.LocalStorage
import com.dbtechprojects.gamedeals.util.networkBoundResource
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import retrofit2.await
import retrofit2.awaitResponse
import javax.inject.Inject

class DefaultRepository  @Inject constructor(
    private val api: GameApi,
    private val gameDao: GameDAO,
    private val datastore: LocalStorage
): MainRepository  {


    override fun search(Title: String) = networkBoundResource(
    query = {
        Log.d("searching DB", Title.toString())
        gameDao.getAllGames(Title)
    },
    fetch = { games ->
        delay(2000)
        Log.d("searching Api", Title.toString())
        api.getGames(Title,50,0)

    },
    saveFetchResult = { games ->
        Log.d("test", games.toString())

        gameDao.deleteAllgames()

           for (game in games) {
              gameDao.insertgames(
                  game
              )
            }

    }
    )

    override fun storeSearch(storeid: String) = networkBoundResource(
        query = {
            Log.d("searching DB", storeid.toString())
            gameDao.getAllGamesFromStore(storeid)
        },
        fetch = {
            delay(2000)
            Log.d("searching Api", storeid.toString())
            api.getstoreDeals(storeid, 30)
        },
        saveFetchResult = { games ->
            Log.d("test", games.toString())

            gameDao.deleteAllGamesFromStore()

            for (storedeal in games) {
                gameDao.insertstoredeal(
                    storedeal
                )
            }

        }
    )


//
//    override suspend fun StoreSearch(Store: String): Resource<ArrayList<GameStore>>{
//        return try {
//            val response = api.getstoreDeals(Store,50).awaitResponse()
//            val result = response.body()
//            if(response.isSuccessful && result != null) {
//                Resource.Success(result)
//            } else {
//                Resource.Error()
//            }
//        } catch(e: Exception) {
//            Resource.Error(e)
//        }
//    }



    override fun getSavedDeals(): Flow<List<Game>>  = gameDao.getSavedGames()


     override suspend fun saveGameDeal(game: Game) {
        gameDao.saveDeal(game)
    }



    override suspend fun deleteSearchCache() {
        gameDao.deleteAllgames()
    }


    override fun getGamesFromDB(title: String): Flow<List<Game>> =  gameDao.getAllGames(title)
    override fun getLastThirtyStoreDeals(): Flow<List<GameStore>> = gameDao.getLastThirtyStoreDeals()

    override suspend fun storeSearchTerm(term: String){
        datastore.storeSearchTerm(term)
    }

    override fun getSearchTerm(): Flow<String> {
        return datastore.searchTermFlow
    }


}