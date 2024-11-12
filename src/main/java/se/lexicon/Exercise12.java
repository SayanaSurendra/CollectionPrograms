package se.lexicon;

import java.util.HashMap;
import java.util.Map;

public class Exercise12 {
    public static void main(String[] args) {
        Map<Integer,Car> cars=new HashMap<>();

        Car volvo=new Car(12345, "Volvo","S90");
        Car vw=new Car(23546,"Volkswagen","Taigo");
        Car toyota=new Car(89546,"Toyota","Corolla");
        Car bmw=new Car(23646,"BMW","BMW X6");
        cars.put(1,volvo);
        cars.put(2,vw);
        cars.put(3,toyota);
        cars.put(4,bmw);

        for(Map.Entry<Integer,Car> entry:cars.entrySet() ){
            Car car=entry.getValue();
            System.out.println(car.getBrand());

        }

    }
}
