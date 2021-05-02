package com.dbtechprojects.gamedeals.di;

import android.content.Context;
import com.dbtechprojects.gamedeals.database.GameDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class TestAppModule_ProvideInMemoryDbFactory implements Factory<GameDatabase> {
  private final Provider<Context> contextProvider;

  public TestAppModule_ProvideInMemoryDbFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public GameDatabase get() {
    return provideInMemoryDb(contextProvider.get());
  }

  public static TestAppModule_ProvideInMemoryDbFactory create(Provider<Context> contextProvider) {
    return new TestAppModule_ProvideInMemoryDbFactory(contextProvider);
  }

  public static GameDatabase provideInMemoryDb(Context context) {
    return Preconditions.checkNotNullFromProvides(TestAppModule.INSTANCE.provideInMemoryDb(context));
  }
}
