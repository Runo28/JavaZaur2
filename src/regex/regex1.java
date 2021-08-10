package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
    public static void main(String[] args) {
        String string = "Ruslan Huba, Ukraine, Spaske, Pokrovska street, 77, Flat 1, email: ruslan_guba@i.ua, " +
                "PostCode: 51263, Phone number: +380933065092; " +
                "Irina Zaichenko, Ukraine, Dnipro, Sholohova street, 29, Flat 109, email: za_ir@email.ua, " +
                "PostCode: 49003, Phone number: +380967512976; " +
                "Roman Kuchma, Ukraine, Spaske, Pokrovska street, 62, Flat 1, email: roman_ku@gmail.com, " +
                "PostCode: 75948, Phone number: +380934582891;";
       String ss = string.replaceAll("[^0-9]{12}"," ");
        System.out.println(ss);

        Pattern pattern1 = Pattern.compile("ABCD");
        Matcher matcher1 = pattern1.matcher(string);
        while (matcher1.find()){
            System.out.println(matcher1.group());
        }
    }
}
