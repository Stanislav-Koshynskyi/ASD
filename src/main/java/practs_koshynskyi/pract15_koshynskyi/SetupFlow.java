package practs_koshynskyi.pract15_koshynskyi;

public class SetupFlow {
    @Step(order = 1)
    public void method1(){
        System.out.println("method1");
    }
    @Step(order = 3)
    public void method2(){
        System.out.println("method2");
    }
    @Step(order = 2)
    public void method3(){
        System.out.println("method3");
    }
    private void method4() {
        System.out.println("method4");
    }
}
