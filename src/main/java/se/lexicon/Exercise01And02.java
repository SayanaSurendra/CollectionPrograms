package se.lexicon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        List<String> days=new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        System.out.println("days = " + days);

        Iterator<String> itr= days.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}
