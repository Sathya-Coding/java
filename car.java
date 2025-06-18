import java.util.Scanner;

public class car {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the km");
    double totalfare=scanner.nextDouble();
    double distancedtravelled=12.75;
    double fareperkm=15.5;
    int waitingtime=10;
    totalfare=distancedtravelled*fareperkm;
    double waitingchargepermin=2.0;
    double waitingcharge=waitingtime*waitingchargepermin;
    double finalbill=totalfare+waitingcharge;
    int roundoffinalbill=(int) finalbill;
    System.out.println("distancefare: km"+totalfare);
    System.out.println("waitingcharge: km"+waitingcharge);
    System.out.println("finalbill: km"+roundoffinalbill);
    }
}
