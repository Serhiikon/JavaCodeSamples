package connections;

public class ComposedA {
    /*--------------Methods--------------*/
    public void caller() {
        Base l = new Base();
        System.out.println(l.a); //access to public field
        System.out.println(l.d); //access to package field
        System.out.println();
        l.sayA(); //access to public method
        l.sayD(); //access to package method
    }
    public static void main(String[] args) {
        ComposedA h = new ComposedA();
        h.caller();
    }
}
