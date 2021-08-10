package Lambda;

import Lambda.work.Student;

import java.util.ArrayList;
import java.util.function.Function;

public class Function1 {

    public static double avgResStud(ArrayList<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student s : list) {
            result += f.apply(s);
        }
        result = result / list.size();
        return result;
    }

    public static void main(String[] args) {
        Lambda.work.Student st1 = new Lambda.work.Student("Ruslan", 'm', 32, 4, 9.2);
        Lambda.work.Student st2 = new Lambda.work.Student("Zahar", 'm', 19, 1, 6.3);
        Lambda.work.Student st3 = new Lambda.work.Student("Irina", 'f', 34, 5, 8.1);
        Lambda.work.Student st4 = new Lambda.work.Student("Natalia", 'f', 25, 3, 7.4);
        Lambda.work.Student st5 = new Lambda.work.Student("Oksana", 'f', 26, 4, 6.8);
        Lambda.work.Student st6 = new Lambda.work.Student("Oleh", 'm', 21, 2, 8.5);
        Lambda.work.Student st7 = new Lambda.work.Student("Ihor", 'm', 30, 3, 7.9);
        Lambda.work.Student st8 = new Lambda.work.Student("Natasha", 'f', 28, 5, 9.1);
        Lambda.work.Student st9 = new Lambda.work.Student("Roman", 'm', 26, 4, 8.9);
        Lambda.work.Student st10 = new Lambda.work.Student("Karolina", 'f', 24, 2, 8.2);
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(st1);
        listStudent.add(st2);
        listStudent.add(st3);
        listStudent.add(st4);
        listStudent.add(st5);
        listStudent.add(st6);
        listStudent.add(st7);
        listStudent.add(st8);
        listStudent.add(st9);
        listStudent.add(st10);

        Function<Student, Double> function = student -> student.getAvgGrade();
        double avg = avgResStud(listStudent, function);
        double avg1 = avgResStud(listStudent,student -> (double)student.getAge());
        System.out.println(avg);
        System.out.println(avg1);


    }
}
