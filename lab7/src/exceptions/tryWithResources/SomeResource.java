package exceptions.tryWithResources;

public class SomeResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Close my resource");
    }
}

class Test {
    public static void main(String[] args) throws Exception {
//        SomeResource resource = null;
//        try {
//            resource = new SomeResource();
//            // smth
//        } finally {
//            if(resource != null)
//                resource.close();
//        }

        try(SomeResource resource = new SomeResource();
            SomeResource resource1 = new SomeResource()) {
            //
        } finally {
            System.out.println("final");
        }
    }
}
