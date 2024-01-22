package PubSubSystem.publisher;

import PubSubSystem.exception.NullMessageException;
import PubSubSystem.manager.PublisherSubscriberManager;
import PubSubSystem.message.Message;

public class DefaultPublisher implements Publisher{


    @Override
    public void publishMessage(Message message,
                               PublisherSubscriberManager manager) throws NullMessageException {
            manager.addMessageToQueue(message);
    }
}
