import java.util.StringTokenizer;

public class demo2 {
    public static void main(String[] args) {
        String s = "New";
        String s1 = "New";
        String s2 = new String("New");
        String s3 = new String("New");

        System.out.println(s==s1);
        System.out.println(s==s2);
        System.out.println(s2==s3);
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s2.equals(s3));

        String s4 = "Hello World!, How are you";
        StringTokenizer stringTokenizer = new StringTokenizer(s4);
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
