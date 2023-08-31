public class L15_Practice {
    public static void main(String[] args) {
        //Q1 convert string into lower string
        String name = "GHUFRAN";
        name = name.toLowerCase();
        System.out.println(name);

        //Q2 replace space with underscores
        String text = "Here is the text you have to convert space with underscores";
        text=text.replace(" ", "_");
        System.out.println(text);

        //Q3 Replace name with your name
        String letter = "Dear name, Thanks alot";
        letter = letter.replace("name", "Ghufran");
        System.out.println(letter);

        //Q4 Write a java prog to detect double and tripple spaces in a string
        String myString = "This String contains  double and   triple space";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Q5 Letter using escape sequenc
        String ll = "Dear Ghufran,\n\tYou are going amazing in this course.\n\tThanks";
        System.out.println(ll);


    }
}
