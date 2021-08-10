package Interfaces.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {

    public static void sort (List<Employee> list, Predicate<Employee> p){
        for (Employee e:list){
            if (p.test(e)){
                System.out.println(e.toString());
            }
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(25,"Ruslan","Huba",10000);
        Employee emp2 = new Employee(45,"Roman ","Kuchma",25000);
        Employee emp3 = new Employee(3,"Irina","Zaichenko",35000);
        List<Employee> list = new ArrayList<>();
        list.add(emp1);  list.add(emp2);  list.add(emp3);
//        sort(list,e -> {return e.id>4;});
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salare;

    public Employee(int id, String name, String surname, int salare) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salare = salare;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salare=" + salare +
                '}' +"\n";
    }

    @Override
    public int compareTo(Employee o) {
       // return this.id-o.id;
      return this.surname.compareTo(o.surname);
    }
}
