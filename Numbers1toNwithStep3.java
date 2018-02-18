import java.util.Scanner;

/**
 * Created by teodor donchev on 2/17/2018.
 */
public class Numbers1toNwithStep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}
