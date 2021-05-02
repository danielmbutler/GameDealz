package com.dbtechprojects.gamedeals.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0006\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\f2\u0006\u0010\u0012\u001a\u00020\u000fH\'J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\fH\'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\fH\'J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\fH\'J\u0019\u0010\u0016\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/dbtechprojects/gamedeals/database/GameDAO;", "", "deleteAllGamesFromStore", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllSavedGames", "deleteAllgames", "deleteSavedDeal", "game", "Lcom/dbtechprojects/gamedeals/models/Game;", "(Lcom/dbtechprojects/gamedeals/models/Game;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllGames", "Lkotlinx/coroutines/flow/Flow;", "", "query", "", "getAllGamesFromStore", "Lcom/dbtechprojects/gamedeals/models/GameStore;", "storeId", "getLastThirtyGames", "getLastThirtyStoreDeals", "getSavedGames", "insertgames", "insertstoredeal", "gameStore", "(Lcom/dbtechprojects/gamedeals/models/GameStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveDeal", "app_debug"})
public abstract interface GameDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM games WHERE IsSaved = \'true\'")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dbtechprojects.gamedeals.models.Game>> getSavedGames();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveDeal(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.models.Game game, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertgames(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.models.Game game, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM games WHERE IsSaved = \'true\'")
    public abstract java.lang.Object deleteAllSavedGames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM games WHERE isSaved = \'null\'")
    public abstract java.lang.Object deleteAllgames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteSavedDeal(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.models.Game game, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM games WHERE internalName Like \'%\' || :query || \'%\'")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dbtechprojects.gamedeals.models.Game>> getAllGames(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM games ORDER BY ID DESC LIMIT 30")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dbtechprojects.gamedeals.models.Game>> getLastThirtyGames();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM storedeals ORDER BY ID DESC LIMIT 30")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dbtechprojects.gamedeals.models.GameStore>> getLastThirtyStoreDeals();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM storedeals Where storeID Like :storeId")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dbtechprojects.gamedeals.models.GameStore>> getAllGamesFromStore(@org.jetbrains.annotations.NotNull()
    java.lang.String storeId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM storedeals")
    public abstract java.lang.Object deleteAllGamesFromStore(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insertstoredeal(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.models.GameStore gameStore, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}