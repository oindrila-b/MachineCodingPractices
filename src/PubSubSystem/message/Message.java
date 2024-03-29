package PubSubSystem.message;

import PubSubSystem.topic.Topic;

public class Message {
    private Topic topic;
    private String message;

    public Message(Topic topic, String message) {
        this.topic = topic;
        this.message = message;
    }

    public Topic getTopic() {
        return topic;
    }

    public String getMessage() {
        return message;
    }
}
