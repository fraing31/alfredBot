import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        // TU CÓDIGO AQUÍ
        //return "Hola, " + name + ".Encantado de verte.";
         return String.format( "Hola, %s.Encantado de verte", name);
    }
    
    public String dateAnnouncement() {
        Date fecha = new Date(); 
        // TU CÓDIGO AQUÍ
        return "Actualmente es " + fecha;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > 0){
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        }
        if(conversation.indexOf("Alfred") > 0){
            return "A su servicio. Como desee, naturalmente";
        }
        if(conversation.indexOf("Alexis") < 0 && conversation.indexOf("Alfred") < 0){
            return "Bien. Y con eso, me retiraré."; 
        }
        return ""; 
    }
}
