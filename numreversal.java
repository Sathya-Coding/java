import java.util.Scanner;

public class numreversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int rev=0;
        do{
            rev=rev*10+num%10;
            num/=10;
        }while(num!=0);
        System.out.println("Reversed number:"+rev);
    }
}