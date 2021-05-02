package com.dbtechprojects.gamedeals.repository
import com.dbtechprojects.gamedeals.data.Resource
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.GameStore
import com.dbtechprojects.gamedeals.util.JsonResource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flow

class FakeRepository()  : MainRepository {

    // get fake game list
    override fun search(Title: String): Flow<Resource<List<Game>>> {
        return flow {
            while (true){
                val games = JsonResource.getGames()
                emit(Resource.Success(games))
                kotlinx.coroutines.delay(5000)
            }
        }




    }

    override fun storeSearch(storeid: String): Flow<Resource<List<GameStore>>> {
        TODO("Not yet implemented")
    }

    override fun getSavedDeals(): Flow<List<Game>> {
        TODO("Not yet implemented")
    }

    override suspend fun saveGameDeal(game: Game) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteSearchCache() {
        TODO("Not yet implemented")
    }

    override fun getGamesFromDB(title: String): Flow<List<Game>> {
        return flow {
            while (true){
                val games = JsonResource.getGames()
                emit(games)
                kotlinx.coroutines.delay(5000)
            }
        }
    }

    override fun getLastThirtyStoreDeals(): Flow<List<GameStore>> {
        TODO("Not yet implemented")
    }

    override suspend fun storeSearchTerm(term: String) {
        TODO("Not yet implemented")
    }

    override fun getSearchTerm(): Flow<String> {
        TODO("Not yet implemented")
    }
}