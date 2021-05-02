package com.dbtechprojects.gamedeals.ui.activities

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.TypeTextAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.MediumTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.dbtechprojects.gamedeals.R
import com.dbtechprojects.gamedeals.util.CustomToastMatcher
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import junit.framework.TestCase
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@MediumTest
@HiltAndroidTest
class SettingsActivityTest {

    //setup rule to launch activity before running tests
    // Hilt Rules
    @get: Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun setup() {
        hiltRule.inject()
    }


    @get: Rule
    val activityRule = ActivityScenarioRule(SettingsActivity::class.java)

    // test if search button is display
    // confirms game fragment is loaded
    @Test
    fun test_Is_ClearCacheButtonDisplayed() {

        onView(withId(R.id.SettingsCacheTitle))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_Dialog_Is_Displayed(){

        // check clear cache
        onView(withId(R.id.SettingsClearSGCBX))
            .perform(click())

        // click clear button
        onView(withId(R.id.SettingsConfirmBTN))
            .perform(click())

        // confirm Alert Dialog Shows

        onView(withSubstring("Are you sure"))
            .check(matches(isDisplayed()))

    }

    @Test
    fun test_toast_is_Shown(){

        // recreate to ensure check boxes are unticked
        activityRule.scenario.recreate()

        // click clear button
        onView(withId(R.id.SettingsConfirmBTN))
            .perform(click())

        //test if Toast is Displayed using custom toast matcher

        onView(withText("please check a tickbox"))
            .inRoot(CustomToastMatcher())
            .check(matches(isDisplayed()))



    }






}