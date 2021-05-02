package com.dbtechprojects.gamedeals.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u0007H\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0016J\u0019\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00140\u00072\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\"\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00140\u00072\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0019\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/dbtechprojects/gamedeals/repository/FakeRepository;", "Lcom/dbtechprojects/gamedeals/repository/MainRepository;", "()V", "deleteSearchCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGamesFromDB", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dbtechprojects/gamedeals/models/Game;", "title", "", "getLastThirtyStoreDeals", "Lcom/dbtechprojects/gamedeals/models/GameStore;", "getSavedDeals", "getSearchTerm", "saveGameDeal", "game", "(Lcom/dbtechprojects/gamedeals/models/Game;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/dbtechprojects/gamedeals/data/Resource;", "Title", "storeSearch", "storeid", "storeSearchTerm", "term", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FakeRepository implements com.dbtechprojects.gamedeals.repository.MainRepository {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.dbtechprojects.gamedeals.data.Resource<java.util.List<com.dbtechprojects.gamedeals.models.Game>>> search(@org.jetbrains.annotations.NotNull()
    java.lang.String Title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.dbtechprojects.gamedeals.data.Resource<java.util.List<com.dbtechprojects.gamedeals.models.GameStore>>> storeSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String storeid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.dbtechprojects.gamedeals.models.Game>> getSavedDeals() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveGameDeal(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.models.Game game, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteSearchCache(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.dbtechprojects.gamedeals.models.Game>> getGamesFromDB(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.dbtechprojects.gamedeals.models.GameStore>> getLastThirtyStoreDeals() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object storeSearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.String> getSearchTerm() {
        return null;
    }
    
    public FakeRepository() {
        super();
    }
}