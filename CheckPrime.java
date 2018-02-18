import java.util.Scanner;

/**
 * Created by teodor donchev on 2/17/2018.
 */
public class CheckPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if(number < 2){
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0){
                System.out.println("Not Prime");
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime");
        }
    }
}
