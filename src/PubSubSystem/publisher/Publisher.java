package PubSubSystem.publisher;

import PubSubSystem.exception.NullMessageException;
import PubSubSystem.manager.PublisherSubscriberManager;
import PubSubSystem.message.Message;

public interface Publisher {

    void publishMessage(Message message, PublisherSubscriberManager manager) ;

}
