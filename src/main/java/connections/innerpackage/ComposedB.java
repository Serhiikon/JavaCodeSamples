package connections.innerpackage;

import connections.Base;

public class ComposedB {
    /*--------------Methods--------------*/
    public void call() {
        Base b = new Base();
        System.out.println("The COMPOSED OBJECT has indirect access "
               + "to the public elements of the ELEMENT OBJECT");
        System.out.println(b.a);
        b.sayA();
        System.out.println();
        System.out.println("The COMPOSED OBJECT has indirect access "
               + "to the public elements of the ELEMENT CLASS");
        System.out.println(Base.e);
        Base.sayE();
    }
    public static void main(String[] args) {
        new ComposedB().call();
    }
}
