public class SMSNotificacion implements Notificaciones{

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando SMS: [" +mensaje+"]");
        System.out.println("Mensaje enviado!");
    }

}
