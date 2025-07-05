import java.util.Scanner;

public class trimstring {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=scanner.nextLine();
        String Text=input.trim();
        System.out.println("The trim string is:"+Text);
    }
}

