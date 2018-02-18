import java.util.Scanner;

/**
 * Created by teodor donchev on 2/18/2018.
 */
public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if(n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0){
                            output.append(String.format("%d%d%d%d ", i, j, k, l));
                        }
                    }
                }

            }
        }
        System.out.println(output);
    }
}
