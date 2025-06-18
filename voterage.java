import java.util.Scanner;

public class voterage {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int eligible=0;
        for(int i=1;i<=10;i++){
            System.out.println("Enter the age person"+i+":");
            int age=scanner.nextInt();
            if(age>18)eligible++;
        }
        System.out.println("Eligible voters:"+eligible);
        System.out.println("Not eligible:"+(10-eligible));
    }
}
