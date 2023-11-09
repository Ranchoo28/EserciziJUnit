package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyListUnit m = new MyListUnit();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            list.add(i);

        ArrayList<Integer> sortedList = m.SortList(list, (short) 0);
        System.out.println(sortedList);
    }
}