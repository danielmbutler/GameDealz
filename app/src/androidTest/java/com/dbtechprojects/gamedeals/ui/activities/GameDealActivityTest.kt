package com.dbtechprojects.gamedeals.ui.activities

import android.content.Context
import android.content.Intent
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.TypeTextAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.MediumTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.models.Game
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import junit.framework.TestCase
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@MediumTest
@HiltAndroidTest
class GameDealActivityTest {

    //setup rules to launch activity before running tests and setup hilt

    @get: Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @get: Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    // test if search button is display
    // confirms game fragment is loaded
    @Test
    fun test_GameDealFragment() {

        // create dummy game object

        val fakeGame = Game(
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

        // start GameDeal Activity
        val context = ApplicationProvider.getApplicationContext<Context>()
        val intent = Intent(context, GameDealActivity::class.java)
        intent.putExtra("gamedeal",fakeGame)
        context.startActivity(intent)


        // confirm title in view is title of fake game
        onView(withId(R.id.GameDealTextView))
            .check(matches(withText(fakeGame.external)))

        // confirm price

        onView(withId(R.id.GameDealPriceTV))
            .check(matches(withSubstring(fakeGame.cheapest)))
    }






}