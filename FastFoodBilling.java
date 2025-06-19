import java.util.Scanner;

public class FastFoodBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int total = 0;
        System.out.println("1.Pizza-Rs.150");
        System.out.println("2.Burger-Rs.100");
        System.out.println("3.Cake-Rs.50");
        System.out.println("Exit");
        do {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: total += 100;break;
                case 2: total += 150;break;
                case 3: total += 50;break;
                case 4: break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        while (choice< 4) ;
        System.out.println("Total Bill:Rs."+total);
    }
}
