package practs_koshynskyi.pract15_koshynskyi;

public class Main {
    public static void main(String[] args) {
        //ClassInfoPrinter.print(Book.class);

        try {
            Object card = ServiceFactory.create("practs_koshynskyi.pract15_koshynskyi.CardPaymentService");
            CardPaymentService cardPaymentService = (CardPaymentService) card;
            System.out.println(cardPaymentService.pay());
        }catch (Exception e){
            System.out.println("something went wrong");
        }
    }
}
