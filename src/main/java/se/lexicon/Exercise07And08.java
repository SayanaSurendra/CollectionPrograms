package se.lexicon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Exercise07 {
    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();
        names.add("Erik");
        names.add("Frederik");
        names.add("Steve");
        names.add("Peter");
        names.add("Anna");

        ArrayList<String> namesList=new ArrayList<>();
        namesList.addAll(names);
        System.out.println("namesList = " + namesList);

        Collections.sort(namesList);
        System.out.println("Sorted List = " + namesList);


        TreeSet sortedSet=new TreeSet(names);
        System.out.println("sortedSet = " + sortedSet);
    }
}
