public class PushNotificacion implements Notificaciones{

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificacion Push: [" +mensaje+"]");
        System.out.println("Mensaje enviado!");
    }

}
