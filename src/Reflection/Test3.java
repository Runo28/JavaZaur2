package Reflection;

import java.lang.reflect.Field;

public class Test3 {
    public static void main(String[] args) throws NoSuchFieldException,
            IllegalAccessException {

        //ДОСТУП К ПОЛЮ PRIVATE!!!

        Employee emp = new Employee(10, "ruslan","it");
        Class employeeClass = emp.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true); //открытие доступа к private полю
        double salaryValue =(double) field.get(emp);
        System.out.println(salaryValue);

        field.set(emp,1500);
        System.out.println(emp);

    }
}
