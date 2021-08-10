public class Test5 {
    Day day;

    public Test5(Day day) {
        this.day = day;
    }
    public void printDay (){
        System.out.println(day);
    }

    public static void main(String[] args) {
        Test5 test5 = new Test5(Day.MONDAY);
        test5.printDay();

    }
}

enum Day {
        MONDAY, FRIDAY
}
