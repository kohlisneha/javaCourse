import java.util.Scanner;
public class ReverseNumber {
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static int calculateAverage(int num) {
        int digitSum = 0;
        int digitCount = 0;

        while (num != 0) {
            int digit = num % 10;
            digitSum += digit;
            digitCount++;
            num /= 10;
        }
            return digitSum/digitCount;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int reversedNumber = reverse(number);
        int average = calculateAverage(number);

        System.out.println("Initial  number is : " + number);
        System.out.println("Reversed number is : " + reversedNumber);
        System.out.println("Average of digits is: " + average);
    }
}
