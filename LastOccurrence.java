package week10;

public class LastOccurrence {
    static int find(int[] arr, int index, int target) {
        if (index == arr.length) return -1;
        int ans = find(arr, index + 1, target);
        if (ans != -1) return ans;
        if (arr[index] == target) return index;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};
        System.out.println(find(arr, 0, 2));
    }
}

