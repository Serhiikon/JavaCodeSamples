package staticconnections;

public class StaticBase {
    /*--------------Fields--------------*/
    public static String a = "public static field: StaticBase class";
    protected static String b = "protected static field: StaticBase class";
    private static String c = "private static field: StaticBase class";
    static String d = "package static field: StaticBase class";
    /*--------------Methods--------------*/
    public static void sayA() {
        System.out.println("public static method: StaticBase class");
    }
    protected static void sayB() {
        System.out.println("protected static method: StaticBase class");
    }
    private static void sayC() {
        System.out.println("private static method: StaticBase class");
    }
    static void sayD() {
        System.out.println("package static method: StaticBase class");
    }
    public static void main(String[] args) {
        StaticBase.Inner.caller();
    }
    /*--------------Inner Classes--------------*/
    public static class Inner {
        /*--------------Methods--------------*/
        public static void caller() {
            System.out.println(a); //access to public static field
            System.out.println(b); //access to protected static field
            System.out.println(c); //access to private static field
            System.out.println(d); //access to packege static field
            System.out.println();
            sayA(); //access to public static method
            sayB(); //access to protected static method
            sayC(); //access to private static method
            sayD(); //access to package static method
        }
    }
}
