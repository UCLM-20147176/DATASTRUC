import java.util.Scanner;

class TestBST_Plarisan{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      BSTClass bst = new BSTClass();
      
      while(true){
         System.out.println("-------------------------");
         System.out.println("Menu");
         System.out.println("1| Insert Data");
         System.out.println("2| Search");
         System.out.println("3| Node Count");
         System.out.println("4| Height");
         System.out.println("5| inorder transversal");
         System.out.println("6| preorder transversal");
         System.out.println("7| postorder transversal");
         System.out.println("8| delete");
         System.out.println("9| Leaf Count");
         System.out.println("0| Exit");
         System.out.println("-------------------------");
         System.out.println("Enter your choice: ");
         int choice = sc.nextInt();
         
         switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    bst.insertNode(value);
                    System.out.println("The vaue " +value+ " has been added.");
                    break;
                case 2:
                    System.out.print("Enter value to search: ");
                      int searchValue = sc.nextInt();
                      if (bst.search(searchValue)) {
                          System.out.println("The value " + searchValue + " is found in the tree.");
                      } else {
                          System.out.println("The value " + searchValue + " is not found in the tree.");
                      }
                      break;
                case 3:
                    System.out.println("Node Count: " + bst.getNodeCount());
                     break;
                case 4:
                    System.out.println("Tree Height: " + bst.height());
                     break;
                case 5:
                    System.out.println("Inorder Traversal");
                    bst.inorder(bst.root);
                    break;
                case 6:
                    System.out.println("Preorder Traversal");
                    bst.preorder(bst.root);
                    break;
                case 7:
                    System.out.println("Postorder Traversal");
                    bst.postorder(bst.root);
                    break;
                case 8:
                    System.out.println("Enter value to delete: ");
                    int deleteValue = sc.nextInt();
                    bst.delete(deleteValue);
                    System.out.println("The value " +deleteValue+ " has been deleted");
                    break;
                case 9:
                     System.out.println("Number of leaves: " + bst.leavesCount());
                    break;
                case 0:
                    System.out.println("The End");
                    sc.close(); 
                    System.exit(0); 
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
         }
      }      
   }
}