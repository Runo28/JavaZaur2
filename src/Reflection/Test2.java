package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("Reflection.Employee");

//        Object o = employeeClass.newInstance(); //используется до 11 Java
//        Employee employee = (Employee) employeeClass.newInstance();
//        System.out.println(employee);

        Constructor <Employee> constructor1 = employeeClass.getConstructor();
        Object object1 = constructor1.newInstance();
        Employee employee1 =  constructor1.newInstance();

        Constructor<Employee> constructor2 = employeeClass.getConstructor(int.class,String.class,String.class);
        Employee emp1 = constructor2.newInstance(1,"Ruslan","IT");
        System.out.println(emp1);

        Constructor constructor3 = employeeClass.getConstructor(int.class,String.class,String.class);
        Object obj3 = constructor3.newInstance(3,"Roman","polit");
        System.out.println(obj3);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj3,1000);
        method.invoke(emp1,800);

        System.out.println(emp1);
        System.out.println(obj3);




    }
}
