public class L27_ForEach {
    public static void main(String[] args) {
        int [] marks ={1,2,3,4,5,6,7,8,9,5};
        float[] fmarks = {12.3f,12,4,12.5f};
        String [] names = {"Muhammad","Ghufran","Mehdi"};
        //System.out.println(names[0]);

        //System.out.println(marks.length);// for length of array

        //Display array element using for loop
        for (int i = 0 ; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("Reverse");
        for (int ii = marks.length-1 ; ii>=0; ii--)//length-1 because arrays strts from index 0
        {
            System.out.println(marks[ii]);
        }
        //For Each Loop
        for (int element: marks)
        {
            System.out.println(element);
        }



    }
}
