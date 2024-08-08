package FactoryPattern;

/**
 * Implementing class for Animal interface
 */
public class Bird implements Animal
{

    @Override
    public void move() {
        System.out.println("Birds fly in air");
    }
}
