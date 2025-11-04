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

//Object: Forum
//    Interface objects: -
//    Local objects: Person, Name

//Object: Male
//    Interface objects: Person
//    Local objects: Name[]

//Object: Female
//    Interface objects: Person
//    Local objects: Name[]

//Object: Male.RareName
//    Interface objects: Name
//    Local objects: -

//Object: Male.SimpleName
//    Interface objects: Name
//    Local objects: -

//Object: Male.ExoticName
//    Interface objects: Name
//    Local objects: -

//Object: Name
//    Interface objects: -
//    Local objects: -

//Object: Person
//    Interface objects: -
//    Local objects: -
