package entities;

import exception.InvalidAgeException;

public class Terrestrial extends Animal {

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
}
