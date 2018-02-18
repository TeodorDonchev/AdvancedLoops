import java.util.Scanner;

/**
 * Created by teodor donchev on 2/17/2018.
 */
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int counter = 1;
        int num = 1;

        while(num <= n){

            for (int i = 0; i < counter; i++) {
                System.out.print(num + " ");
                num++;

                if(num > n){
                    return;
                }
            }
            counter++;
            System.out.println();
        }
    }
}
