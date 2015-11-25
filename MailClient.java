/**
 * A class to model a simple email client. The client is run by a
 * particular user, and sends and retrieves mail via a particular server.
 * 
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class MailClient
{
    // Usuario del sistema.
    private String usuario;
    // Servidor utilizado para mandar el mensaje.
    private MailServer servidor;

    /**
     * Constructor que asigna valores a servidor y usuario.
     */
    public MailClient(MailServer servidorX, String usuarioX)
    {
        servidor = servidorX;
        usuario = usuarioX;
    }

    /**
     * Metodo que permite escribir un mensaje a un usuario.
     */
    public void sendMailItem(String a, String mensaje)
    {
        MailItem item = new MailItem(usuario, a, mensaje);
        servidor.post(item);
    }
    
    /**
     * Metodo que devuelve el mensaje enviado.
     */
    public MailItem getNextMailItem()
    {
        return servidor.getNextMailItem(usuario);
    }

    /**
     * Metodo que se encarga de imprimir el mensaje, en caso de que no exista el mensaje 
     * pondra el sigiente mensaje (No tienes ningun mensaje nuevo.).
     */
    public void printNextMailItem()
    {
        MailItem item = servidor.getNextMailItem(usuario);
        if(item == null) {
            System.out.println("No tienes ningun mensaje nuevo.");
        }
        else {
            item.print();
        }
    }
}
