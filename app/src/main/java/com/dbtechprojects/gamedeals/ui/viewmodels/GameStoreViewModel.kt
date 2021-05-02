package com.dbtechprojects.gamedeals.ui.viewmodels

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dbtechprojects.gamedeals.data.Resource
import com.dbtechprojects.gamedeals.models.Game
import com.dbtechprojects.gamedeals.models.GameStore
import com.dbtechprojects.gamedeals.repository.DefaultRepository
import com.dbtechprojects.gamedeals.repository.MainRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

const val VTAG = "GameStoreViewModel"
class GameStoreViewModel @ViewModelInject constructor(
    private val repository: MainRepository,
) : ViewModel() {
    init {
        Log.i("ViewModel", "ViewModel created!")

    }


    private var mquery: String = ""
    private var mgamelist: List<GameStore> = listOf()

    fun setQuery(query: String){
        mquery = query
    }
    fun getQuery(): String{
        return mquery
    }

    fun setgameslist(list: List<GameStore>){
        mgamelist = list
    }

    fun getstoredeallist(): List<GameStore>{
        return mgamelist
    }


    fun getstoredeals(): LiveData<Resource<List<GameStore>>> {
        Log.d("viewmodel", mquery)
        return repository.storeSearch(mquery).asLiveData()
    }

    fun getLastThirtyStoreDeals(): LiveData<List<GameStore>>{
        return repository.getLastThirtyStoreDeals().asLiveData()
    }

}