package com.secretdiary.app;
import java.sql.Array;
import java.util.ArrayList;

public class Diary {
protected ArrayList<String> entries = new ArrayList<String>();
public Diary() {}
    public void write(String entry) {
    if (entry == null) throw new IllegalArgumentException("Please enter a valid string");
    entries.add(entry);
    }
    public String readEntry(Integer num) {
    return entries.get(0);
    }
}
