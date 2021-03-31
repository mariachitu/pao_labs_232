package exceptions.overrideTheory;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        ParentClass parent = new ChildClass();
        try {
            parent.test();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
