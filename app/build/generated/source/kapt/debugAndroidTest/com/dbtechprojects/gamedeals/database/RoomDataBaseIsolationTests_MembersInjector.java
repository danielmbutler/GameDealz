package com.dbtechprojects.gamedeals.database;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Named;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomDataBaseIsolationTests_MembersInjector implements MembersInjector<RoomDataBaseIsolationTests> {
  private final Provider<GameDatabase> gameDatabaseProvider;

  public RoomDataBaseIsolationTests_MembersInjector(Provider<GameDatabase> gameDatabaseProvider) {
    this.gameDatabaseProvider = gameDatabaseProvider;
  }

  public static MembersInjector<RoomDataBaseIsolationTests> create(
      Provider<GameDatabase> gameDatabaseProvider) {
    return new RoomDataBaseIsolationTests_MembersInjector(gameDatabaseProvider);
  }

  @Override
  public void injectMembers(RoomDataBaseIsolationTests instance) {
    injectGameDatabase(instance, gameDatabaseProvider.get());
  }

  @InjectedFieldSignature("com.dbtechprojects.gamedeals.database.RoomDataBaseIsolationTests.gameDatabase")
  @Named("test_db")
  public static void injectGameDatabase(RoomDataBaseIsolationTests instance,
      GameDatabase gameDatabase) {
    instance.gameDatabase = gameDatabase;
  }
}
