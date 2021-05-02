package com.dbtechprojects.gamedeals.util.testsuites

import com.dbtechprojects.gamedeals.api.ApiIsolationTests
import com.dbtechprojects.gamedeals.database.RoomDataBaseIsolationTests

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    RoomDataBaseIsolationTests::class,
    ApiIsolationTests::class
)
class DataIsolationTests {
}