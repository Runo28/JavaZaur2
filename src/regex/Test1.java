package regex;

import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ruslan Huba", "Ukraine", "Spaske", "Pokrovska",
                77,"1", "ruslan_guba@i.ua","51263","+380933065092");
        Employee emp2 = new Employee("Irina Zaichenko", "Ukraine", "Dnipro", "Sholohova",
                29,"109", "za_ir@email.ua","49003","+380967512976");
        Employee emp3 = new Employee("Roman Kuchma", "Ukraine", "Spaske", "Pokrovska",
                62,"1", "roman_ku@gmail.com","75948","+380934582891");
        String sEmp = emp1.print()+" "+emp2.print()+" "+emp3.print();
        System.out.println(sEmp);
        String string = "Ruslan Huba, Ukraine, Spaske, Pokrovska street, 77, Flat 1, email: ruslan_guba@i.ua, " +
                "PostCode: 51263, Phone number: +380933065092; " +
                "Irina Zaichenko, Ukraine, Dnipro, Sholohova street, 29, Flat 109, email: za_ir@email.ua, " +
                "PostCode: 49003, Phone number: +380967512976; " +
                "Roman Kuchma, Ukraine, Spaske, Pokrovska street, 62, Flat 1, email: roman_ku@gmail.com, " +
                "PostCode: 75948, Phone number: +380934582891;";


    }
}

