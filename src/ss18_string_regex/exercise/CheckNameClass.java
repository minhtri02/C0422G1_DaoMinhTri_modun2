package ss18_string_regex.exercise;

import java.util.regex.Matcher;

public class CheckNameClass {
    public static void checkNameClass(String nameClass){
        final String CHECK_NAME="^[C|A|P]\\d{4}+[G|H|I|K|L|M]$";
        boolean flag =  nameClass.matches(CHECK_NAME);
        System.out.println(nameClass +": "+flag);
    }

    public static void main(String[] args) {
        String[] nameClass = {"C0318G","M0318G","P0323A"};
        for (String s : nameClass) {
            checkNameClass(s);
        }
    }
}
