package com.dbtechprojects.gamedeals.ui.viewmodels;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dbtechprojects.gamedeals.repository.DefaultRepository;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class GameStoreViewModel_AssistedFactory implements ViewModelAssistedFactory<GameStoreViewModel> {
  private final Provider<DefaultRepository> repository;

  @Inject
  GameStoreViewModel_AssistedFactory(Provider<DefaultRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public GameStoreViewModel create(SavedStateHandle arg0) {
    return new GameStoreViewModel(repository.get());
  }
}
