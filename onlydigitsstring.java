import java.util.Scanner;

public class onlydigitsstring {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=scanner.nextLine();
        boolean digits=input.matches("\\d+");
        System.out.println(digits);
    }
}
