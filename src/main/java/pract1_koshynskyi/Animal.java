package pract1_koshynskyi;

import java.util.Objects;

public class Animal {
    private String name;


    public static String feed (Animal animal) {

        if (animal instanceof Dog dog) {
            return "feed, " + dog.bark();
        }
        return "feed";
    }
    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animal{" +
                "name=" + name  +
                '}';
    }

    public String eat() {
        return "eat";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }
}
