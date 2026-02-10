package pract5_koshynskyi;

public class Main {
    public static void main(String[] args) {
        run3();
    }
    public static void run1(){
        PaymentMethod cardPayment = new CardPayment();
        PaymentMethod payPalPayment = new PayPalPlayment();
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        cardPayment.pay(10);
        payPalPayment.pay(10);

        paymentProcessor.process(cardPayment, 10);
        paymentProcessor.process(payPalPayment, 10);

        cardPayment.payWithFee(5,5);
        payPalPayment.payWithFee(5,5);
    }
    public static void run2(){
        ReportGenerator dailyReport = new DailyReport();
        dailyReport.generate();

    }
    public static void run3(){
        MultiNotifier multiNotifier = new MultiNotifier();
        multiNotifier.send("Hello World");
    }
}
