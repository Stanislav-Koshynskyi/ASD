package pract3_koshynskyi;

public class InitOrderTask {
    public static void main(String[] args) {
        new ChildInit();
        System.out.println("Спочатку ініціалізують класи і їх static параметри, потім в конструкторі child спочатку " +
                "створюється об'єкт base, тому далі ініціалізуються поля об'єктів" +
                "потім повертається до конструктора Child і ініціалізуються його поля об'єктів");
    }

}
