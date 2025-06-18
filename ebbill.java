import java.util.Scanner;

public class ebbill {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int total=0;
        for(int i=1;i<=6;i++){
            System.out.println("Enter the units for month"+i+":");
            int units=sc.nextInt();
            total+=units;
        }
        double average=total/6.0;
        System.out.println("Total units:"+total);
        System.out.println("Average units:"+average);
        if (average>300)
            System.out.println("Usage:High");
        else if(average>150)
            System.out.println("Usage:Medium");
        else
            System.out.println("usage:Low");
    }
    }

