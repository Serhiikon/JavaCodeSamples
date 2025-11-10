package practice;

public class PoorMan implements Person {
    /*-----------Inner Classes-----------*/
    public class Watch implements Property {
        @Override
        public void getProperty() {
            System.out.println("Casio watch");
        }
    }
    public class CellPhone implements Property {
        @Override
        public void getProperty() {
            System.out.println("Nokia phone");
        }
    }
    public class Scooter implements Property {
        @Override
        public void getProperty() {
            System.out.println("Xiaomi scooter");
        }
    }
    /*--------------Methods--------------*/
    @Override
    public Property[] getProperties() {
        Property[] prop = {new Watch(), new CellPhone(), new Scooter()};
        return prop;
    }
}
