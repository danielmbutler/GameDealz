package com.dbtechprojects.gamedeals.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dbtechprojects.gamedeals.models.Game;
import com.dbtechprojects.gamedeals.models.GameStore;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GameDAO_Impl implements GameDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Game> __insertionAdapterOfGame;

  private final EntityInsertionAdapter<Game> __insertionAdapterOfGame_1;

  private final EntityInsertionAdapter<GameStore> __insertionAdapterOfGameStore;

  private final EntityDeletionOrUpdateAdapter<Game> __deletionAdapterOfGame;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllSavedGames;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllgames;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllGamesFromStore;

  public GameDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGame = new EntityInsertionAdapter<Game>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `games` (`id`,`isSaved`,`cheapest`,`timestamp`,`cheapestDealID`,`external`,`gameID`,`internalName`,`steamAppID`,`thumb`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Game value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSaved() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSaved());
        }
        if (value.getCheapest() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCheapest());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimestamp());
        }
        if (value.getCheapestDealID() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCheapestDealID());
        }
        if (value.getExternal() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getExternal());
        }
        if (value.getGameID() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getGameID());
        }
        if (value.getInternalName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getInternalName());
        }
        if (value.getSteamAppID() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getSteamAppID());
        }
        if (value.getThumb() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getThumb());
        }
      }
    };
    this.__insertionAdapterOfGame_1 = new EntityInsertionAdapter<Game>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `games` (`id`,`isSaved`,`cheapest`,`timestamp`,`cheapestDealID`,`external`,`gameID`,`internalName`,`steamAppID`,`thumb`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Game value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSaved() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSaved());
        }
        if (value.getCheapest() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCheapest());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimestamp());
        }
        if (value.getCheapestDealID() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCheapestDealID());
        }
        if (value.getExternal() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getExternal());
        }
        if (value.getGameID() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getGameID());
        }
        if (value.getInternalName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getInternalName());
        }
        if (value.getSteamAppID() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getSteamAppID());
        }
        if (value.getThumb() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getThumb());
        }
      }
    };
    this.__insertionAdapterOfGameStore = new EntityInsertionAdapter<GameStore>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `storedeals` (`id`,`dealID`,`dealRating`,`gameID`,`internalName`,`isOnSale`,`lastChange`,`metacriticLink`,`metacriticScore`,`normalPrice`,`releaseDate`,`salePrice`,`savings`,`steamAppID`,`steamRatingCount`,`steamRatingPercent`,`steamRatingText`,`storeID`,`thumb`,`title`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GameStore value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getDealID() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDealID());
        }
        if (value.getDealRating() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDealRating());
        }
        if (value.getGameID() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getGameID());
        }
        if (value.getInternalName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getInternalName());
        }
        if (value.isOnSale() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.isOnSale());
        }
        if (value.getLastChange() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getLastChange());
        }
        if (value.getMetacriticLink() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getMetacriticLink());
        }
        if (value.getMetacriticScore() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getMetacriticScore());
        }
        if (value.getNormalPrice() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getNormalPrice());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getReleaseDate());
        }
        if (value.getSalePrice() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getSalePrice());
        }
        if (value.getSavings() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getSavings());
        }
        if (value.getSteamAppID() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getSteamAppID());
        }
        if (value.getSteamRatingCount() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getSteamRatingCount());
        }
        if (value.getSteamRatingPercent() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getSteamRatingPercent());
        }
        if (value.getSteamRatingText() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getSteamRatingText());
        }
        if (value.getStoreID() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getStoreID());
        }
        if (value.getThumb() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getThumb());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getTitle());
        }
      }
    };
    this.__deletionAdapterOfGame = new EntityDeletionOrUpdateAdapter<Game>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `games` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Game value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllSavedGames = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM games WHERE IsSaved = 'true'";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllgames = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM games WHERE isSaved = 'null'";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllGamesFromStore = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM storedeals";
        return _query;
      }
    };
  }

  @Override
  public Object saveDeal(final Game game, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGame.insert(game);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertgames(final Game game, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGame_1.insert(game);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertstoredeal(final GameStore gameStore, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGameStore.insert(gameStore);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteSavedDeal(final Game game, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGame.handle(game);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllSavedGames(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllSavedGames.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllSavedGames.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object deleteAllgames(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllgames.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllgames.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object deleteAllGamesFromStore(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllGamesFromStore.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllGamesFromStore.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Flow<List<Game>> getSavedGames() {
    final String _sql = "SELECT * FROM games WHERE IsSaved = 'true'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"games"}, new Callable<List<Game>>() {
      @Override
      public List<Game> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSaved = CursorUtil.getColumnIndexOrThrow(_cursor, "isSaved");
          final int _cursorIndexOfCheapest = CursorUtil.getColumnIndexOrThrow(_cursor, "cheapest");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfCheapestDealID = CursorUtil.getColumnIndexOrThrow(_cursor, "cheapestDealID");
          final int _cursorIndexOfExternal = CursorUtil.getColumnIndexOrThrow(_cursor, "external");
          final int _cursorIndexOfGameID = CursorUtil.getColumnIndexOrThrow(_cursor, "gameID");
          final int _cursorIndexOfInternalName = CursorUtil.getColumnIndexOrThrow(_cursor, "internalName");
          final int _cursorIndexOfSteamAppID = CursorUtil.getColumnIndexOrThrow(_cursor, "steamAppID");
          final int _cursorIndexOfThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "thumb");
          final List<Game> _result = new ArrayList<Game>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Game _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpSaved;
            _tmpSaved = _cursor.getString(_cursorIndexOfSaved);
            final String _tmpCheapest;
            _tmpCheapest = _cursor.getString(_cursorIndexOfCheapest);
            final String _tmpTimestamp;
            _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            final String _tmpCheapestDealID;
            _tmpCheapestDealID = _cursor.getString(_cursorIndexOfCheapestDealID);
            final String _tmpExternal;
            _tmpExternal = _cursor.getString(_cursorIndexOfExternal);
            final String _tmpGameID;
            _tmpGameID = _cursor.getString(_cursorIndexOfGameID);
            final String _tmpInternalName;
            _tmpInternalName = _cursor.getString(_cursorIndexOfInternalName);
            final String _tmpSteamAppID;
            _tmpSteamAppID = _cursor.getString(_cursorIndexOfSteamAppID);
            final String _tmpThumb;
            _tmpThumb = _cursor.getString(_cursorIndexOfThumb);
            _item = new Game(_tmpId,_tmpSaved,_tmpCheapest,_tmpTimestamp,_tmpCheapestDealID,_tmpExternal,_tmpGameID,_tmpInternalName,_tmpSteamAppID,_tmpThumb);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Game>> getAllGames(final String query) {
    final String _sql = "SELECT * FROM games WHERE internalName Like '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"games"}, new Callable<List<Game>>() {
      @Override
      public List<Game> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSaved = CursorUtil.getColumnIndexOrThrow(_cursor, "isSaved");
          final int _cursorIndexOfCheapest = CursorUtil.getColumnIndexOrThrow(_cursor, "cheapest");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfCheapestDealID = CursorUtil.getColumnIndexOrThrow(_cursor, "cheapestDealID");
          final int _cursorIndexOfExternal = CursorUtil.getColumnIndexOrThrow(_cursor, "external");
          final int _cursorIndexOfGameID = CursorUtil.getColumnIndexOrThrow(_cursor, "gameID");
          final int _cursorIndexOfInternalName = CursorUtil.getColumnIndexOrThrow(_cursor, "internalName");
          final int _cursorIndexOfSteamAppID = CursorUtil.getColumnIndexOrThrow(_cursor, "steamAppID");
          final int _cursorIndexOfThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "thumb");
          final List<Game> _result = new ArrayList<Game>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Game _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpSaved;
            _tmpSaved = _cursor.getString(_cursorIndexOfSaved);
            final String _tmpCheapest;
            _tmpCheapest = _cursor.getString(_cursorIndexOfCheapest);
            final String _tmpTimestamp;
            _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            final String _tmpCheapestDealID;
            _tmpCheapestDealID = _cursor.getString(_cursorIndexOfCheapestDealID);
            final String _tmpExternal;
            _tmpExternal = _cursor.getString(_cursorIndexOfExternal);
            final String _tmpGameID;
            _tmpGameID = _cursor.getString(_cursorIndexOfGameID);
            final String _tmpInternalName;
            _tmpInternalName = _cursor.getString(_cursorIndexOfInternalName);
            final String _tmpSteamAppID;
            _tmpSteamAppID = _cursor.getString(_cursorIndexOfSteamAppID);
            final String _tmpThumb;
            _tmpThumb = _cursor.getString(_cursorIndexOfThumb);
            _item = new Game(_tmpId,_tmpSaved,_tmpCheapest,_tmpTimestamp,_tmpCheapestDealID,_tmpExternal,_tmpGameID,_tmpInternalName,_tmpSteamAppID,_tmpThumb);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Game>> getLastThirtyGames() {
    final String _sql = "SELECT * FROM games ORDER BY ID DESC LIMIT 30";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"games"}, new Callable<List<Game>>() {
      @Override
      public List<Game> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSaved = CursorUtil.getColumnIndexOrThrow(_cursor, "isSaved");
          final int _cursorIndexOfCheapest = CursorUtil.getColumnIndexOrThrow(_cursor, "cheapest");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfCheapestDealID = CursorUtil.getColumnIndexOrThrow(_cursor, "cheapestDealID");
          final int _cursorIndexOfExternal = CursorUtil.getColumnIndexOrThrow(_cursor, "external");
          final int _cursorIndexOfGameID = CursorUtil.getColumnIndexOrThrow(_cursor, "gameID");
          final int _cursorIndexOfInternalName = CursorUtil.getColumnIndexOrThrow(_cursor, "internalName");
          final int _cursorIndexOfSteamAppID = CursorUtil.getColumnIndexOrThrow(_cursor, "steamAppID");
          final int _cursorIndexOfThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "thumb");
          final List<Game> _result = new ArrayList<Game>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Game _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpSaved;
            _tmpSaved = _cursor.getString(_cursorIndexOfSaved);
            final String _tmpCheapest;
            _tmpCheapest = _cursor.getString(_cursorIndexOfCheapest);
            final String _tmpTimestamp;
            _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            final String _tmpCheapestDealID;
            _tmpCheapestDealID = _cursor.getString(_cursorIndexOfCheapestDealID);
            final String _tmpExternal;
            _tmpExternal = _cursor.getString(_cursorIndexOfExternal);
            final String _tmpGameID;
            _tmpGameID = _cursor.getString(_cursorIndexOfGameID);
            final String _tmpInternalName;
            _tmpInternalName = _cursor.getString(_cursorIndexOfInternalName);
            final String _tmpSteamAppID;
            _tmpSteamAppID = _cursor.getString(_cursorIndexOfSteamAppID);
            final String _tmpThumb;
            _tmpThumb = _cursor.getString(_cursorIndexOfThumb);
            _item = new Game(_tmpId,_tmpSaved,_tmpCheapest,_tmpTimestamp,_tmpCheapestDealID,_tmpExternal,_tmpGameID,_tmpInternalName,_tmpSteamAppID,_tmpThumb);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<GameStore>> getLastThirtyStoreDeals() {
    final String _sql = "SELECT * FROM storedeals ORDER BY ID DESC LIMIT 30";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"storedeals"}, new Callable<List<GameStore>>() {
      @Override
      public List<GameStore> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDealID = CursorUtil.getColumnIndexOrThrow(_cursor, "dealID");
          final int _cursorIndexOfDealRating = CursorUtil.getColumnIndexOrThrow(_cursor, "dealRating");
          final int _cursorIndexOfGameID = CursorUtil.getColumnIndexOrThrow(_cursor, "gameID");
          final int _cursorIndexOfInternalName = CursorUtil.getColumnIndexOrThrow(_cursor, "internalName");
          final int _cursorIndexOfIsOnSale = CursorUtil.getColumnIndexOrThrow(_cursor, "isOnSale");
          final int _cursorIndexOfLastChange = CursorUtil.getColumnIndexOrThrow(_cursor, "lastChange");
          final int _cursorIndexOfMetacriticLink = CursorUtil.getColumnIndexOrThrow(_cursor, "metacriticLink");
          final int _cursorIndexOfMetacriticScore = CursorUtil.getColumnIndexOrThrow(_cursor, "metacriticScore");
          final int _cursorIndexOfNormalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "normalPrice");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfSalePrice = CursorUtil.getColumnIndexOrThrow(_cursor, "salePrice");
          final int _cursorIndexOfSavings = CursorUtil.getColumnIndexOrThrow(_cursor, "savings");
          final int _cursorIndexOfSteamAppID = CursorUtil.getColumnIndexOrThrow(_cursor, "steamAppID");
          final int _cursorIndexOfSteamRatingCount = CursorUtil.getColumnIndexOrThrow(_cursor, "steamRatingCount");
          final int _cursorIndexOfSteamRatingPercent = CursorUtil.getColumnIndexOrThrow(_cursor, "steamRatingPercent");
          final int _cursorIndexOfSteamRatingText = CursorUtil.getColumnIndexOrThrow(_cursor, "steamRatingText");
          final int _cursorIndexOfStoreID = CursorUtil.getColumnIndexOrThrow(_cursor, "storeID");
          final int _cursorIndexOfThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "thumb");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<GameStore> _result = new ArrayList<GameStore>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GameStore _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpDealID;
            _tmpDealID = _cursor.getString(_cursorIndexOfDealID);
            final String _tmpDealRating;
            _tmpDealRating = _cursor.getString(_cursorIndexOfDealRating);
            final String _tmpGameID;
            _tmpGameID = _cursor.getString(_cursorIndexOfGameID);
            final String _tmpInternalName;
            _tmpInternalName = _cursor.getString(_cursorIndexOfInternalName);
            final String _tmpIsOnSale;
            _tmpIsOnSale = _cursor.getString(_cursorIndexOfIsOnSale);
            final Integer _tmpLastChange;
            if (_cursor.isNull(_cursorIndexOfLastChange)) {
              _tmpLastChange = null;
            } else {
              _tmpLastChange = _cursor.getInt(_cursorIndexOfLastChange);
            }
            final String _tmpMetacriticLink;
            _tmpMetacriticLink = _cursor.getString(_cursorIndexOfMetacriticLink);
            final String _tmpMetacriticScore;
            _tmpMetacriticScore = _cursor.getString(_cursorIndexOfMetacriticScore);
            final String _tmpNormalPrice;
            _tmpNormalPrice = _cursor.getString(_cursorIndexOfNormalPrice);
            final Integer _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getInt(_cursorIndexOfReleaseDate);
            }
            final String _tmpSalePrice;
            _tmpSalePrice = _cursor.getString(_cursorIndexOfSalePrice);
            final String _tmpSavings;
            _tmpSavings = _cursor.getString(_cursorIndexOfSavings);
            final String _tmpSteamAppID;
            _tmpSteamAppID = _cursor.getString(_cursorIndexOfSteamAppID);
            final String _tmpSteamRatingCount;
            _tmpSteamRatingCount = _cursor.getString(_cursorIndexOfSteamRatingCount);
            final String _tmpSteamRatingPercent;
            _tmpSteamRatingPercent = _cursor.getString(_cursorIndexOfSteamRatingPercent);
            final String _tmpSteamRatingText;
            _tmpSteamRatingText = _cursor.getString(_cursorIndexOfSteamRatingText);
            final String _tmpStoreID;
            _tmpStoreID = _cursor.getString(_cursorIndexOfStoreID);
            final String _tmpThumb;
            _tmpThumb = _cursor.getString(_cursorIndexOfThumb);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item = new GameStore(_tmpId,_tmpDealID,_tmpDealRating,_tmpGameID,_tmpInternalName,_tmpIsOnSale,_tmpLastChange,_tmpMetacriticLink,_tmpMetacriticScore,_tmpNormalPrice,_tmpReleaseDate,_tmpSalePrice,_tmpSavings,_tmpSteamAppID,_tmpSteamRatingCount,_tmpSteamRatingPercent,_tmpSteamRatingText,_tmpStoreID,_tmpThumb,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<GameStore>> getAllGamesFromStore(final String storeId) {
    final String _sql = "SELECT * FROM storedeals Where storeID Like ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (storeId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, storeId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"storedeals"}, new Callable<List<GameStore>>() {
      @Override
      public List<GameStore> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDealID = CursorUtil.getColumnIndexOrThrow(_cursor, "dealID");
          final int _cursorIndexOfDealRating = CursorUtil.getColumnIndexOrThrow(_cursor, "dealRating");
          final int _cursorIndexOfGameID = CursorUtil.getColumnIndexOrThrow(_cursor, "gameID");
          final int _cursorIndexOfInternalName = CursorUtil.getColumnIndexOrThrow(_cursor, "internalName");
          final int _cursorIndexOfIsOnSale = CursorUtil.getColumnIndexOrThrow(_cursor, "isOnSale");
          final int _cursorIndexOfLastChange = CursorUtil.getColumnIndexOrThrow(_cursor, "lastChange");
          final int _cursorIndexOfMetacriticLink = CursorUtil.getColumnIndexOrThrow(_cursor, "metacriticLink");
          final int _cursorIndexOfMetacriticScore = CursorUtil.getColumnIndexOrThrow(_cursor, "metacriticScore");
          final int _cursorIndexOfNormalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "normalPrice");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfSalePrice = CursorUtil.getColumnIndexOrThrow(_cursor, "salePrice");
          final int _cursorIndexOfSavings = CursorUtil.getColumnIndexOrThrow(_cursor, "savings");
          final int _cursorIndexOfSteamAppID = CursorUtil.getColumnIndexOrThrow(_cursor, "steamAppID");
          final int _cursorIndexOfSteamRatingCount = CursorUtil.getColumnIndexOrThrow(_cursor, "steamRatingCount");
          final int _cursorIndexOfSteamRatingPercent = CursorUtil.getColumnIndexOrThrow(_cursor, "steamRatingPercent");
          final int _cursorIndexOfSteamRatingText = CursorUtil.getColumnIndexOrThrow(_cursor, "steamRatingText");
          final int _cursorIndexOfStoreID = CursorUtil.getColumnIndexOrThrow(_cursor, "storeID");
          final int _cursorIndexOfThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "thumb");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<GameStore> _result = new ArrayList<GameStore>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GameStore _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpDealID;
            _tmpDealID = _cursor.getString(_cursorIndexOfDealID);
            final String _tmpDealRating;
            _tmpDealRating = _cursor.getString(_cursorIndexOfDealRating);
            final String _tmpGameID;
            _tmpGameID = _cursor.getString(_cursorIndexOfGameID);
            final String _tmpInternalName;
            _tmpInternalName = _cursor.getString(_cursorIndexOfInternalName);
            final String _tmpIsOnSale;
            _tmpIsOnSale = _cursor.getString(_cursorIndexOfIsOnSale);
            final Integer _tmpLastChange;
            if (_cursor.isNull(_cursorIndexOfLastChange)) {
              _tmpLastChange = null;
            } else {
              _tmpLastChange = _cursor.getInt(_cursorIndexOfLastChange);
            }
            final String _tmpMetacriticLink;
            _tmpMetacriticLink = _cursor.getString(_cursorIndexOfMetacriticLink);
            final String _tmpMetacriticScore;
            _tmpMetacriticScore = _cursor.getString(_cursorIndexOfMetacriticScore);
            final String _tmpNormalPrice;
            _tmpNormalPrice = _cursor.getString(_cursorIndexOfNormalPrice);
            final Integer _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getInt(_cursorIndexOfReleaseDate);
            }
            final String _tmpSalePrice;
            _tmpSalePrice = _cursor.getString(_cursorIndexOfSalePrice);
            final String _tmpSavings;
            _tmpSavings = _cursor.getString(_cursorIndexOfSavings);
            final String _tmpSteamAppID;
            _tmpSteamAppID = _cursor.getString(_cursorIndexOfSteamAppID);
            final String _tmpSteamRatingCount;
            _tmpSteamRatingCount = _cursor.getString(_cursorIndexOfSteamRatingCount);
            final String _tmpSteamRatingPercent;
            _tmpSteamRatingPercent = _cursor.getString(_cursorIndexOfSteamRatingPercent);
            final String _tmpSteamRatingText;
            _tmpSteamRatingText = _cursor.getString(_cursorIndexOfSteamRatingText);
            final String _tmpStoreID;
            _tmpStoreID = _cursor.getString(_cursorIndexOfStoreID);
            final String _tmpThumb;
            _tmpThumb = _cursor.getString(_cursorIndexOfThumb);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item = new GameStore(_tmpId,_tmpDealID,_tmpDealRating,_tmpGameID,_tmpInternalName,_tmpIsOnSale,_tmpLastChange,_tmpMetacriticLink,_tmpMetacriticScore,_tmpNormalPrice,_tmpReleaseDate,_tmpSalePrice,_tmpSavings,_tmpSteamAppID,_tmpSteamRatingCount,_tmpSteamRatingPercent,_tmpSteamRatingText,_tmpStoreID,_tmpThumb,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
