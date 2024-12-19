import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var entry = new Scanner(System.in);

        System.out.println("Ingrese un tipo de notificacion:\nCorreo\nSMS\nPush");
        String tiposeleccion = entry.nextLine();

        System.out.println("Ingrese un mensaje " + tiposeleccion + " para enviar:");
        String mensaje = entry.nextLine();

        NotificacionFactory notificacionFactory = new NotificacionFactory();
        notificacionFactory.crearNotificacion(tiposeleccion).enviarNotificacion(mensaje);

    }

}
