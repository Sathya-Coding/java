import java.util.Scanner;

public class titlecase {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence:");
            String input = scanner.nextLine();
            String[] words = input.split("\\s+");
            StringBuilder titleCase = new StringBuilder();
            for (String word : words) {
                if (!word.isEmpty()) {
                    titleCase.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1).toLowerCase())
                            .append(" ");
                }
            }
            System.out.println("Title Case: " + titleCase.toString().trim());
        }
    }


