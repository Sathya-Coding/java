import java.util.Scanner;
public class Ecommerce {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the Itemprice");
        double totalprice=scanner.nextDouble();
        int quantity=3;
        double finalprice=(quantity*totalprice);
        int roundoftotalprice=(int) finalprice;
        System.out.println("Enter the payable amount"+roundoftotalprice);

    }
}
