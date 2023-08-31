package folder.folder1.folder2;
class Motor{
    protected int protectedInt = 4;
    int defaultInt =41;


}
class Car extends Motor{
    void car2()
    {
        System.out.println(protectedInt);
        System.out.println(defaultInt);

    }
    void sum(int a, int b){
        // a and b are parameters
    }

}
public class L67_1_Practice {
    public static void main(String[] args) {
        //Create a package in class with three package levels folder , folderL1 , folderL2

        Car c = new Car();
        c.car2();

        //sum(5,7) 5 and 7 are arguments tht are real
    }
}
