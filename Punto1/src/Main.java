
import java.util.List;



public class Main {
    public static void main(String[] args) throws Exception {
        EDCO edco = new EDCO();

        Webmaster webmaster = new Webmaster();
        Periodista periodista = new Periodista();
        CommunityManager communityManager = new CommunityManager();

        edco.agregarObservador(webmaster);
        edco.agregarObservador(periodista);
        edco.agregarObservador(communityManager);

        List<String> cursosIniciales = List.of("Curso de Java", "Curso de Python", "Curso de JavaScript");
        edco.inicializarCurso(cursosIniciales);

        edco.agregarCurso("Curso de C#");
        edco.retirarCurso("Curso de Python");

    }
}
