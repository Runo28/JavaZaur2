package Generics.Game;

public class Test1 {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Tolia",12);
        Schoolar schoolar2 = new Schoolar("Nadia",14);
        Schoolar schoolar3 = new Schoolar("Vasia",11);
        Schoolar schoolar4 = new Schoolar("Tania",15);

        Student student1 = new Student("Ihor",21);
        Student student2 = new Student("Katia",19);

        Employee employee1 = new Employee("Ruslan", 32);
        Employee employee2 = new Employee("Irina",34);
        Employee employee3 = new Employee("Roman",26);
        Employee employee4 = new Employee("Karolina",23);

        Team <Schoolar> schoolTeam = new Team<>("Drakoni");
        schoolTeam.addNewPlayer(schoolar1);
        schoolTeam.addNewPlayer(schoolar2);
        schoolTeam.printTeam();

        Team <Schoolar> schoolTeam2 = new Team<>("Sloni");
        schoolTeam.addNewPlayer(schoolar3);
        schoolTeam.addNewPlayer(schoolar4);
        schoolTeam.printTeam();

        Team <Student> studentTeam = new Team<>("Samson");
        studentTeam.addNewPlayer(student1);
        studentTeam.addNewPlayer(student2);
        studentTeam.printTeam();

        Team <Employee> employeeTeam = new Team<>("Rabotiagi");
        employeeTeam.addNewPlayer(employee1);
        employeeTeam.addNewPlayer(employee2);
        employeeTeam.printTeam();

        Team <Employee> employeeTeam2 = new Team<>("Barigi");
        employeeTeam2.addNewPlayer(employee3);
        employeeTeam2.addNewPlayer(employee4);
        employeeTeam2.printTeam();

        employeeTeam.playGame(employeeTeam2);

        schoolTeam.playGame(schoolTeam2);











    }
}
