package com.dbtechprojects.gamedeals.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.repository.DefaultRepository
import com.dbtechprojects.gamedeals.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GameDealViewModel @ViewModelInject constructor(
    private val repository: MainRepository,
) : ViewModel() {

    val savedGames: LiveData<List<Game>> = repository.getSavedDeals().asLiveData()

    fun saveGameDeal(game: Game){
        viewModelScope.launch(Dispatchers.IO) {
           repository.saveGameDeal(game)
        }
    }
}