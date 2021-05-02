package com.dbtechprojects.gamedeals.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.dbtechprojects.gamedeals.database.GameDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object TestAppModule {

    @Provides
    @Named("test_db")
    fun provideInMemoryDb(@ApplicationContext context: Context)
    = Room.inMemoryDatabaseBuilder(context, GameDatabase::class.java)
        .allowMainThreadQueries().build()
}