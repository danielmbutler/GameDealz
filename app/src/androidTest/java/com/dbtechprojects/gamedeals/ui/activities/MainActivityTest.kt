package com.dbtechprojects.gamedeals.ui.activities

import androidx.navigation.NavController
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.TypeTextAction
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.MediumTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.launchFragmentInHiltContainer
import com.dbtechprojects.gamedeals.ui.fragments.GameFragment
import com.google.android.material.navigation.NavigationView
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import junit.framework.TestCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import org.junit.Before
import org.junit.Rule
import org.junit.Test


import org.junit.runner.RunWith

@MediumTest
@HiltAndroidTest
@ExperimentalCoroutinesApi
class MainActivityTest {

    //setup rules to launch activity before running tests and setup hilt

    @get: Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @get: Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun confirm_Settings_Navigation(){



        //launch settings activity
        onView(withId(R.id.action_settings)).perform(click())

        //confirm settings is in view

        onView(withId(R.id.SettingsHelpButton))
            .check(matches(isDisplayed()))

        // navigate back
        Espresso.pressBack()

        // confirm game fragment is back in view.
        onView(withId(R.id.GameFragementSearchButton))
            .check(matches(isDisplayed()))
    }

    @Test
    fun confirm_Bottom_Navigation(){
        // click store fragment
        onView(withId(R.id.Menu_Item_StoreFragment)).perform(click())

        //confirm store fragment is in view
        onView(withId(R.id.StoreFragmentchipGroup))
            .check(matches(isDisplayed()))

        // click saved deals fragment
        onView(withId(R.id.Menu_Item_SavedDealsFragment)).perform(click())

        onView(withId(R.id.SavedGamesRecyclerView))
            .check(matches(isDisplayed()))
    }




}