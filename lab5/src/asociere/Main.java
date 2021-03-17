package asociere;

public class Main {

    public static void main(String[] args) {
        Profesor[] profesoriCTI = {
                new Profesor(1, "Ionescu"),
                new Profesor(2, "Popescu"),
                new Profesor(3, "Pop")
        };

        Profesor[] profesoriMateInfo = {
                new Profesor(1, "Adam"),
                new Profesor(2, "Petru"),
                new Profesor(3, "Popa")
        };

        Departament departamentCti = new Departament("cti", profesoriCTI);
        Departament departamentMateInfo = new Departament("mate-info", profesoriMateInfo);

        Universitate unibuc = new Universitate("unibuc", new Departament[]{departamentCti, departamentMateInfo});
        System.out.println(unibuc);

    }
}
