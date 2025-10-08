public class SmsNotificacion implements NotificacionStrategy {
    @Override
    public void enviar(String mensaje, String destino) {
        System.out.println("Enviando SMS a " + destino + " con el siguiente mensaje: " + mensaje);
    }

}
