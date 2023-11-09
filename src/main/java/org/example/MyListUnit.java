package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyListUnit {

    public ArrayList<Integer> SortList(ArrayList<Integer> list, short i) {
        switch (i){
            case 0:
                System.out.println("Crescente");
                Collections.sort(list);
                break;
            case 1:{
                System.out.println("Decrescente");
                Collections.reverse(list);
                break;
            }
        }
        return list;
    }

}
