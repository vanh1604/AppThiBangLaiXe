package com.hktstudio.thibanglaixe.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;


import com.hktstudio.thibanglaixe.Databases.NguoiDungDatabase;
import com.hktstudio.thibanglaixe.Object.NguoiDung;



public class NguoiDungDAO {
    NguoiDungDatabase nguoiDungDatabase;
    SQLiteDatabase database;
    public NguoiDungDAO(Context context){
        nguoiDungDatabase = new NguoiDungDatabase(context);
    }
    public void open(){
        database = nguoiDungDatabase.getReadableDatabase();
    }
    public void close(){
        nguoiDungDatabase.close();
    }
    public NguoiDung login(String username, String password){
        try {
            open();
            String cauTruyVan = String.format("Select * from NguoiDung where username = '%s' and password = '%s'", username, password);
            Log.d("Query", cauTruyVan); // In ra câu truy vấn
            Cursor cursor = database.rawQuery(cauTruyVan, null);
            if (cursor.moveToFirst()) {
                NguoiDung nguoiDung = new NguoiDung(cursor.getInt(0), cursor.getString(1), cursor.getString(2));
                Log.d("Result", nguoiDung.toString()); // In ra kết quả truy vấn
                close();
                return nguoiDung;
            }
            return null;
        }
        catch (Exception e){
            return null;
        }
    }
    public String registerRequest(String username, String password){
        open();
        //auto increment id
        String truyVanToanBo = "Select * FROM NguoiDung";
        Cursor cursor = database.rawQuery(truyVanToanBo,null);
        cursor.moveToLast();
        int id = cursor.getInt(0);
        String cauTruyVan = String.format("INSERT INTO NguoiDung(id, username, password) values($d,%s,%s)",id,username,password);
        database.execSQL(cauTruyVan);
        return "Đăng ký thành công";
    }

}
