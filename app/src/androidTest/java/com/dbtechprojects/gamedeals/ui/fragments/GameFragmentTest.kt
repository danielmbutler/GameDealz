package com.dbtechprojects.gamedeals.ui.fragments

import android.content.Context
import android.util.Log
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.TypeTextAction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.MediumTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.dbtechprojects.gamedeals.EspressoIdlingResource
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.launchFragmentInHiltContainer
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.repository.DefaultRepository
import com.dbtechprojects.gamedeals.repository.FakeRepository
import com.dbtechprojects.gamedeals.ui.activities.MainActivity
import com.dbtechprojects.gamedeals.ui.adapters.GameListAdapter
import com.dbtechprojects.gamedeals.ui.adapters.GameViewHolder
import com.dbtechprojects.gamedeals.ui.viewmodels.MainViewModel
import com.dbtechprojects.gamedeals.util.JsonResource
import com.dbtechprojects.gamedeals.util.getOrAwaitValue
import com.dbtechprojects.gamedeals.util.getText
import com.dbtechprojects.gamedeals.util.replace
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import java.util.EnumSet.allOf

@MediumTest
@HiltAndroidTest
@ExperimentalCoroutinesApi
class GameFragmentTest {

    @get: Rule
    var hiltRule = HiltAndroidRule(this)



    @Before
    fun setup() {
        hiltRule.inject()
    }


    // test if search button is display
    // confirms game fragment is loaded
    @Test
    fun test_Is_Search_Button_IsDisplayed() {
        launchFragmentInHiltContainer<GameFragment> {
        }

        onView(withId(R.id.GameFragementSearchButton))
            .check(matches(isDisplayed()))
    }




//    @Test
//    fun submitSearchandNavigateToDealFragmentTest() {
//
//
//        launchFragmentInHiltContainer<GameFragment> {
//        }
//        // add text to searchView
//        onView(withId(R.id.GameFragmentSearchBar))
//            .perform(TypeTextAction("Zombie"))
//
//        // click searchButton
//        onView(withId(R.id.GameFragementSearchButton))
//            .perform(click())
//
//        // confirm RecyclerView in view and that placeholders are GONE
//        onView(withId(R.id.GamesRecyclerView))
//            .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//
//        //click on first Item
//        onView(withId(R.id.GamesRecyclerView))
//            .perform(RecyclerViewActions.actionOnItemAtPosition<GameViewHolder>(
//                0, click()
//            ))
//
//        // confirm a text view within the deal fragment is in view
//        onView(withId(R.id.GameDealTextView))
//            .check(matches(isDisplayed()))
//
//        // get text from item
//
//        val gameTitleResult = onView(withId(R.id.GameDealTextView))
//        val gameTitleText = getText(gameTitleResult) // test helper in util package get Text from ViewInteraction
//
//        // click save deal
//
//        onView(withId(R.id.GameDealSaveDealButton))
//            .perform(click())
//
//
//        // close activity
//        pressBack()
//
//        // navigate to saved deals fragment
//
//        // click saved deals fragment
//        onView(withId(R.id.Menu_Item_SavedDealsFragment)).perform(click())
//
//        // check if saved game is in recyclerview
//        onView(withId(R.id.SavedGamesRecyclerView))
//            .check(matches(withSubstring(gameTitleText)))
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }



}