package practice;

public class RichMan implements Person {
    /*-----------Inner Classes-----------*/
    public class Car implements Property {
        @Override
        public void getProperty() {
            System.out.println("Ferrari supercar");
        }
    }
    public class RealEstate implements Property {
        @Override
        public void getProperty() {
            System.out.println("Townhouse real estate");
        }
    }
    public class BankAccount implements Property {
        @Override
        public void getProperty() {
            System.out.println("1000000$ bank account");
        }
    }
    /*--------------Methods--------------*/
    @Override
    public Property[] getProperties() {
        Property[] prop = {new Car(), new RealEstate(), new BankAccount()};
        return prop;
    }
}
