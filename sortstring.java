import java.util.Arrays;
import java.util.Scanner;

public class sortstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println("Sorted string: " + sorted);
    }
}

