package pract2_koshynskyi;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("12", 100);
        bankAccount.withdraw(60 );

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(ArrayStat.findMax(array).get());
        System.out.println(ArrayStat.findMin(array).get());
        System.out.println(ArrayStat.calculateAvg(array).get());
    }
}
