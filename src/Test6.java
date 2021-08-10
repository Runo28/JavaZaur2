import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Test6 {
    public static void main(String[] args) {
        int []arr2 = {3,7,-2,5,-1,10,15,-3,4};

        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = i + 1;
        }
//        System.out.println(Arrays.toString(arr));
//        int a = Arrays.stream(arr).sum();
//        System.out.println(Arrays.stream(arr).max().getAsInt() + " " + Arrays.stream(arr).min().getAsInt());
//        System.out.println(a);
//        System.out.println(Arrays.toString(Arrays.stream(arr).filter(value -> value % 2 == 0).toArray()));
//        System.out.println(Arrays.toString(Arrays.stream(arr).filter(v -> v % 2 == 1).map(m -> m * 3).limit(2).toArray()));

        System.out.println(Arrays.toString(arr2));
        Arrays.stream(arr2).map(m->m*5-1).
                limit(6).
                sorted().
                forEach(i-> System.out.print(i+" "));
        System.out.println();

        Arrays.stream(arr2).map(m->m*5-1).
                limit(6).
                sorted().
                filter(value -> value>0&&value<30).
                forEach(i-> System.out.print(i+" "));
        System.out.println();

       String [] str = {"privet","poka","ok","no","pora"};
        System.out.println("!!!");
       Arrays.stream(str).filter(s -> s.charAt(0)=='p').
               forEach(f-> System.out.print(f+ " "));
        System.out.println();

       factorial(-3);






    }

    static public void factorial (int a){
        int sum = 1;
        if (a<=0){
            try {
                throw new Exception ("Вы ввели неверное число");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else {
            for (int i = 2; i <=a ; i++) {
                sum*=i;
            }
            System.out.println("Факторил числа "+a+" = " + sum);
        }

    }
}
