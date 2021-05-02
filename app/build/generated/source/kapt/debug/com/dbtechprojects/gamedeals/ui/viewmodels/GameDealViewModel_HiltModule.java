package com.dbtechprojects.gamedeals.ui.viewmodels;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = GameDealViewModel.class
)
public interface GameDealViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.dbtechprojects.gamedeals.ui.viewmodels.GameDealViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(GameDealViewModel_AssistedFactory factory);
}
