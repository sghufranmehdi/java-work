import java.lang.reflect.Array;
import java.util.*;
public class L91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
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
        ArrayList<Integer> l2 = new ArrayList<>();
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

        for(int i = 0; i<l.size();i++)
        {
            System.out.print(l.get(i));
            System.out.print(", ");
        }

    }
}
