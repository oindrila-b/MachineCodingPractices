package PubSubSystem.subscriber;

import PubSubSystem.message.Message;

public interface Subscriber {
    void consumeMessage(Message message);
}
