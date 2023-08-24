package PackageA;

public class InClass {

    public static int A = 1;
    protected static int B = 2;
    static int C = 3; // Default Modifier
    private static int D = 4;

    public static void main(String[] args) { // Access InClass
        System.out.println(InClass.A);
        System.out.println(InClass.B);
        System.out.println(InClass.C);
        System.out.println(InClass.D);
    }
}