package practs_koshynskyi.pract11_koshynskyi;

public sealed interface Result permits Success, Failure {
    String getMassage();
}
