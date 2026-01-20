package pract1_koshynskyi;

import static pract1_koshynskyi.Animal.feed;

public class Main {
    public static void main(String[] args) {
        Dog doge = new Dog ("asd", "qwe");
        System.out.println(doge);

        Dog dog = new Dog ("asd", "qwe");

        Dog anotherDog = new Dog ("aaa", "eee");


        System.out.println(doge == dog);
        System.out.println(dog.equals(dog));

        System.out.println(dog.equals(anotherDog));
        System.out.println(dog == anotherDog);

        Animal animalDog = new Dog ("asd", "qwe");

        Animal animal = new Animal("qqqqq");


        System.out.println(feed(dog));
        System.out.println(feed(doge));
        System.out.println(feed(animal));
    }
}
