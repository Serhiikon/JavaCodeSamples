package practice;

public class Female implements Person {
    /*--------------Inner Classes--------------*/
    public class RareName implements Name {
        /*--------------Methods--------------*/
        @Override
        public void sayName() {
            System.out.println("Alisa");
        }
    }
    public class SimpleName implements Name {
        /*--------------Methods--------------*/
        @Override
        public void sayName() {
            System.out.println("Emma");
        }
    }
    public class ExoticName implements Name {
        /*--------------Methods--------------*/
        @Override
        public void sayName() {
            System.out.println("Susan");
        }
    }
    /*--------------Methods--------------*/
    @Override
    public Name[] getNames() {
        Name[] names = {new RareName(), new SimpleName(), new ExoticName()};
        return names;
    }
}
