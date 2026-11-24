package entities;

import enums.Food;
import exception.InvalidAgeException;
import interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {

    protected int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{family='" + getFamily() + "', name='" + getName() + "', age=" + getAge()
                + ", isMammal=" + isMammal() + ", nbrLegs=" + nbrLegs + "}";
    }

    @Override
    public void eatPlantAndMeet(Food food) {

    }

    @Override
    public void eatMeat(Food meat) {

    }

    @Override
    public void eatPlant(Food plant) {

    }
}
