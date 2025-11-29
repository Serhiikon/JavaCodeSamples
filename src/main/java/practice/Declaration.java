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

Declaration
is: -
has: Person, Property

Person
is: -
has: -

PoorMan
is: Person
has: Property[]

RichMan
is: Person
has: Property[]

Property
is: -
has: -

PoorMan.Watch
is: Property
has: -

PoorMan.Cellphone
is: Property
has: -

PoorMan.Scooter
is: Property
has: -

RichMan.Car
is: Property
has: -

RichMan.Townhouse
is: Property
has: -

RichMan.BankAccount
is: Property
has: -

*/
