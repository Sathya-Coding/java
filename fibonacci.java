public class fibonacci {
    public static void main(String[]args){
        int fib[]=new int[5];
        int first=0;
        int second=1;
        System.out.println("Enter the series"+first+second+":");
        for(int i=0;i<=5;i++) {
            int next = first + second;
            first=second;
            second=next;
            System.out.println("fibbonacci Series:" + next);
        }
    }
}
