package ss8_clear_code.practice;

public class SplitVariable {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}
