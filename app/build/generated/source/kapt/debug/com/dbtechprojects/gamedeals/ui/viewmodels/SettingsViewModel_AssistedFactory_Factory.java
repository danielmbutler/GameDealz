// Generated by Dagger (https://dagger.dev).
package com.dbtechprojects.gamedeals.ui.viewmodels;

import com.dbtechprojects.gamedeals.repository.MainRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsViewModel_AssistedFactory_Factory implements Factory<SettingsViewModel_AssistedFactory> {
  private final Provider<MainRepository> repositoryProvider;

  public SettingsViewModel_AssistedFactory_Factory(Provider<MainRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SettingsViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static SettingsViewModel_AssistedFactory_Factory create(
      Provider<MainRepository> repositoryProvider) {
    return new SettingsViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static SettingsViewModel_AssistedFactory newInstance(Provider<MainRepository> repository) {
    return new SettingsViewModel_AssistedFactory(repository);
  }
}