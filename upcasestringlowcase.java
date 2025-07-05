
import java.util.Scanner;

public class upcasestringlowcase {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=scanner.nextLine();
        String output=input.toLowerCase();
        System.out.println("The lowercase string:"+output);
        String output2=input.toUpperCase();
        System.out.println("The uppercase String:"+output2);
    }
}
