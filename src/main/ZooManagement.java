package main;

import entities.*;
import exception.InvalidAgeException;
import exception.ZooFullException;

import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        // Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " has " + nbrCages + " cages");

        // Instruction 2
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the name of the zoo: ");
            zooName = scanner.nextLine().trim();
            if (zooName.isEmpty()) {
                System.out.println("The name cannot be empty, try again.");
            }
        } while (zooName.isEmpty());

        nbrCages = -1;
        while (nbrCages <= 0) {
            System.out.print("Enter the number of cages: ");
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                if (nbrCages <= 0) {
                    System.out.println("The number of cages must be greater than 0.");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }

        // Instruction 3
        System.out.println(zooName + " has " + nbrCages + " cages");

        try {
            // Instruction 5
            Animal lion = new Animal();
            lion.setFamily("lions");
            lion.setName("Simba");
            lion.setAge(5);
            lion.setMammal(true);

            Zoo myZoo = new Zoo();
            myZoo.setName(zooName);
            myZoo.setCity("ariana");

            Animal tiger = new Animal("tiger", "king", 7, true);
            Animal cat = new Animal("cats", "mimicha", 3, false);
            Zoo smallZoo = new Zoo("esprit", "ariana");

            // Instruction 8
            myZoo.displayZoo();

            System.out.println(myZoo);
            System.out.println(myZoo.toString());
            System.out.println(lion);

            // Instruction 10 + Instruction 33 : the number of animals is displayed after each addition
            try {
                smallZoo.addAnimal(tiger);
            } catch (ZooFullException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Number of animals in " + smallZoo.getName() + ": " + smallZoo.getNbrAnimals());
            }
            try {
                smallZoo.addAnimal(cat);
            } catch (ZooFullException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Number of animals in " + smallZoo.getName() + ": " + smallZoo.getNbrAnimals());
            }
            try {
                smallZoo.addAnimal(lion);
            } catch (ZooFullException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Number of animals in " + smallZoo.getName() + ": " + smallZoo.getNbrAnimals());
            }

            // Instruction 11
            smallZoo.displayAnimals();
            System.out.println("search tiger : " + smallZoo.searchAnimal(tiger));
            Animal tiger2 = new Animal("lions", "little king", 7, true);

            System.out.println("search identical tiger : " + smallZoo.searchAnimal(tiger2));

            // Instruction 12
            try {
                myZoo.addAnimal(lion);
            } catch (ZooFullException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Number of animals in " + myZoo.getName() + ": " + myZoo.getNbrAnimals());
            }
            try {
                myZoo.addAnimal(lion);
            } catch (ZooFullException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Number of animals in " + myZoo.getName() + ": " + myZoo.getNbrAnimals());
            }

            // Instruction 13
            System.out.println("remove tiger : " + smallZoo.removeAnimal(tiger));
            System.out.println("remove tiger again : " + smallZoo.removeAnimal(tiger));
            smallZoo.displayAnimals();


            // Instruction 15 + Instruction 33 : the zoo has 3 cages, so the 4th animal raises ZooFullException
            Zoo bigZoo = new Zoo("esprit2", "charguia");
            System.out.println("bigZoo full? " + bigZoo.isZooFull());
            for (int i = 1; i <= 4; i++) {
                try {
                    bigZoo.addAnimal(new Animal("Family" + i, "Animal" + i, i, true));
                } catch (ZooFullException e) {
                    System.out.println("Error: " + e.getMessage());
                } finally {
                    System.out.println("Number of animals in " + bigZoo.getName() + ": " + bigZoo.getNbrAnimals());
                }
            }
            System.out.println("bigZoo full? " + bigZoo.isZooFull());

            // Instruction 16
            Zoo winner = myZoo.compareZoo(bigZoo, smallZoo);
            System.out.println("The zoo with the most animals is: " + winner.getName());

            // Instruction 18 + Instruction 34 : a negative age raises InvalidAgeException
            try {
                Animal wrongAnimal = new Animal("dog", "Rex", -3, true);
                System.out.println(wrongAnimal);
            } catch (InvalidAgeException e) {
                System.out.println("Error creating animal: " + e.getMessage());
            }
            Zoo wrongZoo = new Zoo("", "monastir ");
            System.out.println(wrongZoo);

            scanner.close();


            Terrestrial terrestrial = new Terrestrial();
            Dolphin dolphin = new Dolphin();
            Penguin penguin = new Penguin();

            System.out.println(terrestrial);
            System.out.println(dolphin);
            System.out.println(penguin);

            Terrestrial elephant = new Terrestrial("elephants", "Dumbo", 10, true, 4);
            Dolphin flipper = new Dolphin("dolphins", "Flipper", 8, true, "ocean", 35.5f);
            Penguin pingu = new Penguin("penguins", "Pingu", 4, false, "antarctica", 120.0f);
            Penguin skipper = new Penguin("penguins", "Skipper", 6, false, "antarctica", 250.5f);
            Dolphin echo = new Dolphin("dolphins", "Echo", 5, true, "sea", 40.0f);

            System.out.println(elephant);
            System.out.println(flipper);
            System.out.println(pingu);

            Zoo aquaticZoo = new Zoo("aqua park", "tunis");
            aquaticZoo.addAquaticAnimal(flipper);
            aquaticZoo.addAquaticAnimal(pingu);
            aquaticZoo.addAquaticAnimal(skipper);
            aquaticZoo.addAquaticAnimal(echo);

            aquaticZoo.displayAquaticAnimalsSwimming();

            System.out.println("Max penguin swimming depth: " + aquaticZoo.maxPenguinSwimmingDepth());

            aquaticZoo.displayNumberOfAquaticsByType();

            Aquatic flipperCopy = new Dolphin("dolphins", "Flipper", 8, true, "ocean", 20.0f);
            Aquatic flipperElsewhere = new Dolphin("dolphins", "Flipper", 8, true, "river", 35.5f);
            System.out.println("flipper equals flipperCopy: " + flipper.equals(flipperCopy));
            System.out.println("flipper equals flipperElsewhere: " + flipper.equals(flipperElsewhere));
            System.out.println("flipper equals pingu: " + flipper.equals(pingu));

        } catch (InvalidAgeException e) {
            // Instruction 34 : the other animals are created with a correct age,
            // but their constructors can raise InvalidAgeException, so we must catch it
            System.out.println("Error: " + e.getMessage());
        }
    }
}