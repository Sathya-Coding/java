public class averageage {
    public static void main(String[]args){
        int age[]=new int[5];
        age[0]=25;
        age[1]=59;
        age[2]=32;
        age[3]=21;
        age[4]=46;
        int sum=0;
        for(int i=0;i<age.length;i++) {
            sum += age[i];
        }
        double average=(double)sum/age.length;
            System.out.println("The average age is"+average);
    }
}
