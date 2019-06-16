package com.fastservices.sams.data.dao.promotions;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.promotions.dtPromotionValueClass;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class PromotionValueDao_Impl implements PromotionValueDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfdtPromotionValueClass;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PromotionValueDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfdtPromotionValueClass = new EntityInsertionAdapter<dtPromotionValueClass>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `dtPromotionValueClass`(`PROMOTION_VOLUMECLASS_ID`,`SCHEME_ID`,`PROMOTION_ID`,`DISTRIBUTOR_ID`,`CUSTOMER_VOLUMECLASS_ID`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, dtPromotionValueClass value) {
        stmt.bindLong(1, value.PROMOTION_VOLUMECLASS_ID);
        stmt.bindLong(2, value.getSCHEME_ID());
        stmt.bindLong(3, value.getPROMOTION_ID());
        stmt.bindLong(4, value.getDISTRIBUTOR_ID());
        stmt.bindLong(5, value.getCUSTOMER_VOLUMECLASS_ID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM dtPromotionValueClass";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<? extends dtPromotionValueClass> promotionValues) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfdtPromotionValueClass.insert(promotionValues);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<dtPromotionValueClass> getAll(long promotion_id) {
    final String _sql = "SELECT * FROM dtPromotionValueClass WHERE PROMOTION_ID = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, promotion_id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPROMOTIONVOLUMECLASSID = _cursor.getColumnIndexOrThrow("PROMOTION_VOLUMECLASS_ID");
      final int _cursorIndexOfSCHEMEID = _cursor.getColumnIndexOrThrow("SCHEME_ID");
      final int _cursorIndexOfPROMOTIONID = _cursor.getColumnIndexOrThrow("PROMOTION_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfCUSTOMERVOLUMECLASSID = _cursor.getColumnIndexOrThrow("CUSTOMER_VOLUMECLASS_ID");
      final List<dtPromotionValueClass> _result = new ArrayList<dtPromotionValueClass>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final dtPromotionValueClass _item;
        _item = new dtPromotionValueClass();
        _item.PROMOTION_VOLUMECLASS_ID = _cursor.getInt(_cursorIndexOfPROMOTIONVOLUMECLASSID);
        final int _tmpSCHEME_ID;
        _tmpSCHEME_ID = _cursor.getInt(_cursorIndexOfSCHEMEID);
        _item.setSCHEME_ID(_tmpSCHEME_ID);
        final long _tmpPROMOTION_ID;
        _tmpPROMOTION_ID = _cursor.getLong(_cursorIndexOfPROMOTIONID);
        _item.setPROMOTION_ID(_tmpPROMOTION_ID);
        final int _tmpDISTRIBUTOR_ID;
        _tmpDISTRIBUTOR_ID = _cursor.getInt(_cursorIndexOfDISTRIBUTORID);
        _item.setDISTRIBUTOR_ID(_tmpDISTRIBUTOR_ID);
        final int _tmpCUSTOMER_VOLUMECLASS_ID;
        _tmpCUSTOMER_VOLUMECLASS_ID = _cursor.getInt(_cursorIndexOfCUSTOMERVOLUMECLASSID);
        _item.setCUSTOMER_VOLUMECLASS_ID(_tmpCUSTOMER_VOLUMECLASS_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<dtPromotionValueClass> getAll() {
    final String _sql = "SELECT * FROM dtPromotionValueClass";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPROMOTIONVOLUMECLASSID = _cursor.getColumnIndexOrThrow("PROMOTION_VOLUMECLASS_ID");
      final int _cursorIndexOfSCHEMEID = _cursor.getColumnIndexOrThrow("SCHEME_ID");
      final int _cursorIndexOfPROMOTIONID = _cursor.getColumnIndexOrThrow("PROMOTION_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfCUSTOMERVOLUMECLASSID = _cursor.getColumnIndexOrThrow("CUSTOMER_VOLUMECLASS_ID");
      final List<dtPromotionValueClass> _result = new ArrayList<dtPromotionValueClass>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final dtPromotionValueClass _item;
        _item = new dtPromotionValueClass();
        _item.PROMOTION_VOLUMECLASS_ID = _cursor.getInt(_cursorIndexOfPROMOTIONVOLUMECLASSID);
        final int _tmpSCHEME_ID;
        _tmpSCHEME_ID = _cursor.getInt(_cursorIndexOfSCHEMEID);
        _item.setSCHEME_ID(_tmpSCHEME_ID);
        final long _tmpPROMOTION_ID;
        _tmpPROMOTION_ID = _cursor.getLong(_cursorIndexOfPROMOTIONID);
        _item.setPROMOTION_ID(_tmpPROMOTION_ID);
        final int _tmpDISTRIBUTOR_ID;
        _tmpDISTRIBUTOR_ID = _cursor.getInt(_cursorIndexOfDISTRIBUTORID);
        _item.setDISTRIBUTOR_ID(_tmpDISTRIBUTOR_ID);
        final int _tmpCUSTOMER_VOLUMECLASS_ID;
        _tmpCUSTOMER_VOLUMECLASS_ID = _cursor.getInt(_cursorIndexOfCUSTOMERVOLUMECLASSID);
        _item.setCUSTOMER_VOLUMECLASS_ID(_tmpCUSTOMER_VOLUMECLASS_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
