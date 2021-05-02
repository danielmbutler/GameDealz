package com.dbtechprojects.gamedeals.di

import android.content.Context
import com.dbtechprojects.gamedeals.data.GameApi
import com.dbtechprojects.gamedeals.database.GameDAO
import com.dbtechprojects.gamedeals.database.GameDatabase
import com.dbtechprojects.gamedeals.repository.DefaultRepository
import com.dbtechprojects.gamedeals.repository.MainRepository
import com.dbtechprojects.gamedeals.util.Constants.BASE_URL
import com.dbtechprojects.gamedeals.util.LocalStorage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

    @Module
    @InstallIn(ApplicationComponent::class)
    object AppModule {

        @Singleton
        @Provides
        fun provideGameApi(): GameApi = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GameApi::class.java)

        @Provides
        fun provideGameDao(@ApplicationContext appContext: Context) : GameDAO {
            return GameDatabase.getDatabase(appContext).gameDao()
        }

        @Provides
        fun provideDataStore(@ApplicationContext appContext: Context): LocalStorage{
            return LocalStorage(context = appContext)
        }

        @Singleton
        @Provides
        fun provideMainRepository(api: GameApi, dao: GameDAO , datastore: LocalStorage): MainRepository = DefaultRepository(api, dao, datastore)




    }
