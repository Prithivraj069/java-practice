
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while(true){
            displayMenu();
            int choice = makeChoice(sc, 1, 5);

            if(choice == 1) {
                displayName(guests);
            }
            if(choice == 2) {
                addName(guests, sc);
            }
            if(choice == 3) {
                editName(guests, sc);
            }
            if(choice == 4) {
                deleteName(guests, sc);
            }
            if(choice == 5) {
                break;
            }
        }
        System.out.println("Thank You");
    }

    public static void displayMenu(){
        System.out.println();
        System.out.println("1.Display name");
        System.out.println("2.Add name");
        System.out.println("3.Edit name");
        System.out.println("4.Delete name");
        System.out.println("5.Quit");
    }

    public static int makeChoice(Scanner sc, int lowerBound, int higherBound) {
        int choice;
        while(true) {
            System.out.print("Enter you choice:");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("your choice is:" + choice);

            if(choice >= lowerBound && choice <= higherBound) {
                break;
            } else {
                System.out.println("your choice should be lies between" + lowerBound + "to" + higherBound);
            }
        }
        return choice;
    }

    public static void displayName(ArrayList<String> name) {
        System.out.println();
        System.out.println("Display all names:");
       boolean arr = name.isEmpty();
        if(arr){
            System.out.println("array is empty");
        }
        for(int i = 0; i < name.size();i++) {
                System.out.println(i + "." + name.get(i));
        }
    }

    public static void addName(ArrayList<String> name, Scanner sc) {
        System.out.println();
        System.out.println("Add new guest name");
        System.out.print("Enter name:");
        String guestName = sc.nextLine();
        name.add(guestName);
    }

    public static void editName(ArrayList<String> name, Scanner sc) {
        System.out.println();
        System.out.println("Edit guest");
        displayName(name);
        System.out.print("choose the nameIndex to edit:");
        int nameIndex = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the new name:");
        String newName = sc.nextLine();

         name.set(nameIndex, newName);
    }

    public static void deleteName(ArrayList<String> name, Scanner sc){
        System.out.println();
        System.out.println("Delete name");
        displayName(name);
        System.out.print("Select index to delete:");
        int deleteIndex = sc.nextInt();
        sc.nextLine();

        name.remove(deleteIndex);
    }
}