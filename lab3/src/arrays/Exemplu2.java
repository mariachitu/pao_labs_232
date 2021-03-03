package arrays;

public class Exemplu2 {

    public static void main(String[] args) {
        int[][] a;
        int b[][];
        int[] c[], d;

        a = new int[3][3];
        int[][]e = new int[][]{{14}, {12, 13, 12}, {1}};
        b = new int[3][];
        b[0] = new int[2];
        b[1] = new int[1];
        int n = 5;
        b[2] = new int[n];
        printArray(b);
        printArray2(b);
    }

    static void printArray(int[][] array)    {
        for(int i = 0; i < array.length; i++)   {
            for(int j = 0; j < array[i].length; j++)    {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printArray2(int[][] array)  {
        for(int[] row: array)   {
            for(int elem: row)  {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

}
