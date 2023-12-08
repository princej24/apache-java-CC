
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        ArrayList<Players> playerList = new ArrayList<>();

      
        playerList.add(new Players("John", 42));
        playerList.add(new Players("Alice", 17));
        playerList.add(new Players("jay", 25));
        playerList.add(new Players("kago", 30));
        playerList.add(new Players("Charlie", 19));

      
        System.out.println("All Players:");
        displayPlayers(playerList);

       
        System.out.println("\nPlayers with Odd Numbers:");
        displayPlayersWithOddNumbers(playerList);

        char specifiedLetter = 'A';
        System.out.println("\nPlayers whose names start with the letter '" + specifiedLetter + "':");
        displayPlayersWithSpecifiedLetter(playerList, specifiedLetter);

      
        addNewPlayers(playerList);

        System.out.println("\nAll Players after adding new players:");
        displayPlayers(playerList);
    }

  
    private static void displayPlayers(ArrayList<Players> players) {
        for (Players player : players) {
            System.out.println("Name: " + player.getName() + ", Number: " + player.getNumber());
        }
    }

 
    private static void displayPlayersWithOddNumbers(ArrayList<Players> players) {
        for (Players player : players) {
            if (player.getNumber() % 2 != 0) {
                System.out.println("Name: " + player.getName() + ", Number: " + player.getNumber());
            }
        }
    }

    private static void displayPlayersWithSpecifiedLetter(ArrayList<Players> players, char letter) {
        for (Players player : players) {
            if (player.getName().toUpperCase().charAt(0) == Character.toUpperCase(letter)) {
                System.out.println("Name: " + player.getName() + ", Number: " + player.getNumber());
            }
        }
    }

 
    private static void addNewPlayers(ArrayList<Players> players) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number of new players you want to add: ");
        int numNewPlayers = scanner.nextInt();

        for (int i = 0; i < numNewPlayers; i++) {
            System.out.println("Enter details for Player " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Number: ");
            int number = scanner.nextInt();

            players.add(new Players(name, number));
        }
    }
}
