// Generated by Dagger (https://dagger.dev).
package com.dbtechprojects.gamedeals.ui.viewmodels;

import com.dbtechprojects.gamedeals.repository.DefaultRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GameDealViewModel_AssistedFactory_Factory implements Factory<GameDealViewModel_AssistedFactory> {
  private final Provider<DefaultRepository> repositoryProvider;

  public GameDealViewModel_AssistedFactory_Factory(Provider<DefaultRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GameDealViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static GameDealViewModel_AssistedFactory_Factory create(
      Provider<DefaultRepository> repositoryProvider) {
    return new GameDealViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static GameDealViewModel_AssistedFactory newInstance(
      Provider<DefaultRepository> repository) {
    return new GameDealViewModel_AssistedFactory(repository);
  }
}
