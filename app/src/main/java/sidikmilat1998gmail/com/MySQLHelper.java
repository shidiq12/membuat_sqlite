package sidikmilat1998gmail.com;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "mydatabase.db";
    private static final int DATABASE_VERSION = 1;
    public static final String TABLE = "data";


    public static final String number = "number";
    public static final String name = "name";

    public MySQLHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }     @Override     public void onCreate(SQLiteDatabase db) {         String sql = "create table " + TABLE + "( _id"                 + " integer primary key autoincrement, " + number + " text not null, "                 + name + " text not null);";         Log.d("Data", "onCreate: " + sql);         db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    }