public class convertbuffertbuildertostring {
    public static void main(String[]args){
        StringBuffer sbr=new StringBuffer("priya");
        StringBuilder sbr2=new StringBuilder("sathya");
        String s1=sbr.toString();
        System.out.println(s1);
        String s2=sbr2.toString();
        System.out.println(s2);
        sbr.append("sathyapriya");
        System.out.println(sbr);
        System.out.println(s1);
    }
}
