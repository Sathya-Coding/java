import java.util.Scanner;

public class secondlargenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter the elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
            int largest=Integer.MIN_VALUE;
            int secondlargestnumber =Integer.MIN_VALUE;
            for (int i=0;i<array.length;i++) {
                if (array[i] > largest) {
                    secondlargestnumber = largest;
                    largest = array[i];

                } else if (array[i] > secondlargestnumber && array[i] != largest) {
                    secondlargestnumber = array[i];
                }
            }
            if(secondlargestnumber==Integer.MIN_VALUE) {
            System.out.println("There is no second largest number");
            }
            else{
            System.out.println("The second largest number is: "+secondlargestnumber);
        }
    }
}
