package com.chnulabs.students;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {
    private int id;
    private String number;
    private String facultyName;
    private int educationLevel;
    private boolean contractExistsFlg;
    private boolean privilageExistsFlg;

    public StudentsGroup(int id,String number, String facultyName,int educationLevel,
                         boolean contractExistsFlg,boolean privilageExistsFlg){
        this.number=number;
        this.facultyName=facultyName;
        this.educationLevel=educationLevel;
        this.contractExistsFlg=contractExistsFlg;
        this.privilageExistsFlg=privilageExistsFlg;
        this.id=id;
    }

    public StudentsGroup(String number, String facultyName,int educationLevel,
                         boolean contractExistsFlg,boolean privilageExistsFlg){
    }

    public int getId() {return  this.id; }

    public String getNumber(){
        return number;
    }
    public String getFacultyName(){
        return facultyName;
    }
    public int getEducationLevel(){
        return educationLevel;
    }
    public boolean isContractExistsFlg(){
        return contractExistsFlg;
    }
    public boolean isPrivilageExistsFlg(){
        return privilageExistsFlg;
    }
    private static ArrayList<StudentsGroup> groups=new ArrayList<StudentsGroup>(Arrays.asList(
            new StudentsGroup("301","Комп'ютерних наук",0,true,false),
            new StudentsGroup("302","Комп'ютерних наук",0,true,false),
            new StudentsGroup("308","Інженерія програмного забезпечення",1,false,true),
            new StudentsGroup("309","Кібербезпека",0,true,true),
            new StudentsGroup("501м","Кібербезпека",0,false,true)
    ));

    public static StudentsGroup getGroup(String groupNumber){
        for(StudentsGroup g:groups){
            if(g.getNumber().equals(groupNumber)){
                return g;
            }
        }
        return null;
    }

    public static ArrayList<StudentsGroup> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return number;
    }

    public static void addGroup(StudentsGroup group) { groups.add(group); }
}
