import java.util.HashSet;

public class L95_HashSet {
    public static void main(String[] args) {
        //Simple Constructor
        HashSet<Integer> hs1 = new HashSet();
        //initial cap: 16 and load factor: 0.75

        //Constructor with initial capacity
        HashSet<Integer> hs2 = new HashSet(6);
        //initial cap: 6

        //Constructor with initial capacity and initial load factor
        HashSet<Integer> hs3 = new HashSet(9,0.5f);
        //initial cap: 9 and load factor: 0.5

        hs1.add(6);
        hs1.add(8);
        hs1.add(3);
        hs1.add(11);
        hs1.add(11);
        System.out.println(hs1);

    }
}
