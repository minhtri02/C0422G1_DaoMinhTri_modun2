package Common;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer tset;
        do {
             tset = Integer.parseInt(scanner.nextLine());
        }while (! CheckRegex.checkRegexFacilityName(tset.toString()));
        String po = tset.toString();
        System.out.println(po);

    }
}
