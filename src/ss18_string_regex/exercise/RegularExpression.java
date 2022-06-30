package ss18_string_regex.exercise;

import ss18_string_regex.practice.AccountExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static final String REGULAREXPRESSION = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    private static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(REGULAREXPRESSION);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static final String[] validAccount = new String[] { "(84)-(0927385746)", "(86)-(02736482734)", "(76)-(0827364826)", "(87)-(1293476973)","(65)+(0233749823)" };

    public static void main(String args[]) {
        for (String account : validAccount) {
            boolean isvalid = validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }

    }
}
