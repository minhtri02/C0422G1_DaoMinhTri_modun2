package ss1_introduction_java.exrcise;

import java.util.Scanner;

public class ReadNumberChar {
    public static String Nhohon10(int number) {
        String str;
        switch (number) {
            case 0:
                str = "zero";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
            default:
                str = "";
        }
        return str;
    }

    public static String Nhohon20(int number) {
        String str;
        switch (number) {
            case 1:
                str = "eleven";
                break;
            case 2:
                str = "twelve";
                break;
            case 3:
                str = "thirteen";
                break;
            case 4:
                str = "fourteen";
                break;
            case 5:
                str = "fiveteen";
                break;
            case 6:
                str = "sixteen";
                break;
            case 7:
                str = "seventeen";
                break;
            case 8:
                str = "eighteen";
                break;
            case 9:
                str = "nineteen";
                break;
            default:
                str = "";
        }
        return str;
    }

    public static String Hangchuc(int number) {
        String str;
        switch (number) {
            case 2:
                str = "twenty";
                break;
            case 3:
                str = "thirty";
                break;
            case 4:
                str = "fourty";
                break;
            case 5:
                str = "fivety";
                break;
            case 6:
                str = "sixty";
                break;
            case 7:
                str = "seventy";
                break;
            case 8:
                str = "eighty";
                break;
            case 9:
                str = "ninety";
                break;
            default:
                str = "";
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đọc số từ 0-999");
        String str;
        int number = Integer.parseInt(scanner.nextLine());
        if (number <= 10) {
            str = Nhohon10(number);
            System.out.println(str);
        } else if (number < 20) {
            str = Nhohon20(number % 10);
            System.out.println(str);
        } else if (number <= 99) {
            if (number % 10 == 0) {
                str = Hangchuc(number / 10);
                System.out.println(str);
            } else {
                str = Hangchuc(number / 10) + " ";
                str += Nhohon10(number % 10);
                System.out.println(str);
            }
        } else if (number < 1000) {
            if (number % 100 == 0) {
                str = Nhohon10(number / 100) + " hundred";
                System.out.println(str);
            } else if (number % 100 / 10==1){
                str = Nhohon10(number / 100) + " hundred and ";
                str += Nhohon20(number % 100 % 10) ;
                System.out.println(str);
            }else {
                str = Nhohon10(number / 100) + " hundred and ";
                str += Hangchuc(number % 100 / 10) + " ";
                str += Nhohon10(number % 100 % 10);
                System.out.println(str);
            }
        }
    }
}