package NestedClass.InnerNonStaticClass;

public class Car {
    String color;
    int doorCount;
    Engiene horsePower;
    static int countEngiene=0;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.horsePower = this.new Engiene(horsePower);
    }

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngiene (Engiene engiene){
        this.horsePower=engiene;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", horsePower=" + horsePower +
                '}';
    }

    public class Engiene {
        int horsePower;
        int countEngienev;



        public Engiene(int horsePower) {
            this.horsePower = horsePower;
            countEngiene++;
            this.countEngienev=countEngiene;
        }

        @Override
        public String toString() {
            return "Engiene"+countEngienev+"{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car car = new Car("red",4,250);
        System.out.println(car);
        Car car2 = new Car("bleak",4);
        System.out.println(car2);
        Car.Engiene engiene2 = car.new Engiene(300);
        car2.setEngiene(engiene2);
        System.out.println(car2);
        Car.Engiene engiene3 = car.new Engiene(350);
        Car car3 = new Car("bleak",2);
        car3.setEngiene(engiene3);
        System.out.println(car3);
    }
}
