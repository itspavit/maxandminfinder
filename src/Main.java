import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        minimumNumber(number1,number2,number3);
        maximumNumber(number1,number2,number3);
    }

    private static void minimumNumber(int number1, int number2, int number3){
        int minimum;
        if(number1>number2 && number1>number3 && number3>number2) {
            minimum = number2;
        } else if (number2>number1 && number2>number3 && number1>number3) {
            minimum = number3;
        }else {
            minimum = number1;
        }
        System.out.println("This is the smallest/minimum from the 3 numbers: " + minimum);
    }

    private static void maximumNumber(int number1, int number2, int number3){
        int maximum;
        if(number1>number2 && number1>number3){
            maximum = number1;
        } else if (number2> number1 && number2>number3) {
            maximum = number2;
        }else {
            maximum = number3;
        }
        System.out.println("This is the largest/maximum from the 3 numbers: " + maximum);
    }
}