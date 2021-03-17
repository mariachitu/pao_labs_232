package asociere;

import java.util.Arrays;

public class Universitate {
    private String name;
    private Departament[] departaments; //compozite

    public Universitate(String name, Departament[] departaments) {
        this.name = name;
        //this.departaments = departaments;
        this.departaments = Arrays.copyOf(departaments, departaments.length);
    }

    @Override
    public String toString() {
        return "Universitate{" +
                "name='" + name + '\'' +
                ", departaments=" + Arrays.toString(departaments) +
                '}';
    }
}
