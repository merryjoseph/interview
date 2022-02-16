import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your day: ");
        String day = sc.next();
        System.out.print("Enter your number: ");
        int no = sc.nextInt();
//        char gender = sc.next().charAt(0);
//        int age = sc.nextInt();

        Map m1 = new HashMap();
        m1.put(1,"Monday");
        m1.put(2,"Tuesday");
        m1.put(3,"Wednesday");
        m1.put(4,"Thursday");

       // System.out.println(m1.size());

        int add = 0 ;
        for(int i=1;i<=m1.size();i++){
          if(m1.get(i).equals(day)){
              add = i+no;
          }

        }
        if(add>m1.size()){
            add = add- m1.size();
        }
        System.out.println(m1.get(add));

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        //System.out.println(a);

        a.forEach(n-> System.out.println(n));
        a.forEach(n-> { if(n%2==0) System.out.println(n); });

        Collections.sort(a, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
    }
}
