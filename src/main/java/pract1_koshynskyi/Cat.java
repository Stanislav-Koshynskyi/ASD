package pract1_koshynskyi;

public class Cat extends Animal {
    private final String breed;
    @Override
    public String toString() {
        return super.toString() + ","+ "Cat" + "{" +
                "breed="+breed + "}";
    }
    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }
}
