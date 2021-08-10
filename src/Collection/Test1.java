package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(8,"Ruslan",15000);
        Employee emp2 = new Employee(1,"Inna",8000);
        Employee emp3 = new Employee(3,"Alex",25000);
        Employee emp4 = new Employee(15,"Tamara",13000);
        Employee emp5 = new Employee(25,"Oleh",17000);
        Employee emp6 = new Employee(4,"Ira",11000);
        Employee emp7 = new Employee(9,"Timur",6000);
        Employee emp8 = new Employee(17,"Zahar",9000);
        Employee emp9 = new Employee(11,"Vlad",5000);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);list.add(emp2);list.add(emp3);list.add(emp4);list.add(emp5);
        list.add(emp6);list.add(emp7);list.add(emp8);list.add(emp9);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,new sortSalary());
        System.out.println(list);


    }
}

class Employee implements Comparable <Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ')';
    }

    @Override
    public int compareTo(Employee e) {
        return id-e.id;
    }
}

class sortSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.salary-e2.salary>0)return 1;
        else if (e1.salary-e2.salary<0)return -1;
        else return 0;
    }
}

