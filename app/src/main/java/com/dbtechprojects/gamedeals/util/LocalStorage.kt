package com.dbtechprojects.gamedeals.util

import android.content.Context
import androidx.datastore.preferences.createDataStore
import androidx.datastore.preferences.edit
import androidx.datastore.preferences.preferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalStorage(context: Context) {

    // Create the dataStore and give it a name same as shared preferences
    private val dataStore = context.createDataStore(name = "searchterms")

    // Create some keys we will use them to store and retrieve the data
    companion object {
        val SEARCH_TERM = preferencesKey<String>("SEARCH_TERM")
    }

    // Store user data
    // refer to the data store and using edit
    // we can store values using the keys
    suspend fun storeSearchTerm(term: String) {
        dataStore.edit {
            it[SEARCH_TERM] = term

        }
    }

    // Create an age flow to retrieve age from the preferences
    // flow comes from the kotlin coroutine
    val searchTermFlow: Flow<String> = dataStore.data.map {
        it[SEARCH_TERM] ?: ""
    }

}