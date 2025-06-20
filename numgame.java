import java.util.Scanner;

public class numgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Guessing number");
        int attempts = 10;
        int randomnum =7;
        int guess;
        do {
            guess = scanner.nextInt();
            attempts++;
            if(guess==randomnum)
            {
                System.out.println("Choose the correct Guessing numer ");
            }
            else{
                System.out.println("Choose the wrong guessing number");
            }
        }
        while(attempts<10);
    }
}