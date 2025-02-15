
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter beginning number:");
        int beg = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter ending number:");
        int end = Integer.parseInt(scanner.nextLine());
        divisibleByThreeInRange(beg, end);

    }

    public static void divisibleByThreeInRange(int beg, int end) {
        int i = beg;
        while (i <= end) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
