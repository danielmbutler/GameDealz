// Generated by Dagger (https://dagger.dev).
package com.dbtechprojects.gamedeals.ui.viewmodels;

import com.dbtechprojects.gamedeals.repository.DefaultRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GameStoreViewModel_AssistedFactory_Factory implements Factory<GameStoreViewModel_AssistedFactory> {
  private final Provider<DefaultRepository> repositoryProvider;

  public GameStoreViewModel_AssistedFactory_Factory(
      Provider<DefaultRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GameStoreViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static GameStoreViewModel_AssistedFactory_Factory create(
      Provider<DefaultRepository> repositoryProvider) {
    return new GameStoreViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static GameStoreViewModel_AssistedFactory newInstance(
      Provider<DefaultRepository> repository) {
    return new GameStoreViewModel_AssistedFactory(repository);
  }
}