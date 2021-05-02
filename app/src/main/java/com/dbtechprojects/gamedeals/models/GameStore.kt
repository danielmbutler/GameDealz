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
@Entity(tableName = "storedeals", indices = (arrayOf(Index(value = arrayOf("gameID"), unique = true)))) // make GameID unique to stop duplicate games
data class GameStore(
    @PrimaryKey
    val id: Int?,

    @ColumnInfo(name = "dealID")
    @SerializedName("dealID")
    @JsonProperty("dealID")
    val dealID: String?,

    @ColumnInfo(name = "dealRating")
    @SerializedName("dealRating")
    @JsonProperty("dealRating")
    val dealRating: String?,

    @ColumnInfo(name = "gameID")
    @SerializedName("gameID")
    @JsonProperty("gameID")
    val gameID: String?,

    @ColumnInfo(name = "internalName")
    @SerializedName("internalName")
    @JsonProperty("internalName")
    val internalName: String?,

    @ColumnInfo(name = "isOnSale")
    @SerializedName("isOnSale")
    @JsonProperty("isOnSale")
    val isOnSale: String?,

    @ColumnInfo(name = "lastChange")
    @SerializedName("lastChange")
    @JsonProperty("lastChange")
    val lastChange: Int?,

    @ColumnInfo(name = "metacriticLink")
    @SerializedName("metacriticLink")
    @JsonProperty("metacriticLink")
    val metacriticLink: String?,

    @ColumnInfo(name = "metacriticScore")
    @SerializedName("metacriticScore")
    @JsonProperty("metacriticScore")
    val metacriticScore: String?,

    @ColumnInfo(name = "normalPrice")
    @SerializedName("normalPrice")
    @JsonProperty("normalPrice")
    val normalPrice: String?,

    @ColumnInfo(name = "releaseDate")
    @SerializedName("releaseDate")
    @JsonProperty("releaseDate")
    val releaseDate: Int?,

    @ColumnInfo(name = "salePrice")
    @SerializedName("salePrice")
    @JsonProperty("salePrice")
    val salePrice: String?,

    @ColumnInfo(name = "savings")
    @SerializedName("savings")
    @JsonProperty("savings")
    val savings: String?,

    @ColumnInfo(name = "steamAppID")
    @SerializedName("steamAppID")
    @JsonProperty("steamAppID")
    val steamAppID: String?,

    @ColumnInfo(name = "steamRatingCount")
    @SerializedName("steamRatingCount")
    @JsonProperty("steamRatingCount")
    val steamRatingCount: String?,

    @ColumnInfo(name = "steamRatingPercent")
    @SerializedName("steamRatingPercent")
    @JsonProperty("steamRatingPercent")
    val steamRatingPercent: String?,

    @ColumnInfo(name = "steamRatingText")
    @SerializedName("steamRatingText")
    @JsonProperty("steamRatingText")
    val steamRatingText: String?,

    @ColumnInfo(name = "storeID")
    @SerializedName("storeID")
    @JsonProperty("storeID")
    val storeID: String?,

    @ColumnInfo(name = "thumb")
    @SerializedName("thumb")
    @JsonProperty("thumb")
    val thumb: String?,

    @ColumnInfo(name = "title")
    @SerializedName("title")
    @JsonProperty("title")
    val title: String?
): Parcelable