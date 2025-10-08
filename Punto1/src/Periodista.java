import java.util.List;

public class Periodista implements ObserverCursos {
    private String nombre = "Luz Dary Varela";

    @Override
    public void actualizar(List<String> cursos) {
        String ultimoCurso = cursos.get(cursos.size() - 1);
        System.out.println("\n " + nombre + " - Periodista: Se ha agregado un nuevo curso: " + ultimoCurso);
    }
}


