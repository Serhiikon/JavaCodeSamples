package practice;

public class Forum {
    public static void main(String[] args) {
        Person p = new Male();
        for (Name n : p.getNames()) {
            n.sayName();
        }
    }
}
