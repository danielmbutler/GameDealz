package com.dbtechprojects.gamedeals.util.testsuites

import com.dbtechprojects.gamedeals.api.ApiIsolationTests
import com.dbtechprojects.gamedeals.database.RoomDataBaseIsolationTests
import com.dbtechprojects.gamedeals.ui.viewmodels.MainTestViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi

import org.junit.runner.RunWith
import org.junit.runners.Suite

@ExperimentalCoroutinesApi
@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainTestViewModel::class,
)
class FakeViewModelTests {
}