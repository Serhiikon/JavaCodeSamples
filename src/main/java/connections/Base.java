package connections;

public class Base {
    /*--------------Fields--------------*/
    public String a = "public field";
    protected String b = "protected field";
    private String c = "private field";
    String d = "default field";
    public static String e = "public static field";
    protected static String f = "protected static field";
    private static String g = "private static field";
    static String h = "default static field";
    /*--------------Methods--------------*/
    public void sayA() {
        System.out.println("public method");
    }
    protected void sayB() {
        System.out.println("protected method");
    }
    private void sayC() {
        System.out.println("private method");
    }
    void sayD() {
        System.out.println("default method");
    }
    public static void sayE() {
        System.out.println("public static method");
    }
    protected static void sayF() {
        System.out.println("protected static method");
    }
    private static void sayG() {
        System.out.println("private static method");
    }
    static void sayH() {
        System.out.println("default static method");
    }
    public static void main(String[] args) {
        Inner i = new Base().new Inner();
        i.call();
        i.callStatic();
        InnerStatic.callStatic();
    }
    /*--------------Inner Classes--------------*/
    public class Inner {
        /*--------------Methods--------------*/
        public void call() {
            System.out.println("The INNER OBJECT has private, default, "
                    + "protected and public access to the OUTER OBJECT");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            sayA();
            sayB();
            sayC();
            sayD();
        }
        public void callStatic() {
            System.out.println("The INNER OBJECT has private static, default static, "
                    + "protected static and public static access to the OUTER CLASS");
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);
            sayE();
            sayF();
            sayG();
            sayH();
        }
    }
    public static class InnerStatic {
        /*--------------Methods--------------*/
        public static void callStatic() {
            System.out.println();
            System.out.println("The INNER CLASS has private static, default static, "
                    + "protected static and public static access to the OUTER CLASS");
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);
            sayE();
            sayF();
            sayG();
            sayH();
        }
    }
}
