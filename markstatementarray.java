import java.util.Scanner;

public class markstatementarray {
    public static void main(String[] args) {
        int[] marks = {90,96,95,97,92};
        int total = 0;
        int max =marks[0];
        int min=marks[0];
        for (int i=0;i<marks.length;i++) {
            total += marks[i];
            if (marks[i]>= max) {
                max=marks[i];

            }
       else if (marks[i]<min) {
            min=marks[i];

        }
        }
        System.out.println("The highest mark is:" + max);
        System.out.println("The lowest mark is:" + min);
        double average= total / 5.0;
         {
            System.out.println("The average mark is:" + average);
        }
    }
}
