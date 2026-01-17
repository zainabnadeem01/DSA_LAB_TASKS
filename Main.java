package week2_arrays;

//array
class MyArray {
    private int[] items;
    private int count;

    public MyArray(int length) {
        items = new int[length];
    }

    public void insert(int value) {
        if (count == items.length) {
            System.out.println("Array is full! Cannot insert " + value);
            return;
        }
        items[count++] = value;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.print(items[i] + " ");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        MyArray numbers = new MyArray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40); // full
        numbers.print();
    }
}

