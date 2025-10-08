import java.util.List;

public class CommunityManager implements ObserverCursos {
    private String nombre = "Laura Molano";

    @Override
    public void actualizar(List<String> cursos) {
        System.out.println("\n " + nombre + " - Community Manager: La oferta de cursos ha cambiado. Cursos disponibles: " + cursos);
    }
}
