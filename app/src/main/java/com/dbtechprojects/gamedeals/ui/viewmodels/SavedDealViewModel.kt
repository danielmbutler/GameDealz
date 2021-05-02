package com.dbtechprojects.gamedeals.ui.viewmodels

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.GameStore
import com.dbtechprojects.gamedeals.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SavedDealViewModel @ViewModelInject constructor(
    private val repository: MainRepository,
) : ViewModel() {
    init {
        Log.i("ViewModel", "ViewModel created!")

    }

    private var mgamelist: List<Game> = listOf()


    val savedGames: LiveData<List<Game>> = repository.getSavedDeals().asLiveData()


    fun setGamesList(list: List<Game>){
        mgamelist = list
    }
    fun getGameList(): List<Game>{
        return mgamelist
    }


    fun removeSavedDeal(game: Game){
       viewModelScope.launch(Dispatchers.IO) {
           repository.saveGameDeal(game)
       }
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("ViewModel", "ViewModel destroyed!")
    }

}