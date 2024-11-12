package se.lexicon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise15 {
    public static void main(String[] args) {
        List<SuperHero> superheroes=new ArrayList<>();
        superheroes.add(new SuperHero(1,"Batman",29));
        superheroes.add(new SuperHero(2,"Spiderman",26));
        superheroes.add(new SuperHero(3,"Superman",30));

        Collections.sort(superheroes);
        superheroes.forEach(System.out::println);
    }

}
