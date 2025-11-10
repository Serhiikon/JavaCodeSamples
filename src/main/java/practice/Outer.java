package practice;

public class Outer {
    /*-----------Inner Classes-----------*/
    public class EnglishName implements Name {
        @Override
        public void sayName() {
            System.out.println("Lora");
        }
    }
    public class FrenchName implements Name {
        @Override
        public void sayName() {
            System.out.println("Janette");
        }
    }
    /*--------------Fields---------------*/
    public Name eng;
    public Name fr;
    public Name pl = new Name() { // anonymous inner class
        @Override
        public void sayName() {
            System.out.println("Tadeush");
        }
    };
    public Name tr = () -> System.out.println("Amir"); // lambda expression
    /*-----------Constructors------------*/
    public Outer() {
        eng = new EnglishName();
        fr = new FrenchName();
    }
    /*--------------Methods--------------*/
    public void sayAllNames() {
        class SpanishName implements Name { // local inner class
            @Override
            public void sayName() {
                System.out.println("Gustavo");
            }
        };
        Name sp = new SpanishName();
        Name ua = new Name() { // local anonymous inner class
            @Override
            public void sayName() {
                System.out.println("Oksana");
            }
        };
        Name it = () -> System.out.println("Antonio"); // local lambda expression
        tr.sayName();
        it.sayName();
        eng.sayName();
        fr.sayName();
        pl.sayName();
        sp.sayName();
        ua.sayName();
    }
    public static void main(String[] args) {
        new Outer().sayAllNames();
    }
}
