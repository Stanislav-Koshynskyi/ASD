package pract4_koshynskyi;

public class MainTask3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            if (animal instanceof Dog dog) {
                dog.fetchStick();
            }
            else{
                System.out.println("cat not dog");
            }
        }
        /*
        якщо зробити downcast і фактичний клас об'єкта не буде тим до якого роблять downcast то викличиться помилка касту
         */
    }
}
