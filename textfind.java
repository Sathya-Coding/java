import java.util.Scanner;

public class textfind {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String names[]={"sathya","mani","magizhini"};
        System.out.println("Enter the name");
        String wordToCheck=scanner.nextLine();
        boolean found=false;
        for(String name:names){
          if(name.equals(wordToCheck)) {
              found=true;
              break;
          }
        }
        if  (found)
System.out.println("the checking name is correct"+wordToCheck);
     else
     System.out.println("The name is not correct");
    }
}
