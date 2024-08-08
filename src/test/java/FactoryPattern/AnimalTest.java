package FactoryPattern;

public class AnimalTest {

    public static void main(String[] args) {
        AnimalFactory instance = new AnimalFactory();

        Animal bird = instance.getAnimal("bird");
        bird.move();

        Animal fish = instance.getAnimal("fish");
        fish.move();

        Animal human = instance.getAnimal("Humans");
        human.move();
    }
}
