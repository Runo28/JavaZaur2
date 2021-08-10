package Interfaces.Comporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        Employee emp2 = new Employee(45,"Aleksandr ","Matveev",5000);
        Employee emp3 = new Employee(100,"Irina","Zaichenko",35000);
        Employee emp4 = new Employee(45,"Roma","Kuchma",25000);
        List<Employee> list = new ArrayList<>();
        list.add(emp1);  list.add(emp2);  list.add(emp3); list.add(emp4);
//        sort(list,e -> {return e.id>4;});
        System.out.println(list);
        Collections.sort(list,new nameDlcomporator());
        Collections.sort(list,new nameDlcomporator());
        System.out.println(list);
//        Collections.sort(list,new nameComporator());
//        System.out.println(list);;
//        Collections.sort(list,new surnameComporator());
//        System.out.println(list);;
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
        return this.id - o.id;
}
}

class idComporator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
       if (e1.id>e2.id){return 1;}
       else if (e1.id<e2.id){return -1;}
       else return 0;
    }
}

class nameComporator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

class surnameComporator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.surname.compareTo(o2.surname);
    }
}

class salaryComporator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salare-o2.salare;
    }
}

class nameDlcomporator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        Integer a1 = o1.name.length();
        Integer a2 = o2.name.length();
        if (a1>a2)return 1;
        else if (a1<a2) return -1;
        else return 0;
    }
}
