import java.util.Arrays;

public class RotateLeftRight {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int k = 3;

        int n = arr.length;
        k = k % n;

        int[] result = new int[n];

        int index = 0;
        for (int i = k; i < n; i++) {
            result[index++] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            result[index++] = arr[i];
        }

        System.out.println("Rotated Array: " + Arrays.toString(result));
    }
}