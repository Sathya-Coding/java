import java.util.Scanner;

public class removespacestring {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=scanner.nextLine();
        String removespace=input.replaceAll("\\s+","");
        System.out.println("The remove spaces string is: "+removespace);
    }
}
