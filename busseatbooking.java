import java.util.Scanner;

public class busseatbooking {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int booked=0;
        for(int i=1;i<=10;i++){
            System.out.println("Is seat"+i+"booked?(Y/N):");
            String input=scanner.next();
            if(input.equalsIgnoreCase("Y")) booked++;
        }
        System.out.println("Booed Seats:"+booked);
        System.out.println("Available Seats:"+(10-booked));
    }
}
