package com.kotlin.task.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kotlin.task.database.entity.ProfileList;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProfileDao_Impl implements ProfileDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProfileList> __insertionAdapterOfProfileList;

  public ProfileDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProfileList = new EntityInsertionAdapter<ProfileList>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `all_profile_data` (`id`,`name`,`email`,`gender`,`dob`,`phone`,`latitude`,`longitude`,`large`,`medium`,`thumbnail`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProfileList value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getGender() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getGender());
        }
        if (value.getDob() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDob());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPhone());
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLatitude());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLongitude());
        }
        if (value.getLarge() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLarge());
        }
        if (value.getMedium() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getMedium());
        }
        if (value.getThumbnail() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getThumbnail());
        }
      }
    };
  }

  @Override
  public void insert(final List<ProfileList> profileList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfProfileList.insert(profileList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<ProfileList>> getAllProfileList() {
    final String _sql = "SELECT * FROM all_profile_data";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"all_profile_data"}, false, new Callable<List<ProfileList>>() {
      @Override
      public List<ProfileList> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfLarge = CursorUtil.getColumnIndexOrThrow(_cursor, "large");
          final int _cursorIndexOfMedium = CursorUtil.getColumnIndexOrThrow(_cursor, "medium");
          final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
          final List<ProfileList> _result = new ArrayList<ProfileList>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ProfileList _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpGender;
            _tmpGender = _cursor.getString(_cursorIndexOfGender);
            final String _tmpDob;
            _tmpDob = _cursor.getString(_cursorIndexOfDob);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final String _tmpLatitude;
            _tmpLatitude = _cursor.getString(_cursorIndexOfLatitude);
            final String _tmpLongitude;
            _tmpLongitude = _cursor.getString(_cursorIndexOfLongitude);
            final String _tmpLarge;
            _tmpLarge = _cursor.getString(_cursorIndexOfLarge);
            final String _tmpMedium;
            _tmpMedium = _cursor.getString(_cursorIndexOfMedium);
            final String _tmpThumbnail;
            _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
            _item = new ProfileList(_tmpId,_tmpName,_tmpEmail,_tmpGender,_tmpDob,_tmpPhone,_tmpLatitude,_tmpLongitude,_tmpLarge,_tmpMedium,_tmpThumbnail);
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
  public LiveData<List<ProfileList>> getSearchList(final String name) {
    final String _sql = "SELECT * FROM all_profile_data WHERE name LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"all_profile_data"}, false, new Callable<List<ProfileList>>() {
      @Override
      public List<ProfileList> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
          final int _cursorIndexOfDob = CursorUtil.getColumnIndexOrThrow(_cursor, "dob");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfLarge = CursorUtil.getColumnIndexOrThrow(_cursor, "large");
          final int _cursorIndexOfMedium = CursorUtil.getColumnIndexOrThrow(_cursor, "medium");
          final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
          final List<ProfileList> _result = new ArrayList<ProfileList>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ProfileList _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpGender;
            _tmpGender = _cursor.getString(_cursorIndexOfGender);
            final String _tmpDob;
            _tmpDob = _cursor.getString(_cursorIndexOfDob);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final String _tmpLatitude;
            _tmpLatitude = _cursor.getString(_cursorIndexOfLatitude);
            final String _tmpLongitude;
            _tmpLongitude = _cursor.getString(_cursorIndexOfLongitude);
            final String _tmpLarge;
            _tmpLarge = _cursor.getString(_cursorIndexOfLarge);
            final String _tmpMedium;
            _tmpMedium = _cursor.getString(_cursorIndexOfMedium);
            final String _tmpThumbnail;
            _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
            _item = new ProfileList(_tmpId,_tmpName,_tmpEmail,_tmpGender,_tmpDob,_tmpPhone,_tmpLatitude,_tmpLongitude,_tmpLarge,_tmpMedium,_tmpThumbnail);
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
