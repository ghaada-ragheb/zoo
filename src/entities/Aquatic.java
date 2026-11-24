package entities;

import enums.Food;
import exception.InvalidAgeException;

public abstract class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;
    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{family='" + getFamily() + "', name='" + getName() + "', age=" + getAge()
                + ", isMammal=" + isMammal() + ", habitat='" + habitat + "'}";
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aquatic)) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return age == other.age
                && name != null && name.equals(other.name)
                && habitat != null && habitat.equals(other.habitat);
    }
}
