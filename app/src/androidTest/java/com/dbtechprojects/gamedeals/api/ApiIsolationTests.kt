package com.dbtechprojects.gamedeals.api

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import junit.framework.TestCase
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ApiIsolationTests : TestCase() {

    @Test
    fun test_Game_Api_Result_Not_Empty(){
        val api = FakeApiImplementation.provideGameApi()
        val test = runBlocking {
            api.getGames("test", 10, 0)
        }

        assertEquals(test.isSuccessful, true)
    }

    @Test
    fun test_Game_Store_Api_Result_Not_Empty(){
        val api = FakeApiImplementation.provideGameApi()
        val test = runBlocking {
            api.getstoreDeals("1", 1)
        }

        assertEquals(test.isSuccessful, true)
    }
}