package staticconnections;

public class StaticDerivedA extends StaticBase {
    /*--------------Methods--------------*/
    public static void caller() {
        System.out.println(a); //access to public static field
        System.out.println(b); //access to protected static field
        System.out.println(d); //access to packege static field
        System.out.println();
        sayA(); //access to public static method
        sayB(); //access to protected static method
        sayD(); //access to package static method
    }
    public static void main(String[] args) {
        caller();
    }
}
