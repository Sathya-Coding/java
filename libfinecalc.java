import java.util.Scanner;

public class libfinecalc {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int totalfine=0;
        for(int i=1;i<=7;i++){
            System.out.println("Enter the days for late day" +i+ ":");
            int days=scanner.nextInt();
            totalfine+=days;
        }
        System.out.println("Total Fine:Rs."+totalfine);
    }
}
