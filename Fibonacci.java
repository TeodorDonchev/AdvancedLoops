import java.util.Scanner;

/**
 * Created by teodor donchev on 2/17/2018.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        if(n < 2){
            System.out.println(1);
            return;
        }

        int f0 = 0;
        int f1 = 1;
        int fSum = 0;

        for (int i = 0; i < n; i++) {
            fSum = f0 + f1;
            f0 = f1;
            f1 = fSum;
        }

        System.out.println(fSum);
    }
}
