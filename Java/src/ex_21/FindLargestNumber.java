package ex_21;
import java.util.Scanner;
public class FindLargestNumber {
    public void determineLargestValue() {
        Scanner input = new Scanner(System.in);

        int intCounter = 0;
        int total=0;
        int number;
        int largest;

        System.out.println("Enter number: ");
        largest = input.nextInt();
        total += largest;

        while (intCounter < 9) {
            System.out.println("Enter number: ");
            number = input.nextInt();
            if (number > largest) {
                largest = number;
            }
            total += number;
            intCounter++;
        }
    }
}
