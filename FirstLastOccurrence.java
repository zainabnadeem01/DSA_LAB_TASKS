package week10;

public class FirstLastOccurrence {
    public static void firstLast(int[] arr, int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) first = i;
                last = i;
            }
        }

        System.out.println("First Occurrence = " + first);
        System.out.println("Last Occurrence = " + last);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        int target = 2;
        firstLast(arr, target);
    }
}

