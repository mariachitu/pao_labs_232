package arrays;

import java.util.Arrays;

public class Exemplu3 {
    public static void main(String[] args) {
        int[] array1 = {67, 22, 12, 3, 235};
        int[] array3 = {20, 12, 22, 67, 235};
        int[] array2 = new int[4];
        String[] array4 = { "anna", "jhon", "123", "Anna"};
        System.out.println(array1);

        for(int elem : array1)  {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array1));

        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        Arrays.fill(array2, 11);
        System.out.println(Arrays.toString(array2));

        int elemSerched = 12;
        System.out.println(Arrays.binarySearch(array1, elemSerched));
        System.out.println(Arrays.binarySearch(array1, 0, array1.length, elemSerched)); // [start, end)
        System.out.println(Arrays.binarySearch(array1, 2));
        System.out.println(Arrays.binarySearch(array1, 300));


        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array3));
        int result = Arrays.compare(array1, array3);
        System.out.println("result = " + result);

        Arrays.sort(array4, 0, array4.length);
        System.out.println(Arrays.toString(array4));

        int index = Arrays.mismatch(array1, array3);
        System.out.println("index = " + index);

        System.out.println(Arrays.toString(Arrays.copyOf(array1, 3)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(array1, 1, 4)));

    }
}
