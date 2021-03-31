package exceptions.overrideTheory;

import java.io.FileNotFoundException;

public class ChildClass extends ParentClass{

//    public void myFirstmethod() throws IOException {
//        throw new IOException();
//    }

//    public void myFirstmethod() {
//       // smth
//    }

//    public void myFirstmethod() throws FileNotFoundException {
//        throw new FileNotFoundException();
//    }

    @Override
    public void myFirstmethod() throws FileNotFoundException, RuntimeException {
    }

    public void test() {

    }
}
