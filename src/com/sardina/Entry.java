package com.sardina;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Entry {
    private Day day;
    private String note;
    private int duration;

    public int getDuration() {
        return duration;
    }

    public int setDuration() {
        return duration;
    }

    public Entry(Day day, String note, int duration) {
        this.day = day;
        this.note = note;
        this.duration = duration;
    }

    public Day getDay() {
        return day;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "day=" + day +
                ", note='" + note + '\'' +
                ", duration=" + duration +
                '}';
    }



    public static List<Entry> populate(){
        List<Entry> entries = new ArrayList<>();
        Random random = new Random();
        ArrayList<Integer> randomInts = new ArrayList<>();
        for(int i =0; i<11; i++){
            int temp = random.nextInt(101);
            randomInts.add(temp);
        }

        Entry entry = new Entry(Day.MONDAY,"Today I went to play sports", randomInts.get(0));
        entries.add(entry);

        entry = new Entry(Day.TUESDAY,"Lunch was a salad today... was still hungry", randomInts.get(1));
        entries.add(entry);

        entry = new Entry(Day.WEDNESDAY,"Hump day! Looking forward to the weekend.", randomInts.get(2));
        entries.add(entry);

        entry = new Entry(Day.WEDNESDAY,"Why isn't the day over yet?!", randomInts.get(3));
        entries.add(entry);

        entry = new Entry(Day.THURSDAY,"Poker night", randomInts.get(4));
        entries.add(entry);

        entry = new Entry(Day.FRIDAY,"Finally Friday!", randomInts.get(5));
        entries.add(entry);

        entry = new Entry(Day.SATURDAY,"Saturdaze", randomInts.get(6));
        entries.add(entry);

        entry = new Entry(Day.SUNDAY,"Sunday Bumday", randomInts.get(7));
        entries.add(entry);

        entry = new Entry(Day.MONDAY,"I dont like writing in this journal", randomInts.get(8));
        entries.add(entry);

        entry = new Entry(Day.SATURDAY,"Why am I writing on a Saturday?", randomInts.get(9));
        entries.add(entry);

        entry = new Entry(Day.TUESDAY,"toooos day", randomInts.get(10));
        entries.add(entry);

        return entries;

    }
}
