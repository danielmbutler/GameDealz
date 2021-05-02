package com.dbtechprojects.gamedeals.database

import androidx.room.*
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.GameStore
import kotlinx.coroutines.flow.Flow
import retrofit2.Call

@Dao
interface GameDAO {

    @Query("SELECT * FROM games WHERE IsSaved = 'true'")
    fun getSavedGames(): Flow<List<Game>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveDeal(game: Game)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertgames(game: Game)


    @Query("DELETE FROM games WHERE IsSaved = 'true'")
    suspend fun deleteAllSavedGames()

    @Query("DELETE FROM games WHERE isSaved = 'null'")
    suspend fun deleteAllgames()

    @Delete
    suspend fun deleteSavedDeal(game: Game)

    @Query("SELECT * FROM games WHERE internalName Like '%' || :query || '%'")
   fun getAllGames(query: String):Flow<List<Game>>

   @Query("SELECT * FROM games ORDER BY ID DESC LIMIT 30")
   fun getLastThirtyGames():Flow<List<Game>>

   @Query("SELECT * FROM storedeals ORDER BY ID DESC LIMIT 30")
   fun getLastThirtyStoreDeals():Flow<List<GameStore>>

   @Query("SELECT * FROM storedeals Where storeID Like :storeId")
   fun getAllGamesFromStore(storeId: String):Flow<List<GameStore>>

   @Query("DELETE FROM storedeals")
   suspend fun deleteAllGamesFromStore()

   @Insert(onConflict = OnConflictStrategy.IGNORE)
   suspend fun insertstoredeal(gameStore: GameStore)


}