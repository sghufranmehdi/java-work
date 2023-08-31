public class L28_MultiArray {
    public static void main(String[] args) {
        //Array of array
        int [] marks;
        int [][] flats;// 0 points as ground floors flat
        flats = new int[2][3];// 2 rows 3 colums
        //2 floors each floor contains 3 room
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=303;
        //printing 2 d array using for nested loop
        for (int i = 0 ; i<flats.length; i++)
        {
            for (int j = 0 ; j<flats[i].length; j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }





    }
}
