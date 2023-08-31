import java.util.ArrayList;
import java.util.LinkedList;

public class L92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(6);
        l.add(67);
        l.add(76);
        l.add(69);
        l.add(60);
        l.add(63);
        l.add(622);
        l.add(6);
        l.add(3,99);
//        for(int i = 0; i<l.size();i++)
//        {
//            System.out.println(l.get(i));
//        }
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l.addAll(0,l2);

//        for(int i = 0; i<l.size();i++)
//        {
//            System.out.println(l.get(i));
//        }


        //l.clear();



        System.out.println(l.contains(4));
        System.out.println(l.indexOf(4));
        System.out.println(l.lastIndexOf(6));
//        for(int i = 0; i<l.size();i++)
//        {
//            System.out.print(l.get(i));
//            System.out.print(", ");
//        }

        l.add(1,5998);
        l.addFirst(9999);
        l.addLast(9999);

        for(int i = 0; i<l.size();i++)
        {
            System.out.print(l.get(i));
            System.out.print(", ");
        }

    }
}
