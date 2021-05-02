package com.dbtechprojects.gamedeals.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
@Parcelize
@Entity(tableName = "games", indices = (arrayOf(Index(value = arrayOf("gameID"), unique = true)))) // make GameID unique to stop duplicate games
data class Game(
    @PrimaryKey
    val id: Int?,

    @ColumnInfo(name = "isSaved")
    @SerializedName("isSaved")
    @JsonProperty("isSaved")
    var saved: String?,

    @ColumnInfo(name = "cheapest")
    @SerializedName("cheapest")
    @JsonProperty("cheapest")
    val cheapest: String?,

    @ColumnInfo(name = "timestamp")
    @SerializedName("timestamp")
    @JsonProperty("timestamp")
    val timestamp: String?,

    @ColumnInfo(name = "cheapestDealID")
    @SerializedName("cheapestDealID")
    @JsonProperty("cheapestDealID")
    val cheapestDealID: String?,

    @ColumnInfo(name = "external")
    @SerializedName("external")
    @JsonProperty("external")
    val external: String?,

    @ColumnInfo(name = "gameID")
    @SerializedName("gameID")
    @JsonProperty("gameID")
    val gameID: String?,

    @ColumnInfo(name = "internalName")
    @SerializedName("internalName")
    @JsonProperty("internalName")
    val internalName: String?,

    @ColumnInfo(name = "steamAppID")
    @SerializedName("steamAppID")
    @JsonProperty("steamAppID")
    val steamAppID: String?,

    @ColumnInfo(name = "thumb")
    @SerializedName("thumb")
    @JsonProperty("thumb")
    val thumb: String?
): Parcelable
