package generics.coffee;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.lang.reflect.InvocationTargetException;

public class CoffeeSupplier implements Supplier<Coffee>, Iterable<Coffee> {
    /*--------------Fields---------------*/
    private Class<?>[] types = { Latte.class, Mocha.class, 
        Cappuccino.class, Americano.class, Breve.class };
    private static Random rand = new Random(47);
    private int size = 0;
    /*-----------Constructors------------*/
    CoffeeSupplier() {}
    CoffeeSupplier(int sz) {
        size = sz;
    }
    /*--------------Methods--------------*/
    @Override
    public Coffee get() {
        try {
            return (Coffee) types[rand.nextInt(types.length)]
                .getConstructor().newInstance();
        } catch (InstantiationException | NoSuchMethodException |
                 InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }
    public static void main(String[] args) {
        Stream.generate(new CoffeeSupplier())
            .limit(5)
            .forEach(System.out::println);
        for (Coffee c : new CoffeeSupplier(5)) {
            System.out.println(c);
        }
    }
    /*-----------Inner Classes-----------*/
    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }
        @Override
        public Coffee next() {
            count--;
            return CoffeeSupplier.this.get();
        }
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
