
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n________________________");
            System.out.println("**SELECTION MENU**");
            System.out.println("1. ADD NEW NAME");
            System.out.println("2. SEARCH NAME");
            System.out.println("3. DELETE NAME");
            System.out.println("4. COUNT NAMES");
            System.out.println("5. DISPLAY NAMES IN ALPHABETICAL ORDER");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name to add: ");
                    String newName = scanner.nextLine();
                    bst.insert(newName);
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    System.out.println("Search result: " + (bst.search(searchName) ? "Found" : "Not Found"));
                    break;

                case 3:
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    bst.delete(deleteName);
                    break;

                case 4:
                    System.out.println("Number of names: " + bst.getNodeCount());
                    break;

                case 5:
                    System.out.println("Names in Alphabetical Order:");
                    bst.inOrderTraversal(bst.root);
                    System.out.println("\n");
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);

        scanner.close();
    }
  
}