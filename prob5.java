
class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class prob5{
    Node head = null;
    Node tail = null;

    // Add player at the end of the circular list
    void addLast(String name) {
        Node newNode = new Node(name);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Print players for the given number of turns
    void printTurns(int turns) {
        if (head == null || turns <= 0) {
            return;
        }

        Node current = head;

        for (int i = 0; i < turns; i++) {
            System.out.print(current.data);

            if (i < turns - 1) {
                System.out.print(" ");
            }

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Main game = new Main();

        game.addLast("Asha");
        game.addLast("Ravi");
        game.addLast("Neha");

        game.printTurns(7);
    }
}

