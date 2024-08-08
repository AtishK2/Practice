package FactoryPattern;

public class Humans implements Animal
{

    @Override
    public void move() {
        System.out.println("Humans can swim in water and walk on ground");
    }
}
