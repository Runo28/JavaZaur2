package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException,
            NoSuchMethodException {
        //создание объекта Class
        Class employeeClass = Class.forName("Reflection.Employee");
//        Class employee2 = Employee.class;
//        Employee emp = new Employee();
//        Class employee3 = emp.getClass();
        Field someField = employeeClass.getField("id");
        System.out.println("Тип поля id: " + someField.getType()); //возвращает тип поля
        Field someField2 = employeeClass.getField("name");
        System.out.println(someField2.getName()); // возвращает имя поля
        System.out.println("*************************");
        Field[] allField = employeeClass.getFields(); // возвращает все поля, не скрытые
        for (Field field : allField) {
            System.out.println(field.getName() + " = " + field.getType());
        }
        System.out.println("*************************");
        Field[] allField2 = employeeClass.getDeclaredFields(); //возвращает все поля, включая private
        for (Field field : allField2) {
            System.out.println(field.getName() + " = " + field.getType());
        }
        System.out.println("*************************");
        System.out.println("*************************");
        System.out.println("*************************");
        Method someMethod = employeeClass.getMethod("increaseSalary"); //возвращает метод
        System.out.println("Ретурн метода increaseSalary: " + someMethod.getReturnType()); // возвращает тип ретурн метода
        System.out.println("Тип переметров метода increaseSalary: " + Arrays.toString(someMethod.getParameterTypes()));//тип параметров метода
        System.out.println("*************************");
        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Тип переметров метода setSalary: " + Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("*************************");
        Method[] methods = employeeClass.getMethods(); //возвращает все методы, кроме private
        for (Method m : methods) {
            System.out.println("Имя метода: " + m.getName() + "    Тип возращаемых данных: " + m.getReturnType()
                    + "    Тип переметров метода: " + Arrays.toString(m.getParameterTypes()));
        }
        System.out.println("*************************");
        Method[] methods2 = employeeClass.getDeclaredMethods(); //возвращает все методы, которые мы переопределили или создали, включая private,
        for (Method m : methods2) {
            System.out.println("Имя метода: " + m.getName() + "    Тип возращаемых данных: " + m.getReturnType()
                    + "    Тип переметров метода: " + Arrays.toString(m.getParameterTypes()));
        }
        System.out.println("*************************");
        Method[] methods3 = employeeClass.getDeclaredMethods(); //возвращает все методы, которые мы переопределили или создали, включая private,
        for (Method m : methods3) {
            if (Modifier.isPublic(m.getModifiers())) { //проверка на приватность метода
                System.out.println("Имя метода: " + m.getName() + "    Тип возращаемых данных: " + m.getReturnType()
                        + "    Тип переметров метода: " + Arrays.toString(m.getParameterTypes()));
            }
        }
        System.out.println("*************************");
        Constructor constructor1 = employeeClass.getConstructor(); // возвращает конструктор
        System.out.println("Сколько параметров имеет конструктор: "+constructor1.getParameterCount()+
                " Тип переметров: " + Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("*************************");
        Constructor constructor2 = employeeClass.getConstructor(int.class,String.class,String.class); // возвращает конструктор
        System.out.println("Сколько параметров имеет конструктор: "+constructor2.getParameterCount()+
                " Тип переметров: " + Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("*************************");
        Constructor [] allConstructors = employeeClass.getConstructors();
        for (Constructor constructor:allConstructors){
            System.out.println("Имя конструктора: "+constructor.getName()+
                    "   Количество параметров" + constructor.getParameterCount()+
                    "   Параметры конструктора: " +Arrays.toString (constructor.getParameterTypes()));
        }
        System.out.println("*************************");



    }
}
