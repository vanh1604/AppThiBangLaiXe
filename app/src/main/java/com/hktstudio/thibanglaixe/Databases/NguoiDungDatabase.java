package com.hktstudio.thibanglaixe.Databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class NguoiDungDatabase extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "User.sqlite";
    private static final int DATABASE_VERSION = 1;

    public NguoiDungDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
