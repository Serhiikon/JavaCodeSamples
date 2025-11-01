package connections.innerpackage;

import connections.Base;

public class ComposedB {
    /*--------------Methods--------------*/
    public void caller() {
        Base l = new Base();
        System.out.println(l.a); //access to public field
        System.out.println();
        l.sayA(); //access to public method
    }
    public static void main(String[] args) {
        ComposedB h = new ComposedB();
        h.caller();
    }
}
