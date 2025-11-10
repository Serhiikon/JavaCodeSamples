package practice;

public class Male implements Person {
    /*--------------Inner Classes--------------*/
    public class RareName implements Name {
        /*--------------Methods--------------*/
        @Override
        public void sayName() {
            System.out.println("Donald");
        }
    }
    public class SimpleName implements Name {
        /*--------------Methods--------------*/
        @Override
        public void sayName() {
            System.out.println("George");
        }
    }
    public class ExoticName implements Name {
        /*--------------Methods--------------*/
        @Override
        public void sayName() {
            System.out.println("Octavian");
        }
    }
    /*--------------Methods--------------*/
    @Override
    public Name[] getNames() {
        Name[] names = {new RareName(), new SimpleName(), new ExoticName()};
        return names;
    }
}
