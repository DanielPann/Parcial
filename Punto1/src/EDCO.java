import java.util.List;
import java.util.ArrayList;

public class EDCO implements ObserverCursos {
    private List<ObserverCursos> observadores = new ArrayList<>();
    private List<String> ofertaCursos = new ArrayList<>();

    @Override
    public void eliminarObservaddor(ObserverCursos observador) {
        observadores.remove(observador);
    }

    @Override
    public void agregarObservador(ObserverCursos observador) {
        observadores.add(observador);
    }

    @Override
    public void notificarObservadores() {
        for (ObserverCursos observador) {
            observador.actualizar(this.ofertaCursos);
        }
    }

    public void agregarCurso(String nombreCurso) {
        this.ofertaCursos.add(nombreCurso);
        notificarObservadores();
    }

    public void retirarCurso(String nombreCurso) {
        this.ofertaCursos.remove(nombreCurso);
        notificarObservadores();
    }

    public void inicializarCurso(List<String> CursosIniciales) {
        this.ofertaCursos = CursosIniciales;
        notificarObservadores();
    }
    
    

}
