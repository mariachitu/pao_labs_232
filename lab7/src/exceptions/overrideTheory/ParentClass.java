package exceptions.overrideTheory;

import java.io.IOException;
import java.sql.SQLException;

public class ParentClass {

    public void myFirstmethod() throws IOException {
        throw new IOException();
    }

    public void test() throws SQLException {

    }
}
