

public class NotificacionFactory{
    
    

    public Notificaciones crearNotificacion(String tiposeleccion){
        if (tiposeleccion.equalsIgnoreCase("correo")) {
            return new CorreoNotificacion();
            
        } else if (tiposeleccion.equalsIgnoreCase("sms")) {
            return new SMSNotificacion();
        } else if (tiposeleccion.equalsIgnoreCase("push")) {
            return new PushNotificacion();
        } else {
            throw new IllegalArgumentException("TIPO DE NOTIFICACION NO VALIDO");
        }
    }

    
}
