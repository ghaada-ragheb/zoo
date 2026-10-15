
class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int nbrAnimals; // Instruction 10

    // Instruction 7
    Zoo() {
        animals = new Animal[25];
        nbrCages = 25;
    }

    // Instruction 6 : parameterized constructor
    Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // Instruction 8
    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", Nbr Cages: " + nbrCages);
    }

    // Instruction 9 : without toString(), println(myZoo) prints something like
    // "Zoo@1b6d3586" (class name + hash code). Writing toString() fixes this.
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages
                + ", nbrAnimals=" + nbrAnimals + "}";
    }

    // Instruction 10 + 12
    boolean addAnimal(Animal animal) {
        // Instruction 12 : an animal is unique in a zoo
        if (searchAnimal(animal) != -1) {
            return false;
        }
        // Instruction 12
        if (nbrAnimals >= nbrCages || nbrAnimals >= 25) {
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    // Instruction 11
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

    // Instruction 13
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
}
