package lection1;

import java.util.Objects;

public class Dog extends Animal {
    private final String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + "," + "Dog{" +
                "breed="+breed + "}";
    }

    @Override
    public String eat(){
        return "doge eat bwbrww";
    }

    public String bark(){
        return "doge bark";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }
}
