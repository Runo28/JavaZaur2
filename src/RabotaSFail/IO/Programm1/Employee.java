package RabotaSFail.IO.Programm1;

import java.io.*;

public class Employee implements Serializable {
    int id;
    String name;
    String surname;
    transient int salary;

    public Employee(
            int id,
            String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname=surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}

