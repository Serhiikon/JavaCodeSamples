package connections.innerpackage;

import connections.Base;

public class SubobjectB extends Base {
    /*--------------Methods--------------*/
    public void call() {
        System.out.println("The SUBOBJECT has direct access to the "
                + "protected and public elements of the PARENT OBJECT");
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);
        System.out.println(f);
        sayA();
        sayB();
        sayE();
        sayF();
    }
    public static void main(String[] args) {
        new SubobjectB().call();
    }
}
