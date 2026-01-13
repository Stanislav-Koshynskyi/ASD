package pract1_Koshynskyi;

public class Task2 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        for (int i = -128; i <= 127; i++){
            Integer integer = new  Integer(i);
            System.out.println(integer == i);
        }
        /*
         оператор == для об'єктів порівнює посилання на об'єкт в пам'яті,
         .equals за замовчуванням використовує == , але його можна перевизначити
         порівняння за іншими ознаками об'єкту

         при використанні == для порівняння int i Integer java автоматитчно перетворює Integer в int і порівнює значення

         */


    }
}
