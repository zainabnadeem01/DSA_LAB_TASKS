package week10;

public class CountOccurrences {
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 6, 2, 8};
        int target = 2;

        int result = countOccurrences(arr, target);
        System.out.println("Occurrences = " + result);
    }
}

