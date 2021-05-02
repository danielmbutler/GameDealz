package com.dbtechprojects.gamedeals.database;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.dbtechprojects.gamedeals.HiltTestActivity;
import com.dbtechprojects.gamedeals.data.GameApi;
import com.dbtechprojects.gamedeals.di.AppModule;
import com.dbtechprojects.gamedeals.di.AppModule_ProvideDataStoreFactory;
import com.dbtechprojects.gamedeals.di.AppModule_ProvideGameApiFactory;
import com.dbtechprojects.gamedeals.di.AppModule_ProvideGameDaoFactory;
import com.dbtechprojects.gamedeals.di.AppModule_ProvideMainRepositoryFactory;
import com.dbtechprojects.gamedeals.di.TestAppModule;
import com.dbtechprojects.gamedeals.di.TestAppModule_ProvideInMemoryDbFactory;
import com.dbtechprojects.gamedeals.repository.MainRepository;
import com.dbtechprojects.gamedeals.ui.activities.BaseApplication;
import com.dbtechprojects.gamedeals.ui.activities.GameDealActivity;
import com.dbtechprojects.gamedeals.ui.activities.MainActivity;
import com.dbtechprojects.gamedeals.ui.activities.SettingsActivity;
import com.dbtechprojects.gamedeals.ui.fragments.GameFragment;
import com.dbtechprojects.gamedeals.ui.fragments.SavedDealsFragment;
import com.dbtechprojects.gamedeals.ui.fragments.StoreFragment;
import com.dbtechprojects.gamedeals.ui.viewmodels.GameDealViewModel_AssistedFactory;
import com.dbtechprojects.gamedeals.ui.viewmodels.GameDealViewModel_AssistedFactory_Factory;
import com.dbtechprojects.gamedeals.ui.viewmodels.GameStoreViewModel_AssistedFactory;
import com.dbtechprojects.gamedeals.ui.viewmodels.GameStoreViewModel_AssistedFactory_Factory;
import com.dbtechprojects.gamedeals.ui.viewmodels.MainViewModel_AssistedFactory;
import com.dbtechprojects.gamedeals.ui.viewmodels.MainViewModel_AssistedFactory_Factory;
import com.dbtechprojects.gamedeals.ui.viewmodels.SavedDealViewModel_AssistedFactory;
import com.dbtechprojects.gamedeals.ui.viewmodels.SavedDealViewModel_AssistedFactory_Factory;
import com.dbtechprojects.gamedeals.ui.viewmodels.SettingsViewModel_AssistedFactory;
import com.dbtechprojects.gamedeals.ui.viewmodels.SettingsViewModel_AssistedFactory_Factory;
import com.dbtechprojects.gamedeals.util.LocalStorage;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC extends RoomDataBaseIsolationTests_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object gameApi = new MemoizedSentinel();

  private volatile Object mainRepository = new MemoizedSentinel();

  private volatile Provider<MainRepository> provideMainRepositoryProvider;

  private DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private GameDatabase namedGameDatabase() {
    return TestAppModule_ProvideInMemoryDbFactory.provideInMemoryDb(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private GameApi gameApi() {
    Object local = gameApi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gameApi;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideGameApiFactory.provideGameApi();
          gameApi = DoubleCheck.reentrantCheck(gameApi, local);
        }
      }
    }
    return (GameApi) local;
  }

  private GameDAO gameDAO() {
    return AppModule_ProvideGameDaoFactory.provideGameDao(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private LocalStorage localStorage() {
    return AppModule_ProvideDataStoreFactory.provideDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private MainRepository mainRepository() {
    Object local = mainRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = mainRepository;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideMainRepositoryFactory.provideMainRepository(gameApi(), gameDAO(), localStorage());
          mainRepository = DoubleCheck.reentrantCheck(mainRepository, local);
        }
      }
    }
    return (MainRepository) local;
  }

  private Provider<MainRepository> mainRepositoryProvider() {
    Object local = provideMainRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideMainRepositoryProvider = (Provider<MainRepository>) local;
    }
    return (Provider<MainRepository>) local;
  }

  @Override
  public void injectTest(RoomDataBaseIsolationTests roomDataBaseIsolationTests) {
    injectRoomDataBaseIsolationTests(roomDataBaseIsolationTests);
  }

  @Override
  public void injectBaseApplication(BaseApplication arg0) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  @CanIgnoreReturnValue
  private RoomDataBaseIsolationTests injectRoomDataBaseIsolationTests(
      RoomDataBaseIsolationTests instance) {
    RoomDataBaseIsolationTests_MembersInjector.injectGameDatabase(instance, namedGameDatabase());
    return instance;
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder testAppModule(TestAppModule testAppModule) {
      Preconditions.checkNotNull(testAppModule);
      return this;
    }

    public RoomDataBaseIsolationTests_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements RoomDataBaseIsolationTests_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public RoomDataBaseIsolationTests_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends RoomDataBaseIsolationTests_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements RoomDataBaseIsolationTests_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity arg0) {
        this.activity = Preconditions.checkNotNull(arg0);
        return this;
      }

      @Override
      public RoomDataBaseIsolationTests_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends RoomDataBaseIsolationTests_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<GameDealViewModel_AssistedFactory> gameDealViewModel_AssistedFactoryProvider;

      private volatile Provider<GameStoreViewModel_AssistedFactory> gameStoreViewModel_AssistedFactoryProvider;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private volatile Provider<SavedDealViewModel_AssistedFactory> savedDealViewModel_AssistedFactoryProvider;

      private volatile Provider<SettingsViewModel_AssistedFactory> settingsViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private GameDealViewModel_AssistedFactory gameDealViewModel_AssistedFactory() {
        return GameDealViewModel_AssistedFactory_Factory.newInstance(DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC.this.mainRepositoryProvider());
      }

      private Provider<GameDealViewModel_AssistedFactory> gameDealViewModel_AssistedFactoryProvider(
          ) {
        Object local = gameDealViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          gameDealViewModel_AssistedFactoryProvider = (Provider<GameDealViewModel_AssistedFactory>) local;
        }
        return (Provider<GameDealViewModel_AssistedFactory>) local;
      }

      private GameStoreViewModel_AssistedFactory gameStoreViewModel_AssistedFactory() {
        return GameStoreViewModel_AssistedFactory_Factory.newInstance(DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC.this.mainRepositoryProvider());
      }

      private Provider<GameStoreViewModel_AssistedFactory> gameStoreViewModel_AssistedFactoryProvider(
          ) {
        Object local = gameStoreViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          gameStoreViewModel_AssistedFactoryProvider = (Provider<GameStoreViewModel_AssistedFactory>) local;
        }
        return (Provider<GameStoreViewModel_AssistedFactory>) local;
      }

      private MainViewModel_AssistedFactory mainViewModel_AssistedFactory() {
        return MainViewModel_AssistedFactory_Factory.newInstance(DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC.this.mainRepositoryProvider());
      }

      private Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private SavedDealViewModel_AssistedFactory savedDealViewModel_AssistedFactory() {
        return SavedDealViewModel_AssistedFactory_Factory.newInstance(DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC.this.mainRepositoryProvider());
      }

      private Provider<SavedDealViewModel_AssistedFactory> savedDealViewModel_AssistedFactoryProvider(
          ) {
        Object local = savedDealViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          savedDealViewModel_AssistedFactoryProvider = (Provider<SavedDealViewModel_AssistedFactory>) local;
        }
        return (Provider<SavedDealViewModel_AssistedFactory>) local;
      }

      private SettingsViewModel_AssistedFactory settingsViewModel_AssistedFactory() {
        return SettingsViewModel_AssistedFactory_Factory.newInstance(DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC.this.mainRepositoryProvider());
      }

      private Provider<SettingsViewModel_AssistedFactory> settingsViewModel_AssistedFactoryProvider(
          ) {
        Object local = settingsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          settingsViewModel_AssistedFactoryProvider = (Provider<SettingsViewModel_AssistedFactory>) local;
        }
        return (Provider<SettingsViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> mapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return ImmutableMap.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>of("com.dbtechprojects.gamedeals.ui.viewmodels.GameDealViewModel", (Provider) gameDealViewModel_AssistedFactoryProvider(), "com.dbtechprojects.gamedeals.ui.viewmodels.GameStoreViewModel", (Provider) gameStoreViewModel_AssistedFactoryProvider(), "com.dbtechprojects.gamedeals.ui.viewmodels.MainViewModel", (Provider) mainViewModel_AssistedFactoryProvider(), "com.dbtechprojects.gamedeals.ui.viewmodels.SavedDealViewModel", (Provider) savedDealViewModel_AssistedFactoryProvider(), "com.dbtechprojects.gamedeals.ui.viewmodels.SettingsViewModel", (Provider) settingsViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory provideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC.this.applicationContextModule), mapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      private Set<ViewModelProvider.Factory> defaultActivityViewModelFactorySetOfViewModelProviderFactory(
          ) {
        return ImmutableSet.<ViewModelProvider.Factory>of(provideFactory());
      }

      @Override
      public Set<String> getViewModelKeys() {
        return ImmutableSet.<String>of();
      }

      @Override
      public ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new ViewModelCBuilder();
      }

      @Override
      public void injectHiltTestActivity(HiltTestActivity arg0) {
      }

      @Override
      public void injectGameDealActivity(GameDealActivity arg0) {
      }

      @Override
      public void injectMainActivity(MainActivity arg0) {
      }

      @Override
      public void injectSettingsActivity(SettingsActivity arg0) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC.this.applicationContextModule), ImmutableSet.<String>of(), new ViewModelCBuilder(), defaultActivityViewModelFactorySetOfViewModelProviderFactory(), ImmutableSet.<ViewModelProvider.Factory>of());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements RoomDataBaseIsolationTests_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment arg0) {
          this.fragment = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public RoomDataBaseIsolationTests_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends RoomDataBaseIsolationTests_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory provideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.mapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        private Set<ViewModelProvider.Factory> defaultFragmentViewModelFactorySetOfViewModelProviderFactory(
            ) {
          return ImmutableSet.<ViewModelProvider.Factory>of(provideFactory());
        }

        @Override
        public void injectGameFragment(GameFragment arg0) {
        }

        @Override
        public void injectSavedDealsFragment(SavedDealsFragment arg0) {
        }

        @Override
        public void injectStoreFragment(StoreFragment arg0) {
        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC.this.applicationContextModule), ImmutableSet.<String>of(), new ViewModelCBuilder(), ActivityCImpl.this.defaultActivityViewModelFactorySetOfViewModelProviderFactory(), defaultFragmentViewModelFactorySetOfViewModelProviderFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements RoomDataBaseIsolationTests_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View arg0) {
            this.view = Preconditions.checkNotNull(arg0);
            return this;
          }

          @Override
          public RoomDataBaseIsolationTests_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends RoomDataBaseIsolationTests_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements RoomDataBaseIsolationTests_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View arg0) {
          this.view = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public RoomDataBaseIsolationTests_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends RoomDataBaseIsolationTests_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.dbtechprojects.gamedeals.ui.viewmodels.GameDealViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.gameDealViewModel_AssistedFactory();

            case 1: // com.dbtechprojects.gamedeals.ui.viewmodels.GameStoreViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.gameStoreViewModel_AssistedFactory();

            case 2: // com.dbtechprojects.gamedeals.ui.viewmodels.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.mainViewModel_AssistedFactory();

            case 3: // com.dbtechprojects.gamedeals.ui.viewmodels.SavedDealViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.savedDealViewModel_AssistedFactory();

            case 4: // com.dbtechprojects.gamedeals.ui.viewmodels.SettingsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.settingsViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }

    private final class ViewModelCBuilder implements RoomDataBaseIsolationTests_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle arg0) {
        this.savedStateHandle = Preconditions.checkNotNull(arg0);
        return this;
      }

      @Override
      public RoomDataBaseIsolationTests_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends RoomDataBaseIsolationTests_HiltComponents.ViewModelC {
      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return ImmutableMap.<String, Provider<ViewModel>>of();
      }
    }
  }

  private final class ServiceCBuilder implements RoomDataBaseIsolationTests_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service arg0) {
      this.service = Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public RoomDataBaseIsolationTests_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends RoomDataBaseIsolationTests_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.dbtechprojects.gamedeals.repository.MainRepository 
        return (T) DaggerRoomDataBaseIsolationTests_HiltComponents_SingletonC.this.mainRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
