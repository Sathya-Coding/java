import java.util.Scanner;

public class removespacestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a words");
        String input = scanner.nextLine();
        String result = input.replaceAll("\\s+", "");
        System.out.println(result);
    }
}
