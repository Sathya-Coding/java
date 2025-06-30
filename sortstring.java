import java.util.Arrays;

public class sortstring {
    public static void main(String[] args) {
        String fruits[] = {"apple", "orange", "banana", "grapes"};
        System.out.println("Original fruits");
        for (String fruit : fruits) {
            Arrays.sort(fruits);
            System.out.println("Strings sort in alphabetically: "+fruit);
        }
        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}