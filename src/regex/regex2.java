package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {
    public static void main(String[] args) {
        String s = "ABCD ABCE ABCDABCF ABCF";
        Pattern pattern1 = Pattern.compile("ABCD");
        Matcher matcher1 = pattern1.matcher(s);
//        while (matcher1.find()){
//            System.out.println(matcher1.group());
//        }
        if (matcher1.find())
        System.out.println(matcher1.group());
    }
}
