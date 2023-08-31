import java.util.ArrayDeque;

public class L93_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        //add will insert element at the end of que
        ad.add(78);
        ad.add(6);
        ad.add(90);
        ad.add(45);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        ad.addFirst(825);
        System.out.println(ad.getFirst());



    }
}
