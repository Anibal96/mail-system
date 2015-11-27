
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
    private String from;
    // Destinatario del mensaje.
    private String to;
    // Mensaje enviado.
    private String menssage;

    /**
     * Constructor que asigna los valores a de, a y al mensaje.
     */
    public MailItem(String from, String to, String menssaje)
    {
        this.from = from;
        this.to = to;
        this.menssage = menssage;
    }

    /**
     * Metodo que imprime el mensaje mostrando tambien el emisor y el destinatario.
     */
    public void print()
    {
        System.out.println("De: " + from);
        System.out.println("A: " + to);
        System.out.println("Mesaje: " + menssage);
    }
    
    /**
     * Metodo que devuelve el emisor.
     */
    public String getFrom()
    {
        return from;
    }

    /**
     * Metodo que devuelve el destinatario.
     */
    public String getTo()
    {
        return to;
    }

    /**
     * Metodo que devuelve un mensaje.
     */
    public String getMessage()
    {
        return menssage;
    }
}