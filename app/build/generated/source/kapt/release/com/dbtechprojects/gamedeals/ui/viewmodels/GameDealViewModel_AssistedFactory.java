package com.dbtechprojects.gamedeals.ui.viewmodels;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dbtechprojects.gamedeals.repository.DefaultRepository;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class GameDealViewModel_AssistedFactory implements ViewModelAssistedFactory<GameDealViewModel> {
  private final Provider<DefaultRepository> repository;

  @Inject
  GameDealViewModel_AssistedFactory(Provider<DefaultRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public GameDealViewModel create(SavedStateHandle arg0) {
    return new GameDealViewModel(repository.get());
  }
}
