import java.util.Scanner;

public class array2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int arr[];
        arr=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        for(int i=0;i<arr.length;i++){
            System.out.println("Elements at index"+i+":"+ arr[i]);
        }
    }
}
