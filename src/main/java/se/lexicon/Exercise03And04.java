package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Exercise03 {
    public static void main(String[] args) {
        List<String> days=new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Friday");
        days.add("Saturday");
        System.out.println("days = " + days);

        days.add(4,"Thursday");
        System.out.println("days = " + days);


        List<String> dayssubList=days.subList(0,3);
        System.out.println("dayssubList = " + dayssubList);

    }
   
}
