
class Emp {
    // only 1 public class in 1 prog
    int id;
    String name;
    int salary;

    public void printDetails()
    {
        System.out.println(id);
        System.out.println(name);
        //System.out.println(salary);
    }
    public int getSalary( )
    {
        return salary;
    }

}

public class L38_CustomClass {

    public static void main(String[] args) {
        Emp ghufran = new Emp(); //instatiating an obj named ghufran
        ghufran.id=10;//setting attributes
        ghufran.name= "Ghufran";
        ghufran.salary = 10000;


        int salary = ghufran.getSalary();
        System.out.println(salary);
        ghufran.printDetails();

        Emp john = new Emp() ; //instatiating an obj named ghufran
        john.id=15;//setting attributes
        john.name= "John";
//        john.salary = 5000;
        john.printDetails();



    }
}
