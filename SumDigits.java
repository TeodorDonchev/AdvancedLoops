import java.util.Scanner;

/**
 * Created by teodor donchev on 2/17/2018.
 */
public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int sum = 0;

        while(number > 0){
            sum += number % 10;

            number /= 10;
        }

        System.out.println(sum);
    }
}
