package Abstract;

public abstract class AbstractEncodedMessageSender {

    public void sendMessage(String message) {
        System.out.println("Encode message firt");
        String encoded = encode(message);
        System.out.println("sending message...");

        System.out.println(encoded);
        System.out.println("message send");
    }

    public abstract String encode(String message);

}
