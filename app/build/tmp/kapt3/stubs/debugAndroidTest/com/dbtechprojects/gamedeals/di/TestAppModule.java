package com.dbtechprojects.gamedeals.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/dbtechprojects/gamedeals/di/TestAppModule;", "", "()V", "provideInMemoryDb", "Lcom/dbtechprojects/gamedeals/database/GameDatabase;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class TestAppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.dbtechprojects.gamedeals.di.TestAppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "test_db")
    @dagger.Provides()
    public final com.dbtechprojects.gamedeals.database.GameDatabase provideInMemoryDb(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    private TestAppModule() {
        super();
    }
}