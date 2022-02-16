import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(1,2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        System.out.println(list.subList(1,3));

        list.remove(1);
        list.remove(1);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains(4));

        System.out.println(list.get(1));

        System.out.println(list.indexOf(4));
    }
}
