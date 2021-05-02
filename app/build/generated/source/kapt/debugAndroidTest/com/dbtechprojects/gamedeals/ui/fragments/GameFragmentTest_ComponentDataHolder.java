package com.dbtechprojects.gamedeals.ui.fragments;

import androidx.test.core.app.ApplicationProvider;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.testing.TestComponentData;
import dagger.hilt.android.internal.testing.TestInjector;
import dagger.hilt.internal.GeneratedComponentManager;
import java.lang.SuppressWarnings;
import java.util.Collections;
import javax.annotation.Generated;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class GameFragmentTest_ComponentDataHolder {
  private GameFragmentTest_ComponentDataHolder() {
  }

  public static TestComponentData get() {
    return new TestComponentData(false, testInstance -> injectInternal((GameFragmentTest) testInstance), Collections.emptySet(), Collections.emptySet(), (modules, testInstance, autoAddModuleEnabled) -> DaggerGameFragmentTest_HiltComponents_SingletonC.builder()
        .applicationContextModule(new ApplicationContextModule(ApplicationProvider.getApplicationContext()))
        .build());
  }

  @SuppressWarnings("unchecked")
  private static void injectInternal(GameFragmentTest testInstance) {
    ((TestInjector<GameFragmentTest>) ((GeneratedComponentManager) ApplicationProvider.getApplicationContext()).generatedComponent()).injectTest(testInstance);
  }
}
