import java.util.Scanner;

public class palindrome {
public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a string");
    String input =scanner.nextLine().toLowerCase();
    String reversed="";
    for(int i=input.length()-1;i>=0;i--){
      reversed=reversed+input.charAt(i);
    }
    if(input.equals(reversed)){
        System.out.println("The string is palindrome");
    }
    else{
        System.out.println("The string is not palindrome");
    }
}
}
