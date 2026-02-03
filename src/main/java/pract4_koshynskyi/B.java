package pract4_koshynskyi;

public class B extends A{
    public B(){}
    public void process(Object o){
        System.out.println("B, Object");
    }
    public void process(String o){
        System.out.println("B, String");
    }
}
