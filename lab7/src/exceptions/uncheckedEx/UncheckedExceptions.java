package exceptions.uncheckedEx;

public class UncheckedExceptions {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException  <-- IndexOutOfBoundsException
        int[] arr = new int[5];
   //     arr[6] = 11;

        String str = "my first string";
      //  char c = str.charAt(100); //StringIndexOutOfBoundsException

        String s = null;
     //   System.out.println(s.length()); //ullPointerException
        if( s != null)   {
            System.out.println(s.length());
        } else {

        }

        int a = 123;
        int b = 0;
    //    divide(a, b); //ArithmeticException / IllegalArgumentException

  //      int num = Integer.parseInt("123d"); //NumberFormatException

        String ss = "test";
      //  Integer nr = (Integer) ss;
        Object obj = ss;
        Integer nrSs  = (Integer) obj; //ClassCastException

    }

    private static int divide(int a, int b) {
        if(b != 0)
            return a / b;
        else {
//            IllegalArgumentException e = new IllegalArgumentException(" B must not be zero!");
//            throw e;
            throw new IllegalArgumentException(" B must not be zero!");
        }
    }
}
