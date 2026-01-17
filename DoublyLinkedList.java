class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {

    Node head;
    Node tail;

    // Add node at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Delete first node
    void deleteFirst() {
        if (head != null) {
            head = head.next;
            if (head != null)
                head.prev = null;
        }
    }

    // Delete last node
    void deleteLast() {
        if (tail != null) {
            tail = tail.prev;
            if (tail != null)
                tail.next = null;
        }
    }

    // Print forward
    void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇆ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Print backward
    void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ⇆ ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        // 1️⃣ Build DLL
        dll.insert(5);
        dll.insert(10);
        dll.insert(15);
        dll.insert(20);
        dll.insert(25);

        // 3️⃣ Delete first & last
        dll.deleteFirst();
        dll.deleteLast();

        // 2️⃣ Print forward & backward
        System.out.print("Forward: ");
        dll.printForward();

        System.out.print("Backward: ");
        dll.printBackward();
    }
}


