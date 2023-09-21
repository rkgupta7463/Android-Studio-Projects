package com.example.crudapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.service.autofill.UserData;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context,"UserData.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create table Usersdetails(name text primary key,contact text,dob text)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop table if exists Userdetails");
    }
    public boolean insertuserdata(String name,String contact,String dob){
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",name);
        contentValues.put("contact",contact);
        contentValues.put("dob",dob);
        long results=DB.insert("Usersdetails",null,contentValues);
        if(results==-1){
            return false;
        }else {
            return true;
        }
    }
    public boolean updateuserdata(String name,String contact,String dob){
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("contact",contact);
        contentValues.put("dob",dob);
        Cursor cursor=DB.rawQuery("select * from Usersdetails where name=?",new
                String[]{name});
        if (cursor.getCount()>0) {
            long results = DB.update("Usersdetails", contentValues, "name=?", new
                    String[]{name});
            if (results == -1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public boolean deleteuserdata(String name){
        SQLiteDatabase DB=this.getWritableDatabase();
        Cursor cursor=DB.rawQuery("select * from Usersdetails where name=?",new
                String[]{name});
        if (cursor.getCount()>0) {
            long results = DB.delete("Usersdetails","name=?", new String[]{name});
            if (results == -1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public Cursor getData(){
        SQLiteDatabase DB=this.getWritableDatabase();
        Cursor cursor=DB.rawQuery("select * from Usersdetails",null);
        return cursor;
    }
}
