import java.util.Scanner;

/**
 * Created by teodor donchev on 2/17/2018.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int factorial = 1;

        while(number > 0){
            factorial *= number;
            number--;
        }

        System.out.println(factorial);
    }
}
