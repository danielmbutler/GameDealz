package com.dbtechprojects.gamedeals.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006H&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H&J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00130\u00062\u0006\u0010\u0014\u001a\u00020\nH&J\"\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00130\u00062\u0006\u0010\u0016\u001a\u00020\nH&J\u0019\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/dbtechprojects/gamedeals/repository/MainRepository;", "", "deleteSearchCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGamesFromDB", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dbtechprojects/gamedeals/models/Game;", "title", "", "getLastThirtyStoreDeals", "Lcom/dbtechprojects/gamedeals/models/GameStore;", "getSavedDeals", "getSearchTerm", "saveGameDeal", "game", "(Lcom/dbtechprojects/gamedeals/models/Game;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/dbtechprojects/gamedeals/data/Resource;", "Title", "storeSearch", "storeid", "storeSearchTerm", "term", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MainRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.dbtechprojects.gamedeals.data.Resource<java.util.List<com.dbtechprojects.gamedeals.models.Game>>> search(@org.jetbrains.annotations.NotNull()
    java.lang.String Title);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.dbtechprojects.gamedeals.data.Resource<java.util.List<com.dbtechprojects.gamedeals.models.GameStore>>> storeSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String storeid);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dbtechprojects.gamedeals.models.Game>> getSavedDeals();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveGameDeal(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.models.Game game, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteSearchCache(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dbtechprojects.gamedeals.models.Game>> getGamesFromDB(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dbtechprojects.gamedeals.models.GameStore>> getLastThirtyStoreDeals();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object storeSearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> getSearchTerm();
}