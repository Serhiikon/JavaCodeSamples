package practice;

import java.util.function.Consumer; 

public class Bombom {
    public static void main(String[] args) {
        // Reusability
        sayFirstName();
        saySecondName();
        Komkom k = new Komkom();
        Yomyom y = new Yomyom();
        k.sayAmericanFood();
        y.sayItalianFood();
        // Polymorphism
        Pompom p1 = new Tomtom();
        Pompom p2 = new Romrom();
        p1.sayCity();
        p2.sayCity();
        Somsom s =  new Somsom();
        Runnable r1 = s::sayShape;
        Runnable r2 = Somsom::sayColor;
        Runnable r3 = () -> System.out.println("The season is Winter");
        Runnable r4 = () -> System.out.println("The season is Summer");
        Consumer<Pompom> c = Pompom::sayCity;
        r1.run();
        r2.run();
        r3.run();
        r4.run();
        c.accept(p1);
        c.accept(p2);
        // Polymorphism & Reusability
        p1.sayAnimal();
        p2.sayAnimal();
    }
    private static void sayName() {
        System.out.print("The name is ");
    }
    private static void sayFirstName() {
        sayName();
        System.out.println("Sarah");
    }
    private static void saySecondName() {
        sayName();
        System.out.println("Jane");
    }
}

class Nomnom {
    public void sayFood() {
        System.out.print("The food is ");
    }
}

class Komkom extends Nomnom {
    public void sayAmericanFood() {
        sayFood();
        System.out.println("Hot-dog");
    }
}

class Yomyom extends Nomnom {
    public void sayItalianFood() {
        sayFood();
        System.out.println("Pizza");
    }
}

interface Pompom {
    void sayCity();
    default void sayAnimal() {
        System.out.print("The animal is ");
    }
}

class Tomtom implements Pompom {
    @Override
    public void sayCity() {
        System.out.println("The city is Lviv");
    }
    @Override
    public void sayAnimal() {
        Pompom.super.sayAnimal();
        System.out.println("Sheep");
    }
}

class Romrom implements Pompom {
    @Override
    public void sayCity() {
        System.out.println("The city is Odesa");
    }
    @Override
    public void sayAnimal() {
        Pompom.super.sayAnimal();
        System.out.println("Cow");
    }
}

class Somsom {
    public static void sayColor() {
        System.out.println("The color is Yellow");
    }
    public void sayShape() {
        System.out.println("The shape is Round");
    }
}
