package lection1;

import static lection1.Animal.feed;

public class Main {
    public static void main(String[] args) {
        Dog doge = new Dog ("asd", "qwe");
        System.out.println(doge);

        Animal dog = new Dog ("asd", "qwe");

        Animal animal = new Animal("qqqqq");


        System.out.println(feed(dog));
        System.out.println(feed(doge));
        System.out.println(feed(animal));
    }
}
