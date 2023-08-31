public class L29_Practice {
    public static void main(String[] args) {
        // 5 floats and calculate sum
        /*
        float [] arr = {50.3f,70.4f,80.5f,76.6f,95.1f};
        float sum = 0;
        for (int i = 0 ; i<arr.length; i++)
        {
            sum=sum+arr[i];

        }
        System.out.println(sum);


        //-----------------------
        //findout whether the integer is in array of not?
        int [] array = {1,2,3,4,5};
        int match=3;
        boolean isInArray = false;
        int index=0;
        for (int j = 0 ; j<array.length; j++)
        {
            if (array[j]==match)
            {
                //System.out.println("Integer is at index "+j);
                isInArray=true;
                index=j;
                break;
            }
        }
        if (isInArray==true)
        {
            System.out.println("Value is present in  at index "+index);
        }
        else {
            System.out.println("Value is not present in the array");
        }



        //-------------------------
        //Avg marks of physics using for each loop
        int [] marks = {80,75,88,90,80};
        int sum = 0;
        float avg=0.0f;
        for (int element: marks)
        {
            sum=sum+element;

        }
       // avg= sum/5;
       // System.out.println(avg);
        System.out.println("Value of avg marks "+sum/marks.length);




        //-------------------------
        //add two matrix of sign 2*3
        int sum = 0;
        int arr [][];
        arr=new int[2][3];
        arr[0][0]=10;
        arr[0][1]=10;
        arr[0][2]=10;
        arr[1][0]=10;
        arr[1][1]=10;
        arr[1][2]=10;

        for (int i = 0 ; i<arr.length; i++)
        {
            for (int j = 0 ; j<arr[i].length; j++)
            {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);

        -----------------
        */

/*

//        //To reverse an arry

        int []arr= {1,2,3,4,5};
        int []rev = new int[arr.length];
        for (int i = arr.length-1; i>=0; i--)
        {
            for (int j=0 ;j<rev.length;j++)
            {
                rev[j] = arr[i];

            }
            System.out.print(rev[i]+" ");


        }

        //harry way

        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

        //my way
        int [] array = {1,2,3,45,56};
        int mid= array.length/2;
        for (int j = 1;j<= mid;j++)
        {
            int temp = array[mid+j];
             array[mid+j] = array[mid-j];
             array[mid-j]=temp;

        }
        for (int i = 0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }

                // reverse an array

       // int b = 5/2;
       // System.out.println(b);

        int [] arr = {1,2,3,4,5,6,7};
        int l = arr.length;
        int mid = Math.floorDiv(arr.length, 2); //greatest int
       for (int i = 0; i<mid; i++)
       {
           //swap a[i] and a[l-1-i];
           int temp = arr[i];
           arr[i] = arr[l-1-i];
           arr[l-1-i]=temp;

       }
        for (int element:arr) {
            System.out.print(element+ " ");

        }


        //--------------------
        // add two 2*3 matrix
        int [][] a;
        a=new int[2][3];
        int [][] b;
        b=new int[2][3];
        a[0][0]=10;
        a[0][1]=10;
        a[0][2]=10;
        a[1][0]=10;
        a[1][1]=10;
        a[1][2]=10;
        b[0][0]=10;
        b[0][1]=10;
        b[0][2]=10;
        b[1][0]=10;
        b[1][1]=10;
        b[1][2]=10;

        //noob way
        for (int i = 0 ; i<a.length; i++)
        {
            for (int j = 0 ; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+b[i][j]);

                System.out.print(" ");
            }
            System.out.println("\n");

        }



        //adv way

        int [][] mat1 = {{1,2,3},
                         {4,5,6}};//2*3 matrix as
        // 1 2 3
        // 4 5 6
        int [][] mat2 = {{1,2,3},
                         {4,-5,6}};
        int [][] result = {{0,0,0},
                           {0,0,0}};


        for (int i = 0 ; i<mat1.length; i++)
        {
            for (int j = 0 ; j<mat1[i].length; j++)
            {
                result[i][j]= mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }


        //using %d result

        int [][] mat1 = {{1,2,3},
                {4,5,6}};//2*3 matrix as
        // 1 2 3
        // 4 5 6
        int [][] mat2 = {{1,2,3},
                {4,-5,6}};
        int [][] result = {{0,0,0},
                {0,0,0}};

        for (int i = 0 ; i<mat1.length; i++)
        {
            for (int j = 0 ; j<mat1[i].length; j++)
            {
                //System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]= mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }
        //------------------


        //-------------------
        //find max
        int [] arr = {12,2,3,4,57,6,1,0,-2,45,67};
        int max=Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        //System.out.println("max:"+ max);
        //System.out.println("min:"+ min);
        for (int i = 0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];

            }
            if(arr[i]<min)
            {
                min = arr[i];

            }
        }
        System.out.println("max:"+ max);
        System.out.println("min:"+ min);


        //----------------------------
        //check wheter the array is sorted or not
        //int [] arr = {12,2,2,3,4,57,6,1,0,-2,45,67};
        int [] arr = {1,2,3,4,5};
        boolean isSorted = true;
        for (int i=0;i< arr.length-1;i++)//-1 because on the last no element too compare
        {
             if(arr[i]>arr[i+1])
             {
                 isSorted=false;
                 break;
             }
        }
        if(isSorted)
        {
            System.out.println("Sorted");

        }
        else
        {
            System.out.println("Not Sorted");
        }


    */



















    }
}
