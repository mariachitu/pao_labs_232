package firstPackage;

public class Exemplu2 {
    // if
    //switch
    // operatori de comparare: < > <= >= == != (op. binari)
    // operatori unari: ++ -- ! (type)
    // op. ternari ? :

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        //int x = 10, y = 20;
        if(x > y)   {
            System.out.println("x is greater than y");
        } else if(x == y)   {
            System.out.println("x equals y");
        } else  {
            System.out.println("y is greater than x");
        }

        int hour = 20;
        String result = (hour < 17) ? "Good day!" : "Good evening!";
        System.out.println(result);
        System.out.println("Are you free now? " + ((hour > 18) ? true : "Still working"));

        /*
        int
        byte
        short
        char
        String
        enum
         */
        int day = 3;
        char day2 = 'c';
        String day3 = "miercuri";
        WeekDay day4 = WeekDay.MIERCURI;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }


    }



}
