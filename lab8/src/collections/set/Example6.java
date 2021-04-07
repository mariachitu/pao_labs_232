package collections.set;

import files.model.Student;

import java.util.*;

public class Example6 {

    private Set<Integer> hashSet = new HashSet<>();
    private Set<Integer> treeSet = new TreeSet<>();
    private Set<Integer> linkedHashSet = new LinkedHashSet<>();
    private Set<Student> students = new TreeSet<>();

    public void doOperationsOnhashSet() {
        boolean result = hashSet.add(11);
        System.out.println(result);
        result = hashSet.add(12);
        System.out.println(result);
        result = hashSet.add(11);
        System.out.println(result);
        System.out.println(hashSet);

        Set<Integer> setInts = Set.of(4,5,6,7);
        List<Integer> listInts = Arrays.asList(45,11);
        hashSet.addAll(setInts);
        hashSet.addAll(listInts);

        result = hashSet.remove(11);
        System.out.println(result);

        result = hashSet.remove(11);
        System.out.println(result);

        System.out.println(hashSet.contains(4));
        System.out.println(hashSet);
    }

    public void doOperationsOnTreeSet() {
        treeSet.add(123);
        treeSet.addAll(hashSet);
        treeSet.add(13);
        System.out.println(treeSet);
    }

    public void doOperationsOnStudentsSet() {
        students.add(new Student("Ion", 23));
        students.add(new Student("Gigel", 20));
        students.add(new Student("Marcel", 30));
        System.out.println(students);

        //Set<Student> students2 = new TreeSet<>(new StudentComparator());
        Set<Student> students2 = new TreeSet<>((a, b) -> b.getName().compareTo(a.getName()));
        students2.add(new Student("Ion", 23));
        students2.add(new Student("Gigel", 20));
        students2.add(new Student("Marcel", 30));
        System.out.println(students2);
    }

    public void doOperationsOnLinkedhashSet() {
        linkedHashSet.add(12);
        linkedHashSet.add(44);
        linkedHashSet.add(34);

        System.out.println(linkedHashSet);
    }

    public static void main(String[] args) {
        Example6 example6 = new Example6();
        example6.doOperationsOnhashSet();
        example6.doOperationsOnTreeSet();
        example6.doOperationsOnStudentsSet();
        example6.doOperationsOnLinkedhashSet();
    }
}
