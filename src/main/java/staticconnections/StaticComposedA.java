package staticconnections;

public class StaticComposedA {
    /*--------------Methods--------------*/
    public static void caller() {
        System.out.println(StaticBase.a); //access to public static field
        System.out.println(StaticBase.d); //access to package static field
        System.out.println();
        StaticBase.sayA(); //access to public static method
        StaticBase.sayD(); //access to package static method
    }
    public static void main(String[] args) {
        caller();
    }
}
