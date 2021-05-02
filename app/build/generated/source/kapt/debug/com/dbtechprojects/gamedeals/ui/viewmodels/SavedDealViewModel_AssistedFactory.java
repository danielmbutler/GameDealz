package com.dbtechprojects.gamedeals.ui.viewmodels;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.dbtechprojects.gamedeals.repository.MainRepository;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class SavedDealViewModel_AssistedFactory implements ViewModelAssistedFactory<SavedDealViewModel> {
  private final Provider<MainRepository> repository;

  @Inject
  SavedDealViewModel_AssistedFactory(Provider<MainRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public SavedDealViewModel create(SavedStateHandle arg0) {
    return new SavedDealViewModel(repository.get());
  }
}
