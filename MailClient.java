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
    public MailClient(MailServer servidor, String usuario)
    {
        this.servidor = servidor;
        this.usuario = usuario;
    }

    /**
     * Metodo que permite escribir un mensaje a un usuario.
     */
    public void sendMailItem(String a,String subject, String mensaje)
    {
        MailItem item = new MailItem(usuario, a, subject, mensaje);
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
    
    /**
     * 
     */
    public void howManyMailItemsIHave(){
        int contador = servidor.howManyMailItems(usuario);
        System.out.println("Correos pendientes: " + contador);
    }
    
    /**
     * 
     */
    public void printNextMailItemAndSendAutomaticRespond()
    {
        MailItem item = servidor.getNextMailItem(usuario);
        if(item == null) {
            System.out.println("No tienes ningun mensaje nuevo.");
        }
        else {
            String respuesta = "Ahora no estoy en la oficina";
            MailItem items = new MailItem(item.getTo(), item.getFrom(), item.getSubject(), respuesta);
            servidor.post(item);
           
        }
    }
}
