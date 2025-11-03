package connections.innerpackage;

import connections.Base;

public class ChildB extends Base {
    /*--------------Methods--------------*/
    public void call() {
        System.out.println("The CHILD OBJECT has direct access to the "
                + "protected and public elements of the PARENT OBJECT");
        System.out.println(a);
        System.out.println(b);
        sayA();
        sayB();
        System.out.println();
        System.out.println("The CHILD OBJECT has direct access to the "
                + "protected and public elements of the PARENT CLASS");
        System.out.println(e);
        System.out.println(f);
        sayE();
        sayF();
    }
    public static void callStatic() {
        System.out.println();
        System.out.println("The CHILD CLASS has direct access to the "
                + "protected and public elements of the PARENT CLASS");
        System.out.println(e);
        System.out.println(f);
        sayE();
        sayF();
    }
    public static void main(String[] args) {
        new ChildB().call();
        callStatic();
    }
}
