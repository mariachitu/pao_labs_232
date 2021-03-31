package exceptions.clone;

public class MyClass {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // clone the object
        return super.clone();
    }
}

class MyCloneClass implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // clone the object
        return super.clone();
    }
}

class TestClone {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        try {
            obj.clone(); // => CloneNotSupportedException
        } catch (CloneNotSupportedException e) {
            System.out.println("MyClass " + e.toString());
        }

        MyCloneClass cloneObj = new MyCloneClass();
        try {
            cloneObj.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Never gets here");
        }
    }
}
