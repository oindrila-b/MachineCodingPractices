package old_practice.PubSubSystem.subscriber;

import old_practice.PubSubSystem.message.Message;

public interface Subscriber {
    void consumeMessage(Message message);
}
