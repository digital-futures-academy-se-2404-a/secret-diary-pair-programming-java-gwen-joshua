package com.secretdiary.app;
import java.sql.Array;
import java.util.ArrayList;

public class Diary {
protected ArrayList<String> entries = new ArrayList<String>();
protected boolean isLocked = false;
protected int pin = 1234;

    public Diary() {}

    public void lock() {
        isLocked = true;
    }

    public void unlock(Integer pin) {
        if (pin == null) throw new IllegalArgumentException("Please enter a valid number");
        if(pin == this.pin){
            this.isLocked = false;
        }
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
            if(!isLocked){
                return entries.get(num - 1);
            }else{
                return "The Diary is Locked!";
            }

        }
    }

    public ArrayList<String> readAllEntries(){
        if(isLocked) {
            ArrayList<String> locked = new ArrayList<String>();
                    locked.add("The Diary is Locked!");
                    return locked
            ;}
        return entries;
    }

    public boolean getIsLocked() {
        return isLocked;
    }
}
