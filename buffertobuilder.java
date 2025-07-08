public class buffertobuilder {
    public static void main(String[]args){
        StringBuffer sbr = new StringBuffer("sathya");
        String s = sbr.toString();
        StringBuilder sbl = new StringBuilder(s);
        System.out.println(sbl);
    }
}
