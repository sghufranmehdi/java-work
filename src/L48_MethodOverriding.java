class A{
    int harry()
    {
        return 4;
    }
    void meth2()
    {
        System.out.println("meth2 method in class A");
    }
}
class B extends A{

    @Override
    void meth2()
    {
        System.out.println("meth2 method in class B");
    }
    void meth3()
    {
        System.out.printf("I am 3rd method of class b ");
    }
}
public class  L48_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        //System.out.println(a.harry());
        a.meth2();
        B b = new B();
        b.meth2();

    }
}
