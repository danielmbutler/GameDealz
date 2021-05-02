package com.dbtechprojects.gamedeals.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GameDatabase_Impl extends GameDatabase {
  private volatile GameDAO _gameDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(4) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `games` (`id` INTEGER, `isSaved` TEXT, `cheapest` TEXT, `timestamp` TEXT, `cheapestDealID` TEXT, `external` TEXT, `gameID` TEXT, `internalName` TEXT, `steamAppID` TEXT, `thumb` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_games_gameID` ON `games` (`gameID`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `storedeals` (`id` INTEGER, `dealID` TEXT, `dealRating` TEXT, `gameID` TEXT, `internalName` TEXT, `isOnSale` TEXT, `lastChange` INTEGER, `metacriticLink` TEXT, `metacriticScore` TEXT, `normalPrice` TEXT, `releaseDate` INTEGER, `salePrice` TEXT, `savings` TEXT, `steamAppID` TEXT, `steamRatingCount` TEXT, `steamRatingPercent` TEXT, `steamRatingText` TEXT, `storeID` TEXT, `thumb` TEXT, `title` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_storedeals_gameID` ON `storedeals` (`gameID`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '35ca402c42e56373daa81123ce527b06')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `games`");
        _db.execSQL("DROP TABLE IF EXISTS `storedeals`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsGames = new HashMap<String, TableInfo.Column>(10);
        _columnsGames.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("isSaved", new TableInfo.Column("isSaved", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("cheapest", new TableInfo.Column("cheapest", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("timestamp", new TableInfo.Column("timestamp", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("cheapestDealID", new TableInfo.Column("cheapestDealID", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("external", new TableInfo.Column("external", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("gameID", new TableInfo.Column("gameID", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("internalName", new TableInfo.Column("internalName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("steamAppID", new TableInfo.Column("steamAppID", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGames.put("thumb", new TableInfo.Column("thumb", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGames = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGames = new HashSet<TableInfo.Index>(1);
        _indicesGames.add(new TableInfo.Index("index_games_gameID", true, Arrays.asList("gameID")));
        final TableInfo _infoGames = new TableInfo("games", _columnsGames, _foreignKeysGames, _indicesGames);
        final TableInfo _existingGames = TableInfo.read(_db, "games");
        if (! _infoGames.equals(_existingGames)) {
          return new RoomOpenHelper.ValidationResult(false, "games(com.dbtechprojects.gamedeals.models.Game).\n"
                  + " Expected:\n" + _infoGames + "\n"
                  + " Found:\n" + _existingGames);
        }
        final HashMap<String, TableInfo.Column> _columnsStoredeals = new HashMap<String, TableInfo.Column>(20);
        _columnsStoredeals.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("dealID", new TableInfo.Column("dealID", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("dealRating", new TableInfo.Column("dealRating", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("gameID", new TableInfo.Column("gameID", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("internalName", new TableInfo.Column("internalName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("isOnSale", new TableInfo.Column("isOnSale", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("lastChange", new TableInfo.Column("lastChange", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("metacriticLink", new TableInfo.Column("metacriticLink", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("metacriticScore", new TableInfo.Column("metacriticScore", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("normalPrice", new TableInfo.Column("normalPrice", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("releaseDate", new TableInfo.Column("releaseDate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("salePrice", new TableInfo.Column("salePrice", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("savings", new TableInfo.Column("savings", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("steamAppID", new TableInfo.Column("steamAppID", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("steamRatingCount", new TableInfo.Column("steamRatingCount", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("steamRatingPercent", new TableInfo.Column("steamRatingPercent", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("steamRatingText", new TableInfo.Column("steamRatingText", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("storeID", new TableInfo.Column("storeID", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("thumb", new TableInfo.Column("thumb", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoredeals.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStoredeals = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStoredeals = new HashSet<TableInfo.Index>(1);
        _indicesStoredeals.add(new TableInfo.Index("index_storedeals_gameID", true, Arrays.asList("gameID")));
        final TableInfo _infoStoredeals = new TableInfo("storedeals", _columnsStoredeals, _foreignKeysStoredeals, _indicesStoredeals);
        final TableInfo _existingStoredeals = TableInfo.read(_db, "storedeals");
        if (! _infoStoredeals.equals(_existingStoredeals)) {
          return new RoomOpenHelper.ValidationResult(false, "storedeals(com.dbtechprojects.gamedeals.models.GameStore).\n"
                  + " Expected:\n" + _infoStoredeals + "\n"
                  + " Found:\n" + _existingStoredeals);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "35ca402c42e56373daa81123ce527b06", "54928bb61f0c46f77abcc14ce8304173");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "games","storedeals");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `games`");
      _db.execSQL("DELETE FROM `storedeals`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public GameDAO gameDao() {
    if (_gameDAO != null) {
      return _gameDAO;
    } else {
      synchronized(this) {
        if(_gameDAO == null) {
          _gameDAO = new GameDAO_Impl(this);
        }
        return _gameDAO;
      }
    }
  }
}
