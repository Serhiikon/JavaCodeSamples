package connections.innerpackage;

import connections.Base;

public class DerivedB extends Base {
    /*--------------Methods--------------*/
    public void caller() {
        System.out.println(a); //access to public field
        System.out.println(b); //access to protected field
        System.out.println();
        sayA(); //access to public method
        sayB(); //access to protected method
    }
    public static void main(String[] args) {
        DerivedB d = new DerivedB();
        d.caller();
    }
}
