package old_practice.PubSubSystem.publisher;

import old_practice.PubSubSystem.exception.NullMessageException;
import old_practice.PubSubSystem.manager.PublisherSubscriberManager;
import old_practice.PubSubSystem.message.Message;

public interface Publisher {

    void publishMessage(Message message, PublisherSubscriberManager manager) throws NullMessageException;

}
