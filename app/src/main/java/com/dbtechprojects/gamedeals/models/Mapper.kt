package com.dbtechprojects.gamedeals.models

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import org.json.JSONArray
import org.json.JSONObject

class Mapper {


    fun GameStoreToGame(Store: GameStore) : Game{
        val Game = Game(
            id = null,
            saved = null,
            cheapest = Store.salePrice ?: null,
            cheapestDealID = Store.dealID ?: null,
            thumb = Store.thumb ?: null,
            external = Store.title ?: null,
            gameID = Store.gameID ?: null,
            internalName = Store.internalName ?: null,
            steamAppID = Store.steamAppID ?: null,
            timestamp = null,
        )

        return Game
    }
}