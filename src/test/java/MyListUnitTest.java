import org.example.MyListUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class MyListUnitTest {
    private static MyListUnit myListUnit;

    @BeforeAll
    public static void setUp() {
        myListUnit = new MyListUnit();
    }

    @BeforeEach
    public void starTimer(){
        LocalTime start = LocalTime.now();
        System.out.println("Inizio test alle: " + start);
    }

    @Test
    public void ordinaCrescenteTest() {
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        Assertions.assertEquals(Arrays.asList(1,2,3,4,5), myListUnit.SortList(test, (short) 0));
        Assertions.assertNotEquals(Arrays.asList(1,2,3,90,5), myListUnit.SortList(test, (short) 0));
    }

    @Test
    public void ordinaDecrescente(){
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assertions.assertEquals(Arrays.asList(5,4,3,2,1), myListUnit.SortList(test, (short) 1));
        Assertions.assertTrue(Arrays.asList(1,2,3,90,5).equals(myListUnit.SortList(test, (short) 1)));
    }

    @AfterEach
    public void endTimer(){
        LocalTime end = LocalTime.now();
        System.out.println("Fine test alle " + end);
    }
}
