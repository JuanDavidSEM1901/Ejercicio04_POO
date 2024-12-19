public class CorreoNotificacion implements Notificaciones{

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando correo: [" +mensaje+"]");
        System.out.println("Mensaje enviado!");
    }

}
