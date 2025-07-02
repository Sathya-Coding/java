import java.util.Scanner;

public class summultiarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] value = new int[2][3];
        System.out.println("Enter the elements");
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                value[i][j] = scanner.nextInt();}
        }
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                sum+=value[i][j];
            }
        }
        System.out.println("Sum of elements: " + sum);
    }
}

