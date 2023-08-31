class mcellPhone
{
    void samplePhoneMeth()
    {
        System.out.println("Sample meth of a simple phone");
    }

}
class msmartPhone extends mcellPhone implements mGPS,mcamera,mmediaPlayer {

    void sampleSmartMeth()
    {
        System.out.println("Sample Smart phone method");
    }
//    @Override
//    public void fetchLoc() {
//        System.out.println("Fetching Loc");
//    }

    @Override
    public void getLoc() {
        System.out.println("Getting Location");

    }

    @Override
    public void takingSanp() {
        System.out.println("Taking Snap");

    }

    @Override
    public void gettingSnap() {
        System.out.println("getting Snap");

    }

    @Override
    public void mediaPlaying() {
        System.out.println("Playing media");

    }

    @Override
    public void mediaList() {
        System.out.println("Media list");

    }
}
interface mGPS{
    default void fetchLoc() {
        System.out.println("default location");
    }

    void getLoc();

}
interface mcamera{
    void takingSanp();
    void gettingSnap();

}
interface mmediaPlayer{
    void mediaPlaying();
    void mediaList();

}
public class L59_Polymorphism_Interface {
    public static void main(String[] args) {

        mGPS g = new msmartPhone();
        //using smartphone as a GPS so accesing only gps methods
        g.fetchLoc();
        g.getLoc();

        msmartPhone s = new msmartPhone();
        s.fetchLoc();
        s.getLoc();
        s.gettingSnap();
        s.takingSanp();
        s.mediaList();
        s.mediaPlaying();
        s.samplePhoneMeth();
        s.sampleSmartMeth();



    }
}
