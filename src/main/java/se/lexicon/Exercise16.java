package se.lexicon;

import java.util.HashSet;
import java.util.Set;

public class Exercise16 {
    public static void main(String[] args) {
        int[] numberlist={1,4,4,2,6,7};
        Set<Integer> numberSet=new HashSet<>();
        for(int num:numberlist){
            numberSet.add(num);
        }
        numberSet.forEach(System.out::println);
    }
}