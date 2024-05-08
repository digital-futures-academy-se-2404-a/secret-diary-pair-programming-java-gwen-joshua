package com.secretdiary.app;
import java.sql.Array;
import java.util.ArrayList;

public class Diary {
protected ArrayList<String> entries = new ArrayList<String>();
protected boolean isLocked = false;

    public Diary() {}

    public void lock() {
        isLocked = true;
    }
    public void write(String entry) {
        if (entry == null) throw new IllegalArgumentException("Please enter a valid string");
        if(!isLocked){
            entries.add(entry);
        }
    }

    public String readEntry(Integer num) {
        if (num == null) throw new IllegalArgumentException("Please enter a valid number");
        if(num < 0 || num > entries.size()){
            return "This entry does not exist";
        }else{
            return entries.get(num - 1);
        }
    }

    public ArrayList<String> readAllEntries(){
        return entries;
    }

    public boolean getIsLocked() {
        return isLocked;
    }
}
