package regex;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String string = "Ruslan Huba, Ukraine, Spaske, Pokrovska street, 77, Flat 1, email: ruslan_guba@i.ua, " +
                "PostCode: 51263, Phone number: +380933065092; " +
                "Irina Zaichenko, Ukraine, Dnipro, Sholohova street, 29, Flat 109, email: za_ir@email.ua, " +
                "PostCode: 49003, Phone number: +380967512976; " +
                "Roman Kuchma, Ukraine, Spaske, Pokrovska street, 62, Flat 1, email: roman_ku@gmail.com, " +
                "PostCode: 75948, Phone number: +380934582891;";
//
        String[] arrString = string.split(";");

//        Arrays.stream(arrString).map(s -> s.replaceAll("(\\w+)\\s(\\w+)(.*)", "$2 $1$3")
//                .replaceAll("(\\S+)@(\\S+)", "$2@$1,")
//                .replaceAll(",@", "@")
//                .replaceAll("([\\d]{2})([\\d]{3})([\\d]{7})", "$1($2)$3")
//                .trim())
//                .forEach(s -> System.out.println(s));
//        Arrays.stream(arrString).map(s -> s.replaceAll("(\\S\\s*)([\\S+]@[\\S+])(\\S\\s*)", "$2"))
//                .forEach(s -> System.out.println(s));
        for (String s:arrString){
            System.out.println(s.replace("([\\S+]@[\\S+])", ""));
        }


//        for (String str : arrString) {
//            System.out.println(str.trim());
//            System.out.println(str.trim().replaceAll("(\\w+)\\s(\\w+)(.*)", "$2 $1$3")
//                    .replaceAll("(\\S+)@(\\S+)", "$2@$1,")
//                    .replaceAll(",@", "@")
//                    .replaceAll("([\\d]{2})([\\d]{3})([\\d]{7})", "$1($2)$3"));
//            System.out.println(str.trim().replaceAll("(\\S+)@(\\S+)", "$2@$1").replaceAll(",@", "@"));
//            System.out.println(str.trim().replaceAll("([\\d]{2})([\\d]{3})([\\d]{7})", "$1($2)$3"));

    }
}

