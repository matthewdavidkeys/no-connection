import java.io.Serializable;

public class Message implements Serializable {
    public enum MessageType {
        JOIN,
        LEAVE,
        MESSAGE,
        WHISPER,
        CLIENT,
        ONLINE,
        SERVER
    }

    private MessageType type;
    private String message;

    public Message(MessageType type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public MessageType getMessageType() {
        return type;
    }
}
