
class Zoo {

    // Instruction 14
    final int NBR_CAGES = 25;

    Animal[] animals;
    String name;
    String city;
    int nbrAnimals; // animal counter

    Zoo() {
        animals = new Animal[NBR_CAGES];
    }

    // Instruction 14 : nbrCages removed from the constructor (a constant cannot be changed)
    Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", Nbr Cages: " + NBR_CAGES);
    }

    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + NBR_CAGES
                + ", nbrAnimals=" + nbrAnimals + "}";
    }

    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            return false;
        }
        if (nbrAnimals >= NBR_CAGES) {
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    void displayAnimals() {
        System.out.println("Animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println("  " + i + " - " + animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    // Instruction 15
    boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES;
    }

    // Instruction 16
    Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        }
        return z2;
    }
}
