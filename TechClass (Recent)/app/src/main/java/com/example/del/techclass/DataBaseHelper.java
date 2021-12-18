package com.example.del.techclass;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataBaseHelper extends SQLiteOpenHelper {
    private static String DATABASE_NAME = "howtoterms.db";
    private static String DATABASE_PATH = "";
    private SQLiteDatabase myDataBase;
    private final Context myContext;


    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        this.myContext = context;
        DATABASE_PATH = myContext.getDatabasePath(DATABASE_NAME).toString();
    }

    public void createDataBase() throws IOException{
        boolean dbExist = checkDataBase();

        if(dbExist){
        }
        else {
            this.getWritableDatabase();
            try{
                copyDataBase();
            } catch (IOException e){
                throw new Error("Error copying database");
            }
        }
    }

    private boolean checkDataBase(){
        SQLiteDatabase checkDB = null;

        try {
            String myPath = DATABASE_PATH;
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);

        }catch (SQLException e){

        }
        if(checkDB != null){
            checkDB.close();
        }

        return checkDB != null ? true : false;
    }

    private void copyDataBase() throws IOException{
        InputStream inputStream = myContext.getAssets().open(DATABASE_NAME);

        String outFileName = DATABASE_PATH;

        OutputStream outputStream = new FileOutputStream(outFileName);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer))>0){
            outputStream.write(buffer, 0, length);
        }

        outputStream.flush();
        outputStream.close();
        inputStream.close();
    }

    public void openDataBase() throws SQLException{
        String myPath = DATABASE_PATH;
        myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
