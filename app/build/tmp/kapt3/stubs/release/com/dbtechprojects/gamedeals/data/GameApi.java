package com.dbtechprojects.gamedeals.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/dbtechprojects/gamedeals/data/GameApi;", "", "getGames", "", "Lcom/dbtechprojects/gamedeals/models/Game;", "title", "", "limit", "", "exact", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getstoreDeals", "Lcom/dbtechprojects/gamedeals/models/GameStore;", "Storeid", "PageSize", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface GameApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "games?")
    public abstract java.lang.Object getGames(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "title")
    java.lang.String title, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "exact")
    int exact, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.dbtechprojects.gamedeals.models.Game>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "deals?")
    public abstract java.lang.Object getstoreDeals(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "storeID")
    java.lang.String Storeid, @retrofit2.http.Query(value = "pageSize")
    int PageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.dbtechprojects.gamedeals.models.GameStore>> p2);
}