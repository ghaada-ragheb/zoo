import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {

        // Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " has " + nbrCages + " cages");

        // Instruction 2
        Scanner scanner = new Scanner(System.in);

        // the name of the zoo must not be empty
        do {
            System.out.print("Enter the name of the zoo: ");
            zooName = scanner.nextLine().trim();
            if (zooName.isEmpty()) {
                System.out.println("The name cannot be empty, try again.");
            }
        } while (zooName.isEmpty());

        // the number of cages must be a positive integer
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
                scanner.next(); // skip the wrong input
            }
        }

        // Instruction 3
        System.out.println(zooName + " has " + nbrCages + " cages");

        scanner.close();
    }
}
