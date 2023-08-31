class MyEmployee
{
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

public class L40_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee gh = new MyEmployee();
//        gh.id = 45;
//        gh.name = "Ghufran"; //if private not access directly
        gh.setN("Ghufran");
        gh.setI(67);
        System.out.println(gh.getI());
        System.out.println(gh.getN());





    }
}
