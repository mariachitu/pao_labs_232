package firstPackage;

public class Exemplu3 {

    public static void main(String[] args) {

        // for
        // while
        // do while

        // suma numerelor de la 0 la 10
        int n = 10;
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum = sum + i;
            //sum += i;
        }
        System.out.println("suma = " + sum);

        n = 10;
        sum = 0;
        while(n > 0) {
            sum += n;
            n--;
        }
        System.out.println("suma = " + sum);

        n = 10;
        sum = 0;
        do {
            sum += n;
            n--;
        } while(n > 0);
        System.out.println("suma = " + sum);

        //for-each
        String[] names = {"Bill", "John", "Anne"};
        for(String name : names)    {
            System.out.println(name);
        }

//        for(;;) {
//           // infinite loop
//        }

        OUTER_LOOP: for( int i = 0; i < 10; i++)    {
            INNER_LOOP: for(int j= 0 ; j < 10; j++) {
               // break INNER_LOOP; // break;
              //  break OUTER_LOOP;
            }
        }
    }
}
