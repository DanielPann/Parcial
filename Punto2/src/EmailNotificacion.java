public class EmailNotificacion implements NotificacionStrategy {
    @Override
    public void enviar(String mensaje, String destino){
        System.out.println("Enviando email a " + destino + " con el siguiente mensaje: " + mensaje);
    }
} 


