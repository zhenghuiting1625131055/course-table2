package com.admin.coursetabledemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table course(" +
                "id integer primary key autoincrement," +
                "course_name text," +
                "teacher text," +
                "class_room text," +
                "day integer," +
                "start integer," +
                "end integer)");
        db.execSQL("create table coursetime(" +
                "id integer primary key autoincrement," +
                "courseindex integer," +
                "starttime text," +
                "endtime text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
