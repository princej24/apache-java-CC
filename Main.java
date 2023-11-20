
public class Main {

    public static void main(String[] args) {
        Players player = new Players("John", 42);
        System.out.println("Name: " + player.getName());
        System.out.println("Number: " + player.getNumber());

        // You can also update the values using the setter methods
        player.setName("Alice");
        player.setNumber(17);
        System.out.println("Updated Name: " + player.getName());
        System.out.println("Updated Number: " + player.getNumber());
    }
}


