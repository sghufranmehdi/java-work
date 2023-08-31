public class L10_IncDec {
    public static void main(String[] args) {

        /*
        Resulting data type after arithmetic operation
            Result = byte + short -> integer
            Result = short + integer -> integer
            Result = long + float -> float
            Result = integer + float -> float
            Result = character + integer -> integer
            Result = character + short -> integer
            Result = long + double -> double
            Result = float + double -> double
         */


        /*
        a++ -> first use the value and then increment
        ++a -> first increment the value then use it
         */
        int i = 56;
        System.out.println("i++"+ i++); //same i (first assigned then incement)
        System.out.println(i); //incremented i
        System.out.println(++i); //first increment then assigned
        System.out.println(i);

        char ch = 'b';
        System.out.println(ch++); //printed b then incemented to c
        System.out.println(++ch); // got c as an input first incement then printed d as a char

    }
}
