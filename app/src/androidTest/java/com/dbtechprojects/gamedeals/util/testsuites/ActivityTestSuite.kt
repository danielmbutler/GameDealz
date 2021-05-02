package com.dbtechprojects.gamedeals.util.testsuites

import com.dbtechprojects.gamedeals.ui.activities.GameDealActivityTest
import com.dbtechprojects.gamedeals.ui.activities.MainActivityTest
import com.dbtechprojects.gamedeals.ui.activities.SettingsActivityTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    SettingsActivityTest::class,
    GameDealActivityTest::class
)

class ActivityTestSuite {
}