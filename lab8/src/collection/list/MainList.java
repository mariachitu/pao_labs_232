package collection.list;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String... args) {
        //without generics
        List objects = new ArrayList();
        objects.add(1);
        objects.add("Element");
        objects.add(new Object());
        System.out.println(objects);

        for(Object ob : objects)    {
            System.out.println(ob);
        }

 //       System.out.println(args.length);

        Example5 exemple5 = new Example5();
        exemple5.doOperationsOnArrayList();
        exemple5.convertArraysToList();
        exemple5.showCollections();
        exemple5.doOperationsOnLinkedList();
    }
}
