package arrays;

public class Exemplu1 {

    public static void main(String[] args) {
        //type[] nume
        double[] a;
        double b[];
        int c[], d;
        c = new int[10];
        int[] x = new int[10];
        //x[0], x[1], x[length(x) - 1]
        for( int i = 0; i < x.length; i++)  {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.println(x.length);
        x[9] = 2;
        //x[10] = 3; - >ArrayIndexOutOfBoundsException
        a = new double[]{11, 12, 13};
        b = new double[]{};

        double result = computeSum(a);
        System.out.println("result = " + result);
    }

    static double computeSum(double[] array)  {
        double sum = 0;
        for(int i = 0; i < array.length; i++)   {
            sum += array[i];
        }

        return sum;
    }
}
