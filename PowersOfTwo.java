import java.util.Scanner;

/**
 * Created by teodor donchev on 2/17/2018.
 */
public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int num = 1;

        for (int i = 0; i <= n; i++) {
            System.out.println(num);
            num *= 2;
        }
    }
}
