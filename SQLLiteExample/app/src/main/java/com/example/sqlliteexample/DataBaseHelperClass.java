package com.example.sqlliteexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataBaseHelperClass extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "student.db";
    public static final String TABLE_NAME = "student_table";
    public static final String COL1 = "ID";
    public static final String COL2 = "NAME";
    public static final String COL3 = "SURNAME";
    public static final String COL4 = "MARKS";

    public static final String MY_TAG = "Sriram:";

    public DataBaseHelperClass(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,MARKS INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public Boolean InsertData(String Name, String Surname, String Marks) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL2,Name);
        cv.put(COL3,Surname);
        cv.put(COL4,Marks);
        Long result = db.insert(TABLE_NAME, null, cv);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData () {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " +TABLE_NAME,null);
        return res;
    }

    public boolean UpdateData(String ID, String Name, String Surname, String Marks) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL1, ID);
        cv.put(COL2,Name);
        cv.put(COL3,Surname);
        cv.put(COL4,Marks);

        int result = db.update(TABLE_NAME, cv, "ID = ?",new String[] { ID });
        Log.i(MY_TAG,"Result of DB Update:" +result);
        if (result == 0)
            return false;
        else
            return true;


    }

    public Integer DeleteData (String ID) {
        SQLiteDatabase db = this.getWritableDatabase();

        return (db.delete(TABLE_NAME, "ID = ?",new String[] { ID }));

    }
}
