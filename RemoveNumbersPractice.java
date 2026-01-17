package week3_linkedlist;

import java.util.ArrayList;

public class RemoveNumbersPractice {

    // Method to remove numbers greater than given value
    public static void removeIfGreaterThan(ArrayList<Integer> list, int limit) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > limit) {
                list.remove(i);
                i--; // index adjust after removal
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding numbers
        for (int i = 10; i <= 50; i += 5) {
            numbers.add(i);
        }

        System.out.println("Original List: " + numbers);

        // Remove EVEN numbers using loop
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--; // important
            }
        }

        System.out.println("After removing even numbers: " + numbers);

        // Remove numbers greater than 25
        removeIfGreaterThan(numbers, 25);

        System.out.println("After removing numbers greater than 25: " + numbers);
    }
}

