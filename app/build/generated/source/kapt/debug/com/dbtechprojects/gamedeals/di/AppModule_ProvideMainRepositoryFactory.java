// Generated by Dagger (https://dagger.dev).
package com.dbtechprojects.gamedeals.di;

import com.dbtechprojects.gamedeals.data.GameApi;
import com.dbtechprojects.gamedeals.database.GameDAO;
import com.dbtechprojects.gamedeals.repository.MainRepository;
import com.dbtechprojects.gamedeals.util.LocalStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideMainRepositoryFactory implements Factory<MainRepository> {
  private final Provider<GameApi> apiProvider;

  private final Provider<GameDAO> daoProvider;

  private final Provider<LocalStorage> datastoreProvider;

  public AppModule_ProvideMainRepositoryFactory(Provider<GameApi> apiProvider,
      Provider<GameDAO> daoProvider, Provider<LocalStorage> datastoreProvider) {
    this.apiProvider = apiProvider;
    this.daoProvider = daoProvider;
    this.datastoreProvider = datastoreProvider;
  }

  @Override
  public MainRepository get() {
    return provideMainRepository(apiProvider.get(), daoProvider.get(), datastoreProvider.get());
  }

  public static AppModule_ProvideMainRepositoryFactory create(Provider<GameApi> apiProvider,
      Provider<GameDAO> daoProvider, Provider<LocalStorage> datastoreProvider) {
    return new AppModule_ProvideMainRepositoryFactory(apiProvider, daoProvider, datastoreProvider);
  }

  public static MainRepository provideMainRepository(GameApi api, GameDAO dao,
      LocalStorage datastore) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMainRepository(api, dao, datastore));
  }
}
