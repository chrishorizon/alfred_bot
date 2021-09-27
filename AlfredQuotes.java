import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String greet = String.format("Hello, %s. Lovely to see you.", name);
        return greet; // could return string all in one line
    }
    
    public String dateAnnouncement() {
        Date time = new Date();
        return "It is currently " + time;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if( conversation.indexOf("Alexis") >= 0 ){
            return "Right away, sir.";
        } else if ( conversation.indexOf("Alfred") >= 0 ) {
            return "At your service.";
        } else {
            return "Absolutely, and with that I shall retire.";
        }

    }
}

