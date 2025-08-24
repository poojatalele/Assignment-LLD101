public class EmailNotifier implements Notify{
    private final EmailClient client;

    EmailNotifier(EmailClient client) { 
        this.client = client; 
    }

    @Override
    public void send(String to, String body) {
        client.send(to, body); 
    }
    
}
