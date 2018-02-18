import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

/**
 * Created by teodor donchev on 2/17/2018.
 */
public class NumberInRange1to100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Еnter a number in the range [1...100]: ");

        int number = Integer.parseInt(scan.nextLine());

        System.out.println();

        while(number < 1 || number > 100){
            System.out.println("Invalid number!");

            System.out.print("Еnter a number in the range [1...100]: ");

            number = Integer.parseInt(scan.nextLine());
        }

        System.out.printf("The number is: %d", number);
    }
}
