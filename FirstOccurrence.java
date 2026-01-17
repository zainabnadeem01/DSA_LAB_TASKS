package week10;

public class FirstOccurrence {
    static int find(int[] arr, int index, int target) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        return find(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};
        System.out.println(find(arr, 0, 2));
    }
}
