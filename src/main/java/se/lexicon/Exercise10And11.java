package se.lexicon;

import java.util.HashMap;
import java.util.Map;

public class Exercise09And10 {
    public static void main(String[] args) {
        Map<Integer,String> cars=new HashMap<>();
        cars.put(1,"Volvo");
        cars.put(2,"Volkswagen");
        cars.put(3,"Tesla");
        cars.put(4,"BMW");
        cars.put(5,"Toyota");
        System.out.println("cars = " + cars);

        System.out.println();

        for(Map.Entry<Integer,String> keys: cars.entrySet()){
            System.out.println("key = " + keys.getKey());
            System.out.println("Values = " + keys.getValue());
        }
    }
}
