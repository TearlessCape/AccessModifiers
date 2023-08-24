package PackageB;
import PackageA.InClass;

public class OutPackage {
    public static void main(String[] args) { // Access OutPackage
        System.out.println(InClass.A);
        //System.out.println(InClass.B);
        //System.out.println(InClass.C);
        //System.out.println(InClass.D);
    }
}