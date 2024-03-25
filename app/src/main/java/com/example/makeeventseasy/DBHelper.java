package com.example.makeeventseasy;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "events.db";
    private static final int DATABASE_VERSION = 2;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String createUserTableQuery = "CREATE TABLE users (id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, password TEXT)";
        db.execSQL(createUserTableQuery);


        ContentValues contentValues = new ContentValues();
        contentValues.put("username", "admin");
        contentValues.put("password", "admin123");
        db.insert("users", null, contentValues);


        String createEventsTableQuery = "CREATE TABLE events (id INTEGER PRIMARY KEY AUTOINCREMENT, event_name TEXT, event_date TEXT, event_location TEXT, event_description TEXT)";
        db.execSQL(createEventsTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop existing tables if they exist
        db.execSQL("DROP TABLE IF EXISTS users");
        db.execSQL("DROP TABLE IF EXISTS events");

        // Recreate tables
        onCreate(db);
    }
}
