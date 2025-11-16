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
    public Name pl;
    public Name tr;
    /*-----------Constructors------------*/
    public Outer() {
        eng = new EnglishName();
        fr = new FrenchName();
        pl = new Name() { // anonymous inner class
            @Override
            public void sayName() {
                System.out.println("Tadeush");
            }
        };
        tr = () -> System.out.println("Amir"); // lambda expression
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

/*

Клас
Це означає що буде створюватися об'єкт який буде мати інтерфейс із однією реалізацією

Клас який розширює інший клас або імплементує якийсь інтерфейс
Це означає що буде створюватися об'єкт який буде мати інтерфейс із декількома реалізаціями

Анонімний клас або лямбра-вираз
Це означає що створюється реалізація до об'єкту який має інтерфейс

Внутрішній клас
Це означає що буде створюватися об'єкт який здебільшого не буде використовуватися поза межами зовнішнього класу

Статичні елементи класу (поля, методи, внутрішні класи)
Елементи які можуть викликатися напряму з класу без необхідності створення об'єкту цього класу

*/
