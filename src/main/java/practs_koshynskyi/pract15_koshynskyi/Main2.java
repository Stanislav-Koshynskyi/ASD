package practs_koshynskyi.pract15_koshynskyi;

public class Main2 {
    public static void main(String[] args) {
        try {
            SetupFlow setupFlow = new SetupFlow();
            StepRunner.run(setupFlow);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("something went wrong");
        }
    }
}
