public class callingmethod {
    int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        callingmethod c=new callingmethod();
        System.out.println("Sum:"+c.add(5,4));
    }
}