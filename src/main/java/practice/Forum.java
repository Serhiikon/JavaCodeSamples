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
