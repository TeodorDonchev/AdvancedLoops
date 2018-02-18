import java.util.Scanner;

/**
 * Created by teodor donchev on 2/17/2018.
 */
public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            try {
                System.out.print("Enter even number: ");

                int number = Integer.parseInt(scan.nextLine());

                if(number % 2 == 0){
                    System.out.printf("Even number entered: %d", number);
                    break;
                }
                System.out.println("The number is not even.");

            }catch(NumberFormatException numberException){
                System.out.println("Invalid number!");
            }
        }
    }
}
