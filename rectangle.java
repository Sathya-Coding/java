import java.util.Scanner;

class rectangleprogram {
    double length;
    double breadth;

    void display(double l, double b) {
        length = l;
        breadth = b;
    }

    double getArea() {
        return length * breadth;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }

    void display2(int number) {
        System.out.println("Rectangle" + number + ":");
        System.out.println("Area:" + getArea());
        System.out.println("Perimeter:" + getPerimeter());
        System.out.println("-----------------------");
    }
}
public class rectangle{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        rectangleprogram rec1=new rectangleprogram();
        rectangleprogram rec2=new rectangleprogram();
        System.out.println("Enter the length and breath of rectangle1:");
        double l1=scanner.nextDouble();
        scanner.nextLine();
        double b1=scanner.nextDouble();
        scanner.nextLine();
        rec1.display(l1,b1);
        System.out.println("Enter the length and breath of rectangle 2:");
        double l2=scanner.nextDouble();
        scanner.nextLine();
        double b2=scanner.nextDouble();
        scanner.nextLine();
        rec2.display(l2,b2);
        rec1.display2(1);
        rec2.display2(2);
    }
}
