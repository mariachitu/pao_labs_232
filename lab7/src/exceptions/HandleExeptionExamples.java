package exceptions;

public class HandleExeptionExamples {
    public static void main(String[] args) {
      //  doTryCath();
      //  doTryFinally();
      //  doTryCatchFinally();
        doTest();
    }

    private static void doTryCath(){
        int[] arr = new int[5];
        try {
            arr[6] = 8;
        } catch (ArrayIndexOutOfBoundsException e)  {
            System.out.println("Exception caught");
        }
        System.out.println("Final of the method");
    }

    private static void doTryFinally(){
        int[] arr = new int[5];
        try {
            arr[6] = 8;
        } finally {
            System.out.println("Execute final block");
        }
        System.out.println("Final of the method");
    }

    private static void doTryCatchFinally(){
        int[] arr = new int[5];
        try {
            arr[6] = 8;
        } catch (ArrayIndexOutOfBoundsException e)  {
            System.out.println("Exception caught");
        }finally {
            System.out.println("Execute final block");
        }
        System.out.println("Final of the method");
    }

    private static void doTest(){
        int[] arr = new int[5];
        try {
            arr[7] = 8;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e)  {
            System.out.println("Exception caught");
        } catch (Exception e)  {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Execute final block");
        }
        System.out.println("Final of the method");
    }
}
