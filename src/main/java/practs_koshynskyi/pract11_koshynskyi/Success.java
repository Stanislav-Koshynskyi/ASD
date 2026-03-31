package practs_koshynskyi.pract11_koshynskyi;

public record Success(String msg) implements Result {
    @Override
    public String getMassage() {
        return msg;
    }
}
