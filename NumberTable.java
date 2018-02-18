import java.util.Scanner;

/**
 * Created by teodor donchev on 2/17/2018.
 */
public class NumberTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int row = 1; row <= n ; row++) {
            int left = row;
            int right = n - 1;

            for (int col = 1; col <= n; col++) {
                if(left <= n){
                    System.out.print(left + " ");
                    left++;
                }else{
                    System.out.print(right + " ");
                    right--;
                }
            }
            System.out.println();
        }
    }
}
