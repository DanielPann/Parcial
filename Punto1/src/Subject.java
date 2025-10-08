import java.util.List;

public interface Subject {
    void agregarObservador(ObservadorDeCursos observador);
    void eliminarObservador(ObservadorDeCursos observador);
    void notificarObservadores();
}
