package exceptions.checkedEx;

import java.io.IOException;

// IOException, SQLException
public class MyFirstCheckedEx {

    public static void main(String[] args) {
        try {
            doSmth();
        //    doSmthElse();
        } catch (IOException e) {
          //  e.printStackTrace();
            //System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }

    public static void doSmth() throws IOException {
        throw new IOException("problem");
    }

    public static void doSmthElse() {
        throw new RuntimeException("problem");
    }
}
