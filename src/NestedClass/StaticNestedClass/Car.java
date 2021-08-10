package NestedClass.StaticNestedClass;

public class Car {
    String color;
    int doorCount;
    Engiene engiene;

    public static class Engiene {
        int hoursePower;

        public Engiene(int hoursePower) {
            this.hoursePower = hoursePower;
        }

        @Override
        public String toString() {
            return "My engiene{" +
                    "hoursePower=" + hoursePower +
                    '}';
        }
    }

    public Car(String color, int doorCount, Engiene engiene) {
        this.color = color;
        this.doorCount = doorCount;
        this.engiene = engiene;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engiene=" + engiene +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engiene engiene = new Car.Engiene(250);
        System.out.println(engiene);
        Car car = new Car("red",2,engiene);
        System.out.println(car);
    }

}
