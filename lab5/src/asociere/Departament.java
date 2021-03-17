package asociere;

import java.util.Arrays;

public class Departament {
    private String nume;
    private Profesor[] profesors; //agregare - > has-a

    public Departament(String nume, Profesor[] profesors) {
        this.nume = nume;
        this.profesors = profesors;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Profesor[] getProfesors() {
        return profesors;
    }

    public void setProfesors(Profesor[] profesors) {
        this.profesors = profesors;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "nume='" + nume + '\'' +
                ", profesors=" + Arrays.toString(profesors) +
                '}';
    }
}
