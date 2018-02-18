import java.util.Scanner;

/**
 * Created by teodor donchev on 2/18/2018.
 */
public class StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());;
        int l = Integer.parseInt(scan.nextLine());;

        for (int num1 = 1; num1 <= n; num1++) {
            for (int num2 = 1; num2 <= n; num2++) {
                for (char letter1 = 'a'; letter1 < 'a' + l; letter1++) {
                    for (char letter2 = 'a'; letter2 < 'a' + l; letter2++) {
                        for (int num3 = Math.max(num1, num2) + 1; num3 <= n; num3++) {
                            System.out.printf("%d%d%s%s%d ", num1, num2, letter1, letter2, num3);
                        }
                    }
                }
            }
        }
    }
}
