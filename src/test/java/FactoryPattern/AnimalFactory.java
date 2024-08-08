package FactoryPattern;

public class AnimalFactory {

    public Animal getAnimal(String animalType){
        if(animalType == null) {
            return null;
        }

        if(animalType.equalsIgnoreCase("bird")){
            return new Bird();
        }
        else if(animalType.equalsIgnoreCase("fish")){
            return new Fish();
        }else if(animalType.equalsIgnoreCase("humans")){
            return new Humans();
        }
        return null;
    }
}
