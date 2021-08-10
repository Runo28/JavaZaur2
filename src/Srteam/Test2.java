package Srteam;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int [] arr = {3,8,1,5,9,12,4,21,81,7,18};
    //     Arrays.stream(arr).sorted().filter(a->a%2==0).forEach(Print::Pr);
         int a= Arrays.stream(arr).filter(b->b%2==1)
                 .map(s-> {if (s%3==0){s/=3;}return s;}).reduce((acum,c)->acum+c).getAsInt();
        System.out.println(a);

    }
}

class Print{
    static void Pr (int a){
        System.out.print(a+" ");
    }
}
