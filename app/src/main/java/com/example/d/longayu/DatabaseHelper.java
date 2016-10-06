package com.example.d.longayu;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.widget.MenuPopupWindow;

/**
 * Created by D on 10/6/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Doctor.db";
    public static final String TABLE_NAME = "doctor_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "Clinic_id";
    public static final String COL_3 = "Clinic_doctor_id";
    public static final String COL_4 = "Doctor_title";
    public static final String COL_5 = "Doctor_registration_no";
    public static final String COL_6 = "Doctor_fname";
    public static final String COL_7 = "Doctor_lname";
    public static final String COL_8 = "Doctor_gender";
    public static final String COL_9 = "Doctor_email";
    public static final String COL_10 = "Doctor_contact_no";
    public static final String COL_11 = "Doctor_mobile";
    public static final String COL_12 = "Doctor_country_code";
    public static final String COL_13 = "Doctor_biography";
    public static final String COL_14 = "Doctor_qualifications";
    public static final String COL_15 = "Doctor_degree1";
    public static final String COL_16 = "Doctor_college1";
    public static final String COL_17 = "Doctor_branch1";
    public static final String COL_18 = "Doctor_colllege1_passing_year";


    public DatabaseHelper(Context context ) {
        super(context, DATABASE_NAME, null , 1 );
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
           db.execSQL("create table" +TABLE_NAME+ "(ID INTEGER PRIMARY KEY AUTOINCREMENT, Clinic_id TEXT, Clinic_doctor_id TEXT, Doctor_title TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
           db.execSQL("DROP TABLE IF EXISTS" +TABLE_NAME);
           onCreate(db);
    }
}
