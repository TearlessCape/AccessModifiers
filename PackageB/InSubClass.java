package PackageB;
import PackageA.InClass;

public class InSubClass extends InClass {
    public static void main(String[] args) { // Access InSubClass
        System.out.println(InClass.A);
        System.out.println(InClass.B);
        //System.out.println(InClass.C);
        //System.out.println(InClass.D);
    }
}