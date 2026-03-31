package practs_koshynskyi.pract11_koshynskyi;

public record Failure(String msg) implements Result {
    @Override
    public String getMassage() {
        return msg;
    }
}
