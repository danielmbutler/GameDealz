package com.dbtechprojects.gamedeals.ui.viewmodels

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.dbtechprojects.gamedeals.EspressoIdlingResource
import com.dbtechprojects.gamedeals.data.Resource
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.GameStore
import com.dbtechprojects.gamedeals.repository.DefaultRepository
import com.dbtechprojects.gamedeals.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

private var TAG = "GameViewModel"

class MainViewModel @ViewModelInject constructor(
    private val repository: MainRepository

) : ViewModel() {
    init {
        Log.i("ViewModel", "ViewModel created!")
    }


    private var mquery: String = ""
    private var mgamelist: List<Game> = listOf()

    fun setQuery(query: String){
        mquery = query
    }
    fun getQuery(): String{
        return mquery
    }

    fun setgameslist(list: List<Game>){
        mgamelist = list
        EspressoIdlingResource.decrement() // used for testing to show a job has completed
    }

    fun getgameslist(): List<Game>{
        return mgamelist
    }

    fun getgamesfromDB(title: String): LiveData<List<Game>> {
        return repository.getGamesFromDB(title).asLiveData()
    }


    fun getgames(): LiveData<Resource<List<Game>>> {
      Log.d("viewmodel", mquery)
      return repository.search(mquery).asLiveData()
    }

    fun storeSearchTerm(term: String){
        viewModelScope.launch(Dispatchers.IO) {
            repository.storeSearchTerm(term)
        }
    }

    fun getSearchTerm(): LiveData<String>{
        EspressoIdlingResource.increment() // used for testing to show a job has started
        return repository.getSearchTerm().asLiveData()
    }


    override fun onCleared() {
        super.onCleared()
        Log.i("ViewModel", "ViewModel destroyed!")
    }


}