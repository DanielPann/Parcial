import java.util.List;

public class Webmaster implements ObserverCursos {
    private String nombre = "Andrea Mahecha";

    @Override
    public void actualizar(List<String> cursos) {
    System.out.println("\n " + nombre + " - Webmaster: La oferta de cursos ha cambiado. Cursos disponibles: " + cursos);
    }


} 

