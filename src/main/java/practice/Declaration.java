package practice;

public class Declaration {
    private static void listProperties(Person p) {
        for (Property prop : p.getProperties()) {
            prop.getProperty();
        }
    }
    public static void main(String[] args) {
        listProperties(new RichMan());
        listProperties(new PoorMan());
    }
}