package com.example.sqlitedetail;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "userData.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create table userData(name text primary key AutoIncrement, gmail text, phone number)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop table if exists userdata");
    }

    public boolean insertquery(String name, String email, Integer phone) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("email", email);
        contentValues.put("phone", phone);

        long results = db.insert("userdata", null, contentValues);
        if (results == -1)
            return false;
        else
            return true;
    }

//    public boolean updatequery(String name, String email, Integer phone) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("name", name);
//        contentValues.put("email", email);
//        contentValues.put("phone", phone);
//
//        Cursor cursor = db.rawQuery("select * from userdata where name=?", new String[]{name});
//
//        if (cursor.getCount() > 0) {
//
//            long results = db.insert("userdata", null, contentValues);
//            if (results == -1)
//                return false;
//            else
//                return true;
//        }else {
//            return  false;
//        }
//    }
}

