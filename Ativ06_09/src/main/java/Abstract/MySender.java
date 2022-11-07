package Abstract;

public class MySender extends AbstractEncodedMessageSender {

    @Override
    public String encode(String message) {
        String ret = message;
        return ret;
    }

    public static void main(String[] args) {
        AbstractEncodedMessageSender sender = new MySender();
        sender.sendMessage("Mensagem 1");

        AbstractEncodedMessageSender otherSender = new AbstractEncodedMessageSender() {

            @Override
            public String encode(String message) {
                String ret = message;
                return ret;
            }
        };

        otherSender.sendMessage("Mensagem 2");

        System.out.println(sender.getClass());
        System.out.println(otherSender.getClass());
    }
}
