interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{

    void meth3();
    void meth4();
}
class mySampleClass implements childSampleInterface{

    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}
public class L58_Inhertance_Interfaces {
    public static void main(String[] args) {
        mySampleClass m = new mySampleClass();
        m.meth1();
        m.meth2();
        m.meth3();
        m.meth4();

    }
}
