interface camera{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good Morning");
    }
    default void recording4KVideo()
    {
        greet();
        System.out.println("Recording Video in 4k");

    }

}
interface wifi{
    String[] getNetworks();
    void connectNetwork(String network);

}

class MyCellPhone {
    long phoneNumber;
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }

    void callNumber(long phoneNo)
    {

        System.out.println("Calling from CellPhone "+phoneNo);
    }
    void pickCall()
    {
        System.out.println("Connecting to "+getPhoneNumber());
    }


}
class MySmartPhone extends MyCellPhone implements wifi,camera{

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {

        System.out.println("Recording Video");
    }
//    public void recording4KVideo()
//    {
//        System.out.println("Recording Video in 4k via Smartphone");
//
//    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of Network");
        String[] networkList = {"StormFiber","PTCL","ZOngDevice"};
        return networkList;
    }

    @Override
    public void connectNetwork(String network) {

        System.out.println("Connecting to "+network);
    }
}
public class L57_DefaultMethods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetworks();
        for (String element:ar) {
            System.out.println(element);

        }
        ms.connectNetwork("stormFiber");
        ms.setPhoneNumber(923000853121L);
        System.out.println(ms.getPhoneNumber());
        ms.callNumber(923000853121L);
        ms.recording4KVideo();

    }
}
