package com.dbtechprojects.gamedeals.util

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager


object Constants {
    const val BASE_URL = "https://www.cheapshark.com/api/1.0/"

    //stores

    val chars = mapOf("Steam" to "1", "GamersGate" to "2", "GreenManGaming" to "3",
        "Direct2Drive" to "6", "GOG" to "7", "Origin" to "8", "Humble Store" to "11", "Uplay" to "13",
        "WinGameStore" to "21",
    )

    fun returnStore(store: String) : String? {
        if (chars.containsKey(store)) {

            return chars.get(store)
        } else {

            return "error"
        }
    }



}
