package pract3_koshynskyi;

public class BaseInit {
    static {
        System.out.println("base static");
    }
    {
        System.out.println("base instance");
    }
    BaseInit() {
        System.out.println("base constructor");
    }
}
