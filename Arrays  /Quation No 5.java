import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 1, 4, 2};

        Arrays.sort(numbers);

        System.out.print("Sorted array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
