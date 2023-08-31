class MyMainEmployee
{
    public MyMainEmployee()//non parametric constructor
    {
        id = 0;
        name = "Sample";
    }
    //overloading of constructor
    public MyMainEmployee(int i,String na)//parametric constructor
    {
        id = i;
        name = na;
    }
    private int id;
    private String name;

    public void setN(String n)
    {
        name = n;
    }
    public String getN()
    {
        return name;
    }

    public void setI(int n)
    {
        id = n;
    }
    public int getI()
    {
        return id;

    }

}
public class L42_Constructor {//used to initialize object with default value
    public static void main(String[] args) {
        //MyMainEmployee e  = new MyMainEmployee(56,"Ghufran Mehdi");
        MyMainEmployee e  = new MyMainEmployee();
// values set by constructor
        System.out.println(e.getI());
        System.out.println(e.getN());

        e.setN("Ghufran");
        e.setI(59);

//values set by setter getters
        System.out.println(e.getI());
        System.out.println(e.getN());

    }
}
