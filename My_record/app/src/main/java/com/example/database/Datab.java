package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObservable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Datab extends SQLiteOpenHelper {

    public static final String DATABASE_NAME= "Form.db";
    public static final String TABLE_NAME= "form_table";
    //public static final String COL_1="Id";
    public static final String COL_2="Name";
    public static final String COL_3="Email_id";
    public static final String COL_4="Password";

    public Datab(@Nullable Context contextctory)
    {
        super(contextctory, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE form_table (Name TEXT, Email_id TEXT, Password TEXT)");
      }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    }
    public boolean insertData(String Name, String Email, String Password)
    {
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(COL_2,Name);
        cv.put(COL_3,Email);
        cv.put(COL_4,Password);
        long result;
        result = db.insert(TABLE_NAME,null, cv);
        if(result==-1)
        {
            return(false);
        }
        else
        {
            return(true);
        }
    }
}
