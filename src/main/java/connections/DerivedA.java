package connections;

public class DerivedA extends Base {
    /*--------------Methods--------------*/
    public void caller() {
        System.out.println(a); //access to public field
        System.out.println(b); //access to protected field
        System.out.println(d); //access to package field
        System.out.println();
        sayA(); //access to public method
        sayB(); //access to protected method
        sayD(); //access to package method
    }
    public static void main(String[] args) {
        DerivedA d = new DerivedA();
        d.caller();
    }
}
