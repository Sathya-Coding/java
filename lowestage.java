public class lowestage {
    public static void main(String[]args){
        int[]age={24,99,36,77,38};
        int minage=age[0];
        for(int a:age) {
            if (a < minage) {
                minage=a;
            }
        }
        System.out.println("The lowest age is:"+minage);
    }
}
