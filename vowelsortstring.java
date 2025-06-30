import java.util.Locale;
import java.util.Scanner;

public class vowelsortstring {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String[]vowel={"a","e","i","o","u"};
        System.out.println("Enter a string");
        String input=scanner.nextLine().toLowerCase();
        boolean hascheckvowel=false;
        for(int i=0;i<vowel.length;i++){
            if(input.contains(vowel[i]))
            hascheckvowel=true;
            break;
        }
        if(hascheckvowel)
        {
            System.out.println("The String has vowel");
        }
        else{
            System.out.print("The string is not vowel");
        }
    }
}
