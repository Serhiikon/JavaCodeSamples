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

/*

Forum
is: -
has: Person
     Name

Male
is: Person
has: Name[]

Female
is: Person
has: Name[]

Male.RareName
is: Name
has: -

Male.SimpleName
is: Name
has: -

Male.ExoticName
is: Name
has: -

Name
is: -
has: -

Person
is: -
has: -

*/
