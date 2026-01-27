package pract3_koshynskyi;

public class ChildInit extends BaseInit {
    static {
        System.out.println("Child Static");
    }
    {
        System.out.println("Child Instance");
    }
    ChildInit() {
        System.out.println("Child Constructor");
    }
}
