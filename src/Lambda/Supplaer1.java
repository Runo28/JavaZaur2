package Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Supplaer1 {
    public static ArrayList<Car> creare3car (Supplier<Car> supplier){
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            list.add(supplier.get());
        }
        return list;
    }
    public static void changeCar (Car car, Consumer<Car> consumer){
        consumer.accept(car);
    }
    
    public static void main(String[] args) {
        ArrayList<Car> listCar = creare3car(()->{return new Car("nissan","red", "V4");});
        for (Car c:listCar){ System.out.println(c); }
        System.out.println("----");

        changeCar(listCar.get(0),car -> { car.color="bleak"; car.model="ford";
            System.out.println(car.toString());});
        System.out.println("----");

        listCar.forEach(car -> System.out.println(car.toString() ));

        ArrayList <Integer> listInt = new ArrayList<>();
        listInt.add(1); listInt.add(2); listInt.add(3); listInt.add(4); listInt.add(5);
        listInt.forEach(l -> {
            System.out.println(l);
            l*=l;
            System.out.println(l);
            System.out.println("------");
        });


    }
}

class Car {
    String model;
    String color;
    String engine;

    public Car(String model, String color, String engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
