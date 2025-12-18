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

Клас - це контейнер для методів.

Конструктор класу - це спеціальний статичний метод який створює і повертає об'єкт 
того класу в якому він прописаний.

Інтерфейс класу - це набір публічних методів класу.

Розширення або наслідування класу - це процес в результаті якого:
    1) підклас (клас що наслідує) отримує безпосередній доступ до всіх публічних 
       методів суперкласу (клас що наслідується).
    2) підклас може створювати нові методи які не будуть доступними в суперкласі.
    3) підклас може перевизначати вже існуючі методи суперкласу.
    4) суперклас за допомогою кастингу може отримувати доступ до перевизначених 
       методів з його підкласів.

Перевизначення методу - це зміна тіла методу без зміни його назви та аргументів.

Апкастинг - отримання доступу до об'єкту підкласу через вказівник який має тип суперкласу.

Поліморфізм - це ефект який досягається завдяки двом речам: перевизначенню методу 
та апкастингу. Він полягає в тому що викликаючи метод із суперкласу відбувається 
виклик перевизначеного методу в одному із похідних класів. Тобто таким чином ми 
розділяємо інтерфейс від реалізації.

Внутрішній клас - це клас який визначається в середині іншого (зовнішнього) класу
і який створюється в тих випадках коли якісь об'єкти здебільшого не будуть використовуватися 
поза межами зовнішнього класу.

Анонімний клас - це внутнішній клас який немає назви чи конструктора 
та який використовується з метою швидкого додавання реалізації до існуючого 
інтерфейсу без необхідності створення окремого класу.

Лямбда-вираз - це спосіб швидкого додавання реалізації до функціонального інтерфейсу.

Статичні елементи класу - це елементи які можуть викликатися напряму з класу без 
необхідності створення об'єкту цього класу.

*/
