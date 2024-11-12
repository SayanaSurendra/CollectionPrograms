package se.lexicon;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercise05And06 {
    public static void main(String[] args) {
        HashSet<String> days=new HashSet<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        System.out.println("days = " + days);

        ArrayList<String> daysList=new ArrayList<>();
        daysList.addAll(days);
        System.out.println("daysList = " + daysList);


    }
}
