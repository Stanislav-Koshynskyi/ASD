package practs_koshynskyi.pract9_koshynskyi;

public class Car {
    private String model;
    public static class Engine{
        private final double horsePower;
        public Engine(double horsePower){
            this.horsePower = horsePower;
        }
    }
    public Engine spec(double horsePower){
        return new Engine(horsePower);
    }
}
