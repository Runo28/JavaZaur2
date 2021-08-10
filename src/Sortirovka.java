import java.util.Arrays;

public class Sortirovka {

    static int[] qlsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }
        return arr;
    }

    static int[] boblsort(int[] arr) {
        int a = 0;
        for (int j = 0; j <arr.length ; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] > arr[i]) {
                    a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 9, 6, 10, -5, 4, -9, 3, 12, 8};
        System.out.println(Arrays.toString(qlsort(arr)));
        int[] arr2 = {5, 7, 1, 9, 6, 10, -5, 4, -9, 3, 12, 8};
        System.out.println(Arrays.toString(boblsort(arr)));
    }


}
