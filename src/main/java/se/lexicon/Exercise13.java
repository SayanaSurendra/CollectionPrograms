package se.lexicon;

import java.util.HashSet;
import java.util.Set;

public class Exercise13 {
    public static void main(String[] args) {
        Set<String> weekDays=new HashSet<>();
        weekDays.add("Sunday");
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");

        Set<String> weekends=new HashSet<>();
        weekends.add("Saturday");
        weekends.add("Sunday");

        weekDays.retainAll(weekends);

        System.out.println(weekDays);
    }
}
