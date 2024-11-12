package se.lexicon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise14 {
    public static void main(String[] args) {
        Map<String,String> details=new HashMap<>();
        details.put("erik@test.com","Erik");
        details.put("steve@test.com","Steve");
        details.put("frederik@test.com","Fredrik");
        details.put("peter@test.com","Peter");

        Set<String> set=new HashSet<>();
        for(Map.Entry<String,String> entry: details.entrySet()){
            set.add(entry.getKey());
        }
        System.out.println("Set with keys from hashmap: "+set);
    }
}
