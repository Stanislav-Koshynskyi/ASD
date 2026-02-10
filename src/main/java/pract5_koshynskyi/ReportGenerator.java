package pract5_koshynskyi;

public abstract class ReportGenerator {
    abstract void firstStep();
    abstract void secondStep();

    final void generate(){
        firstStep();
        secondStep();
    }
    public ReportGenerator(){}
}
