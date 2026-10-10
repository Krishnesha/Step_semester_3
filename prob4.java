
class Node {
    String data;
    Node prev;
    Node next;

    Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class prob4 {
    Node head = null;
    Node tail = null;


    void addLast(String name) {
        Node newNode = new Node(name);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

   
    void remove(String name) {
        Node current = head;

        while (current != null && !current.data.equals(name)) {
            current = current.next;
        }

      
        if (current == null) {
            return;
        }

        if (current == head) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }


        if (current == tail) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }
    }

 
    void printForward() {
        Node current = head;

        System.out.print("Forward: ");

        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }

        System.out.println();
    }

    void printBackward() {
        Node current = tail;

        System.out.print("Backward: ");

        while (current != null) {
            System.out.print(current.data);
            if (current.prev != null) {
                System.out.print(" <-> ");
            }
            current = current.prev;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Main train = new Main();

        train.addLast("Engine");
        train.addLast("A1");
        train.addLast("B1");
        train.addLast("B2");
        train.addLast("Guard");

        train.remove("B1");

        train.printForward();
        train.printBackward();
    }
}
