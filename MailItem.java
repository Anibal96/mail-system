
/**
 * A class to model a simple mail item. The item has sender and recipient
 * addresses and a message string.
 * 
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class MailItem
{
    // Emisor del mensaje.
    private String de;
    // Destinatario del mensaje.
    private String a;
    // Mensaje enviado.
    private String mensaje;

    /**
     * Constructor que asigna los valores a de, a y al mensaje.
     */
    public MailItem(String deX, String aX, String mensajeX)
    {
        de = deX;
        a = aX;
        mensaje = mensajeX;
    }

    /**
     * Metodo que imprime el mensaje mostrando tambien el emisor y el destinatario.
     */
    public void print()
    {
        System.out.println("De: " + de);
        System.out.println("A: " + a);
        System.out.println("Mesaje: " + mensaje);
    }
    
    /**
     * Metodo que devuelve el emisor.
     */
    public String getFrom()
    {
        return de;
    }

    /**
     * Metodo que devuelve el destinatario.
     */
    public String getTo()
    {
        return a;
    }

    /**
     * Metodo que devuelve un mensaje.
     */
    public String getMessage()
    {
        return mensaje;
    }
}