package week5_stack;

public class StackLinkedList {

    private Node top;

    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // push
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }

    // pop
    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // peek
    public int peek() {
        if (isEmpty()) return -1;
        return top.data;
    }

    // check empty
    public boolean isEmpty() {
        return top == null;
    }

    // print stack
    public void printStack() {
        Node current = top;
        System.out.print("Stack elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // print and empty stack
    public void printStack2(){
        while(!isEmpty()) {
            System.out.println(peek());
            pop();
        }
    }

    // main method to test
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.printStack();
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
    }
}

