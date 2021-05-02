package com.dbtechprojects.gamedeals.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J;\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ1\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/dbtechprojects/gamedeals/api/FakeApi;", "", "getGames", "Lretrofit2/Response;", "", "Lcom/dbtechprojects/gamedeals/models/Game;", "title", "", "limit", "", "exact", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getstoreDeals", "Lcom/dbtechprojects/gamedeals/models/GameStore;", "Storeid", "PageSize", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface FakeApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "games?")
    public abstract java.lang.Object getGames(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "title")
    java.lang.String title, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "exact")
    int exact, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.dbtechprojects.gamedeals.models.Game>>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "deals?")
    public abstract java.lang.Object getstoreDeals(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "storeID")
    java.lang.String Storeid, @retrofit2.http.Query(value = "pageSize")
    int PageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.dbtechprojects.gamedeals.models.GameStore>>> p2);
}