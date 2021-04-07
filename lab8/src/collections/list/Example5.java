package collections.list;

import java.util.*;

public class Example5 {

    private List<String> names = new ArrayList<>();
    private List<Integer> numbers = new LinkedList<>();

    public void doOperationsOnArrayList()   {
        System.out.println(names.isEmpty());

        // add at the end of the list
        names.add("Paula");
        names.add("Ana");

        //ad at particular index
        names.add(0, "Teo");

        List<String> otherNames = new ArrayList<>();
        List<String> otherNames2 = new ArrayList<>(names);
        List<String> otherNames3 = new ArrayList<>(20);
        otherNames.add("Maria");
        otherNames.add("Ana");
       // names.addAll(otherNames);
        names.addAll(1, otherNames);

        System.out.println(names.indexOf("Ana"));
        System.out.println(names.lastIndexOf("Ana"));

        System.out.println("---------");
        displayList();
        System.out.println("---------");
        anotherDisplayList();
        System.out.println("---------");
        otherDisplayList();
        System.out.println("---------");

        //List<String> subList = names.subList(1, 4);
        //System.out.println(subList);

        names.set(0, "Dana");
        System.out.println(names.get(0));

        // overloaded method
        String name = names.remove(0);
        System.out.println(name);
        boolean result = names.remove("Ana");
        System.out.println(result);

        System.out.println(names.contains("Ana"));

        names.removeAll(otherNames);

        names.clear();

        System.out.println(names.size());
        System.out.println(names);
    }

    private void displayList()  {
        Iterator <String> iterator = names.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void anotherDisplayList()   {
        for(String name: names) {
            System.out.println(name);
        }
    }

    private void otherDisplayList() {
        for(int i =0; i < names.size(); i++)    {
            System.out.println(names.get(i));
        }
    }

    public void convertArraysToList()  {
        Integer[] arr = {11, 12, 13};
        arr[0] = 123;
        List<Integer> ints = List.of(arr);
//        ints.set(1, 1234);
//        ints.remove(123);
        System.out.println(ints);

        Integer[] array = {2,3,5,6,67};
        List<Integer> list = Arrays.asList(array);
        array[0] = 11;
        list.set(1, 12);
        //list.add(123); //-> UnsupportedOperationException
        System.out.println(Arrays.toString(array));
        System.out.println(list);
    }

    public void showCollections()  {
        List<String> otherNames = new ArrayList<>();
        otherNames.add("Maria");
        otherNames.add("Ana");
        otherNames.add("Dana");

        Collections.sort(otherNames);
        System.out.println(otherNames);

        System.out.println(Collections.binarySearch(otherNames, "Maria"));
        System.out.println(Collections.binarySearch(otherNames, "Mariana"));

        Collections.sort(otherNames, Collections.reverseOrder());
        System.out.println(otherNames);

        Collections.shuffle(otherNames);
        System.out.println(otherNames);
    }

    public void doOperationsOnLinkedList()   {
        Deque<String> deque = new ArrayDeque<>();
        LinkedList<String> list = new LinkedList<>();

        list.add("abc");
        list.add(0, "cd");
        list.addFirst("aa");
        list.addLast("bbb");
        System.out.println(list);

        String el = list.removeFirst();
        String el2 = list.removeLast();

        list.addAll(names);
        list.removeFirstOccurrence("cd");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list);
    }
}
