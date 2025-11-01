package connections;

import staticconnections.StaticBase;

public class Base {
    /*--------------Fields--------------*/
    public String a = "public field: Base class";
    protected String b = "protected field: Base class";
    private String c = "private field: Base class";
    String d = "package field: Base class";
    /*--------------Methods--------------*/
    public void sayA() {
        System.out.println("public method: Base class");
    }
    protected void sayB() {
        System.out.println("protected method: Base class");
    }
    private void sayC() {
        System.out.println("private method: Base class");
    }
    void sayD() {
        System.out.println("package method: Base class");
    }
    public static void main(String[] args) {
        Base o = new Base();
        Inner i = o.new Inner();
        i.caller();
        o.callStatic();
    }
    public void callStatic() {
        System.out.println();
        System.out.println(StaticBase.a); //access to public static field
        System.out.println();
        StaticBase.sayA(); //access to public static method
    }
    /*--------------Inner Classes--------------*/
    public class Inner {
        /*--------------Methods--------------*/
        public void caller() {
            System.out.println(a); //access to public field
            System.out.println(b); //access to protected field
            System.out.println(c); //access to private field
            System.out.println(d); //access to packege field
            System.out.println();
            sayA(); //access to public method
            sayB(); //access to protected method
            sayC(); //access to private method
            sayD(); //access to package method
        }
    }
}
