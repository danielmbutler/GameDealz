package com.dbtechprojects.gamedeals.util
import com.dbtechprojects.gamedeals.models.Game

object JsonResource {

     fun getGames() : List<Game> {
         val list = mutableListOf<Game>()

          list.add(Game(
                 id = null,
                 gameID = "104019",
                 cheapestDealID = "M0ZWRMmjBKTNKBlDoqCv1fvQHpcOvXmc0V%2BazwIc9%2Bo%3D",
                 cheapest = "5.99",
                 external = "The Snow Fable",
                 internalName = "THESNOWFABLE",
                 thumb = "https://gamersgatep.imgix.net/a/9/1/a4a09dfc8da48014289c1e9b7c42fdea9565c19a.jpg?auto=format",
                 saved = null,
                 steamAppID = null,
                 timestamp = null

         ))
         list.add(Game(
             id = null,
             gameID = "104019",
             cheapestDealID = "M0ZWRMmjBKTNKBlDoqCv1fvQHpcOvXmc0V%2BazwIc9%2Bo%3D",
             cheapest = "5.99",
             external = "The Snow Fable",
             internalName = "THESNOWFABLE",
             thumb = "https://gamersgatep.imgix.net/a/9/1/a4a09dfc8da48014289c1e9b7c42fdea9565c19a.jpg?auto=format",
             saved = null,
             steamAppID = null,
             timestamp = null

         ))
         list.add(Game(
             id = null,
             gameID = "104019",
             cheapestDealID = "M0ZWRMmjBKTNKBlDoqCv1fvQHpcOvXmc0V%2BazwIc9%2Bo%3D",
             cheapest = "5.99",
             external = "The Snow Fable",
             internalName = "THESNOWFABLE",
             thumb = "https://gamersgatep.imgix.net/a/9/1/a4a09dfc8da48014289c1e9b7c42fdea9565c19a.jpg?auto=format",
             saved = null,
             steamAppID = null,
             timestamp = null

         ))
         list.add(Game(
             id = null,
             gameID = "149247",
             cheapestDealID = "M0ZWRMmjBKTNKBlDoqCv1fvQHpcOvXmc0V%2BazwIc9%2Bo%3D",
             cheapest = "9.99",
             external = "Eventide: Slavic Fable",
             internalName = "EVENTIDESLAVICFABLE",
             thumb = "https://cdn.cloudflare.steamstatic.com/steam/apps/406870/capsule_sm_120.jpg?t=1581942581",
             saved = null,
             steamAppID = null,
             timestamp = null
         ))



         return list

     }
}