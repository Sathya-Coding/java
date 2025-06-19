import java.util.Scanner;

public class atmdowhile {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int correctPIN=1234;
        int pinattempts=0;
        do {
            System.out.println("Enter the PIN:");
            int pin = scanner.nextInt();
            pinattempts++;
            if (pin == correctPIN) {
                System.out.println("Access Granted");
                break;
            } else {
                System.out.println("Wrong PIN");
            }
        }
            while (pinattempts < 3) ;
            if (pinattempts == 33 && correctPIN != correctPIN) {
                System.out.println("Card Blocked ");
            }

    }
}
