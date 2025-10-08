public class GestorNotificaciones {
    private NotificacionStrategy estrategia;
    private String destino;

    public GestorNotificaciones(NotificacionStrategy estrategia, String destino) {
        this.estrategia = estrategia;
        this.destino = destino;
    }
    public void setEstrategia(NotificacionStrategy estrategia) {
        this.estrategia = estrategia;
    }
    public void notificar(String mensaje) {
        estrategia.enviar(mensaje, destino);
    }
}
