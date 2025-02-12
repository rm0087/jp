
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sum = 0;
            int count = 0;
            int even = 0;
            int odd = 0;

            while (true) {
                System.out.println("Write numbers:");
                int x = Integer.valueOf(scanner.nextLine());
                

                if (x == -1) {
                    double avg = sum * 1.0 / count;
                    System.out.println("Thx! Bye!");
                    System.out.println("Sum: " + sum);
                    System.out.println("Numbers: " + count);
                    System.out.println("Average: " + (avg));
                    System.out.println("Even: " + even);
                    System.out.println("Odd: " + odd);
                    break;
                }

                if (x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

                sum += x;
                count++;
            }
        }
    }
}
