package com.dbtechprojects.gamedeals.database

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.dbtechprojects.gamedeals.launchFragmentInHiltContainer
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.GameStore
import com.dbtechprojects.gamedeals.ui.fragments.GameFragment
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import junit.framework.Assert.assertEquals
import junit.framework.TestCase
import kotlinx.coroutines.*
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject
import javax.inject.Named

@ExperimentalCoroutinesApi
@SmallTest
@HiltAndroidTest
class RoomDataBaseIsolationTests {


    @get: Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    @Named("test_db")  // annotate with name to let hilt know to inject our Test Db
     lateinit var gameDatabase: GameDatabase
     lateinit var gameDao: GameDAO

    @Before
    fun setUp() {
        hiltRule.inject()
        gameDao = gameDatabase.gameDao()
    }

    @After
    fun closeDb() {
        gameDatabase.close()
    }


    @Test
     fun insertGameItem() {
        val testGame = Game(
            id = null,
            gameID = "104019",
            cheapestDealID = "M0ZWRMmjBKTNKBlDoqCv1fvQHpcOvXmc0V%2BazwIc9%2Bo%3D",
            cheapest = "5.99",
            external = "The Snow Fable",
            internalName = "THESNOWFABLE",
            thumb = "https://gamersgatep.imgix.net/a/9/1/a4a09dfc8da48014289c1e9b7c42fdea9565c19a.jpg?auto=format",
            saved = null,
            steamAppID = null,
            timestamp = null

        )
            GlobalScope.launch(Dispatchers.IO) {
                gameDao.insertgames(testGame)
            }


        val roomItemRetrieve = testGame.external?.let { gameDao.getAllGames(it) }
        assertEquals(roomItemRetrieve != null, true)

    }

    @Test
    fun insertRoomDetailsItem() = runBlocking {

        val testGame = GameStore(
            id = null,
            internalName = "SHADOWTACTICSBLADESOFTHESHOGUN",
            title = "Shadow Tactics: Blades of the Shogun",
            metacriticLink = null,
            metacriticScore = null,
            dealID = "j2lexFQ%2Fx%2FOeqECYZgxWgBxj7YX3hcQs0N3Y8mn8kHk%3",
            storeID = "1",
            thumb = "https://cdn.cloudflare.steamstatic.com/steam/apps/418240/capsule_sm_120.jpg?t=1616710093",
            dealRating = null,
            gameID = null,
            lastChange = null,
            steamAppID = null,
            steamRatingCount = null,
            steamRatingPercent = null,
            steamRatingText = null,
            salePrice = null,
            savings = null,
            isOnSale = null,
            normalPrice = null,
            releaseDate = null

        )

        gameDao.insertstoredeal(testGame)

        val roomItemRetrieve = testGame.storeID?.let { gameDao.getAllGamesFromStore(it) }
        assertEquals(roomItemRetrieve != null, true)
    }

}