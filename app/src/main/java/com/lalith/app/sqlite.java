package com.lalith.app;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class sqlite extends SQLiteOpenHelper {

    static  final String dbname = "database";
    static int dbv=1;
    Context c;

    public sqlite(Context context)
    {
        super(context,dbname,null,dbv);
        c = context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String s = "create table info(email text,name text,password text)";
        db.execSQL(s);
    }
    void insertData(String name,String email,String password)
    {
        SQLiteDatabase sd = getWritableDatabase(); // data writing
        ContentValues v = new ContentValues();
        v.put("email",email);
        v.put("name" /*key*/,name /*value*/);
        v.put("password",password);
        sd.insert("info",null,v);
        Toast.makeText(c, "added", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
