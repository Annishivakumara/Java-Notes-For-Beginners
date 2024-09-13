import java.util*;

public class MergeArrays {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
      int size= sc.nextInt();
        int[] array1 =  new int [size];
        int[] array2 =  new int [size];
        int[] merged = new int[array1.length + array2.length];


        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }


        for (int i = 0; i < array2.length; i++) {
            merged[array1.length + i] = array2[i];
        }


        System.out.print("Merged array: ");
        for (int number : merged) {
            System.out.print(number + " ");
        }
    }
}
