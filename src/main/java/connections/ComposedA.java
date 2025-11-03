package connections;

public class ComposedA {
    /*--------------Methods--------------*/
    public void call() {
        Base b = new Base();
        System.out.println("The COMPOSED OBJECT has indirect access "
                + "to the default and public elements of the LOCAL OBJECT");
        System.out.println(b.a);
        System.out.println(b.d);
        System.out.println(Base.e);
        System.out.println(Base.h);
        b.sayA();
        b.sayD();
        Base.sayE();
        Base.sayH();
    }
    public static void main(String[] args) {
        new ComposedA().call();
    }
}
