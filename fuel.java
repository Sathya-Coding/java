import java.util.Scanner;

public class fuel {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the totaldistance(in km)");
        double totalfuelcost=scanner.nextDouble();
        int distance=450;
        int milege=18;
        double fuelneeded=distance/milege;
    }
}
