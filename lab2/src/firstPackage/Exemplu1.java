package firstPackage;

/**
 * javadoc
 *
 * primitive - 8  => Wrappers
 * byte - Byte
 * short - Short
 * int - Integer
 * long - Long
 * float - Float
 * double - Double
 * boolean - Boolean
 * char - Character
 */

public class Exemplu1 {
    // comentariu pe 1 linie
    /*
    comenatriu
    pe mai multe linii
     */

    public static void main (String[] args) {
        byte number1; // declarare de variabila
        number1 = 5;   // atribuire
        System.out.println(number1);

        int number2 = 123; // initializare
        System.out.println(number2);

        long number3 = 123;
        System.out.println(number3);

        long number4 = 99999999999L;    // L sau l
        System.out.println(number4);

        float number5 = 10;
        System.out.println(number5);

        double number6 = 10;
        System.out.println(number6);

        double number7 = 10.5;
        System.out.println(number7);

        float number8 = 10.5F; //f sau F
        System.out.println(number8);

        number8 = (float) number7;
        System.out.println(number8);

        number7 = number8;
        System.out.println(number7);

        boolean value = true; // sau false
        System.out.println(value);

        char ch = 'a';
        System.out.println(ch);
        System.out.println((short)ch);

        Integer intreg = 111;
        System.out.println(intreg);
        System.out.println(intreg.compareTo(12));
        System.out.println(Integer.valueOf(13));

        long number9 = 10_0___00_000;
        System.out.println(number9);

        double number10 = 10_435.45;
        System.out.println(number10);
    }
}
