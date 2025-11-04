package practice;

public class Forum {
    public static void main(String[] args) {
        listNames(new Male());
        listNames(new Female());
    }
    private static void listNames(Person p) {
        for (Name n : p.getNames()) {
            n.sayName();
        }
    }
}
