package staticconnections.innerpackage;

import staticconnections.StaticBase;

public class StaticComposedB {
    /*--------------Methods--------------*/
    public static void caller() {
        System.out.println(StaticBase.a); //access to public static field
        System.out.println();
        StaticBase.sayA(); //access to public static method
    }
    public static void main(String[] args) {
        caller();
    }
}
