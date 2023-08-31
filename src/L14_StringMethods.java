public class L14_StringMethods {
    public static void main(String[] args) {

        String name = "Ghufran";
        // String are immutable thats why assigning changes to new string object
        /*
        System.out.println(name);

        //commonly used methods
        int value = name.length();// for length of string
        System.out.println(value);

        String lower = name.toLowerCase();
        System.out.println(lower);

        String upper = name.toUpperCase();
        System.out.println(upper);

        String nonTrimed = "      Ghufran    ";
        System.out.println(nonTrimed);
        String trimmed = nonTrimed.trim();// return string without spaces
        System.out.println(trimmed);


        System.out.println(name.substring(3));
        //enter start index and rest of the string prints (indexing starts from 0)
        System.out.println(name.substring(0));
        // gray because it is redundant cz you are printing whole string so no nned to use substring
        System.out.println(name.substring(2,7)); //strt is included end is not

        System.out.println(name.replace('r','R')); //replace char with char
        System.out.println(name.replace("ran", "RAN")); // replace many char
        System.out.println(name.replace("r", "RAN"));// index change


        System.out.println(name.startsWith("G")); //boolean
        System.out.println(name.startsWith("Ghu"));
        System.out.println(name.startsWith("Z"));

        System.out.println(name.endsWith("ran"));


        System.out.println(name.charAt(2)); // return value at index


        String modifiedName = "Ghufranran";
        System.out.println(modifiedName.indexOf("an",7));// if u want to chosse from specific index
        //System.out.println(name.indexOf("r"));// returns first index of that char
        //returns -1 if didnt found the match


        //System.out.println(name.lastIndexOf('r'));// return last matched in the string if didnt match return -1
        // indexof() starts matching from left and lastIndexOf() strts from right side of the array

        String modifiedName = "abdcbdefghabcd";
        System.out.println(modifiedName.lastIndexOf('b',5));
        System.out.println(modifiedName.lastIndexOf("bd",5));//search b before index 5
        //can be used on both ch and string


        System.out.println(name.equals("Ghufran"));//case sensitive
        System.out.println(name.equalsIgnoreCase("ghufran"));

         */
        //Escape sequenxe character
        System.out.println("i am escape sequence \" Double quote");
        System.out.println("i am escape sequence \\ BackSlash");// 1 backslash to print and one for escape sequence
        System.out.println("i am escape sequence \n with a new line");







    }
}
