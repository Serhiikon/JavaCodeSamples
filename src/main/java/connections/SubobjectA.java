package connections;

public class SubobjectA extends Base {
    /*--------------Methods--------------*/
    public void caller() {
        System.out.println("The SUBOBJECT has direct access to the "
                + "default, protected and public elements of the PARENT OBJECT");
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(h);
        sayA();
        sayB();
        sayD();
        sayE();
        sayF();
        sayH();
    }
    public static void main(String[] args) {
        new SubobjectA().caller();
    }
}
