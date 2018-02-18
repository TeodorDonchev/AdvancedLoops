import java.util.Scanner;

/**
 * Created by teodor donchev on 2/17/2018.
 */
public class NumbersNto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
