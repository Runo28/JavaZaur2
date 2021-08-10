package regex;

public class PrintFExm {

    static void EmpInfo(Emp emp) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f\n",
                emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonusPct));


//        System.out.printf("%04d \t %-12s \t %-12s \t %,.1f\n",
//                emp.id + emp.name + emp.surname + emp.salary * (1 + emp.bonusPct));
    }

    public static void main(String[] args) {
        Emp emp1 = new Emp(1,"Ruslan", "Huba",1000, 0.5);
        Emp emp2 = new Emp(2,"Roman","Kuchma",800,0.4);
        Emp emp3 = new Emp(3,"Irina", "Zaichenko",1000,0.5);
        EmpInfo(emp1);
    }
}

class Emp {
    int id;
    String name;
    String surname;
    double salary;
    double bonusPct;

    public Emp(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}
