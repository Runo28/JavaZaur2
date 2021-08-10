package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
        String string = "Ruslan Huba, Ukraine, Spaske, Pokrovska street, 77, Flat 10, email: ruslan_guba@i.ua, " +
                "PostCode: 51263, Phone number: +380933065092; " +
                "Irina Zaichenko, Ukraine, Dnipro, Sholohova street, 29, Flat 19, email: za_ir@email.ua, " +
                "PostCode: 49003, Phone number: +380967512976; " +
                "Roman Kuchma, Ukraine, Spaske, Pokrovska street, 62, Flat 11, email: roman_ku@gmail.com, " +
                "PostCode: 75948, Phone number: +380934582891;";
//        Pattern pattern1 = Pattern.compile("\\+\\d{6,}");
//        Matcher matcher1 = pattern1.matcher(string);
//        while (matcher1.find()){
//            System.out.println(matcher1.group());
//        }
        Pattern pattern2 = Pattern.compile("\\S+@\\S+");
        Matcher matcher2 = pattern2.matcher(string);
        while (matcher2.find()){
            System.out.println(matcher2.group().replace(",",""));
        }
//
//        Pattern pattern3 = Pattern.compile("Spaske");
//        Matcher matcher3 = pattern3.matcher(string);
//        while (matcher3.find()){
//          System.out.println(matcher3.group().replace(",",""));
//        }

        Pattern pattern4 = Pattern.compile("\\+\\d{6,}");
        Matcher matcher4=pattern4.matcher(string);
        while (matcher4.find()){
            System.out.println(matcher4.group());
        }


    }
}
