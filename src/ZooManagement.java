import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        // Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " has " + nbrCages + " cages");

        // Instruction 2 : read values from the keyboard
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

        // Instruction 5
        Animal lion = new Animal();
        lion.family = "lions";
        lion.name = "Simba";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo("esprit2 ", "charguia");
        myZoo.name = zooName;
        myZoo.city = "Tunis";
        // (Prosit 3 : nbrCages is now a constant, it cannot be assigned anymore)

        // Instruction 6 / 7 :
        Animal tiger = new Animal("tiger", "king", 7, true);
        Animal cat= new Animal("cats", "mimicha", 3, false);
        Zoo smallZoo = new Zoo("esprit", "ariana");

        // Instruction 8
        myZoo.displayZoo();
        // Instruction 8 / 9
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);

        // Instruction 10
        System.out.println("add tiger  : " + smallZoo.addAnimal(tiger));
        System.out.println("add cat  : " + smallZoo.addAnimal(cat));
        System.out.println("add lion   : " + smallZoo.addAnimal(lion));

        // Instruction 11
        smallZoo.displayAnimals();
        System.out.println("search tiger : " + smallZoo.searchAnimal(tiger));
        Animal tiger2 = new Animal("king", "small king", 7, true);
        // same name -> found at the same index even though it is another object
        System.out.println("search identical tiger : " + smallZoo.searchAnimal(tiger2));

        // Instruction 12
        System.out.println("add lion to myZoo        : " + myZoo.addAnimal(lion));
        System.out.println("add lion again to myZoo  : " + myZoo.addAnimal(lion));

        // Instruction 13
        System.out.println("remove tiger : " + smallZoo.removeAnimal(tiger));
        System.out.println("remove tiger again : " + smallZoo.removeAnimal(tiger));
        smallZoo.displayAnimals();


        // Instruction 15
        Zoo bigZoo = new Zoo("esprit2 ", "charguia");
        System.out.println("bigZoo full? " + bigZoo.isZooFull());
        for (int i = 1; i <= 26; i++) {
            boolean added = bigZoo.addAnimal(new Animal("Family" + i, "Animal" + i, i, true));
            if (!added) {
                System.out.println("Animal" + i + " was not added (zoo is full)");
            }
        }
        System.out.println("bigZoo full? " + bigZoo.isZooFull());

        // Instruction 16
        Zoo winner = myZoo.compareZoo(bigZoo, smallZoo);
        System.out.println("The zoo with the most animals is: " + winner.name);

        scanner.close();
    }
}
