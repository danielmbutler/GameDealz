package com.dbtechprojects.gamedeals.ui.viewmodels

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.dbtechprojects.gamedeals.repository.FakeRepository
import com.dbtechprojects.gamedeals.util.JsonResource
import com.dbtechprojects.gamedeals.util.getOrAwaitValue
import junit.framework.TestCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainTestViewModel() : TestCase() {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: MainViewModel

    // setup viewModel with Fake Repository
    @Before
    fun setup() {
        viewModel = MainViewModel(FakeRepository())
    }

    @Test
    fun get_Games_From_Fake_Repository() {

            val test = viewModel.getgames().getOrAwaitValue()
            System.out.println(test.data?.get(3))
            System.out.println(JsonResource.getGames()[3].external)
            assertEquals(test.data?.get(3)?.external == (JsonResource.getGames())[3].external, true)
    }
}