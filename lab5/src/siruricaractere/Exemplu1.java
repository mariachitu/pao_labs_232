package siruricaractere;

public class Exemplu1 {
    public static void main(String[] args) {
        String empty1 = "";
        String empty2 = new String();
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = new String(s2);
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        String s4 = new String(ch);
        String s5 = "hello";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s1 == s5);
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        s4 = s4.intern();
        System.out.println(s1 == s4);

        System.out.println("len = " + s1.length());
        System.out.println(empty1.isEmpty());
        System.out.println(s1.isEmpty());

        System.out.println(s1.substring(3));
        System.out.println("hello".substring(3, s1.length()));
        System.out.println(s1.substring(1, 4)); // [, )
      //  System.out.println(s1.substring(3, 10)); //StringIndexOutOfBoundsException

        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.lastIndexOf('l'));

        s1 = s1.toUpperCase();
        System.out.println(s1);

        s1 = s1.concat(" pao");
        System.out.println(s1);

        String s6 = "ab" + "cde";
        System.out.println(s6);

        s6 = 1 + 2 + "abc" + 1 +2;
        System.out.println(s6);

        String result = new String();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(char vowel : vowels) {
            result = result.concat(String.valueOf(vowel));
        }
        System.out.println(result);
    }
}
