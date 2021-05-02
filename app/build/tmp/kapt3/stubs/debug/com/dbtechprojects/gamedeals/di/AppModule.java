package com.dbtechprojects.gamedeals.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/dbtechprojects/gamedeals/di/AppModule;", "", "()V", "provideDataStore", "Lcom/dbtechprojects/gamedeals/util/LocalStorage;", "appContext", "Landroid/content/Context;", "provideGameApi", "Lcom/dbtechprojects/gamedeals/data/GameApi;", "provideGameDao", "Lcom/dbtechprojects/gamedeals/database/GameDAO;", "provideMainRepository", "Lcom/dbtechprojects/gamedeals/repository/MainRepository;", "api", "dao", "datastore", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.dbtechprojects.gamedeals.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.dbtechprojects.gamedeals.data.GameApi provideGameApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.dbtechprojects.gamedeals.database.GameDAO provideGameDao(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.dbtechprojects.gamedeals.util.LocalStorage provideDataStore(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.dbtechprojects.gamedeals.repository.MainRepository provideMainRepository(@org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.data.GameApi api, @org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.database.GameDAO dao, @org.jetbrains.annotations.NotNull()
    com.dbtechprojects.gamedeals.util.LocalStorage datastore) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}