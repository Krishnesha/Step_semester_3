
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class prob1 {
    Node head = null;

    // Insert at the beginning
    void addFirst(int token) {
        Node newNode = new Node(token);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    void addLast(int token) {
        Node newNode = new Node(token);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at a given 0-based index
    void insertAt(int index, int token) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            addFirst(token);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(token);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display the linked list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main list = new Main();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
        list.addLast(sc.nextInt());
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String operation = sc.next();

            switch (operation) {
                case "addFirst":
                    list.addFirst(sc.nextInt());
                    break;

                case "addLast":
                    list.addLast(sc.nextInt());
                    break;

                case "insertAt":
                    int index = sc.nextInt();
                    int token = sc.nextInt();
                    list.insertAt(index, token);
                    break;

                default:
                    System.out.println("Invalid operation");
            }
        }

        list.display();
        sc.close();
    }
}
