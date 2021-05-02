package com.dbtechprojects.gamedeals.database;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0017H\u0007J\b\u0010\u0019\u001a\u00020\u0017H\u0007J\b\u0010\u001a\u001a\u00020\u0017H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\u00118GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2 = {"Lcom/dbtechprojects/gamedeals/database/RoomDataBaseIsolationTests;", "", "()V", "gameDao", "Lcom/dbtechprojects/gamedeals/database/GameDAO;", "getGameDao", "()Lcom/dbtechprojects/gamedeals/database/GameDAO;", "setGameDao", "(Lcom/dbtechprojects/gamedeals/database/GameDAO;)V", "gameDatabase", "Lcom/dbtechprojects/gamedeals/database/GameDatabase;", "getGameDatabase$annotations", "getGameDatabase", "()Lcom/dbtechprojects/gamedeals/database/GameDatabase;", "setGameDatabase", "(Lcom/dbtechprojects/gamedeals/database/GameDatabase;)V", "hiltRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getHiltRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "setHiltRule", "(Ldagger/hilt/android/testing/HiltAndroidRule;)V", "closeDb", "", "insertGameItem", "insertRoomDetailsItem", "setUp", "app_debug"})
@dagger.hilt.android.testing.HiltAndroidTest()
@androidx.test.filters.SmallTest()
public final class RoomDataBaseIsolationTests {
    @org.jetbrains.annotations.NotNull()
    private dagger.hilt.android.testing.HiltAndroidRule hiltRule;
    @javax.inject.Inject()
    public com.dbtechprojects.gamedeals.database.GameDatabase gameDatabase;
    public com.dbtechprojects.gamedeals.database.GameDAO gameDao;
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final dagger.hilt.android.testing.HiltAndroidRule getHiltRule() {
        return null;
    }
    
    public final void setHiltRule(@org.jetbrains.annotations.NotNull()
    dagger.hilt.android.testing.HiltAndroidRule p0) {
    }
    
    @javax.inject.Named(value = "test_db")
    @java.lang.Deprecated()
    public static void getGameDatabase$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.gamedeals.database.GameDatabase getGameDatabase() {
        return null;
    }
    
    public final void setGameDatabase(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.database.GameDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dbtechprojects.gamedeals.database.GameDAO getGameDao() {
        return null;
    }
    
    public final void setGameDao(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.database.GameDAO p0) {
    }
    
    @org.junit.Before()
    public final void setUp() {
    }
    
    @org.junit.After()
    public final void closeDb() {
    }
    
    @org.junit.Test()
    public final void insertGameItem() {
    }
    
    @org.junit.Test()
    public final void insertRoomDetailsItem() {
    }
    
    public RoomDataBaseIsolationTests() {
        super();
    }
}