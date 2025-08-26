package old_practice.PubSubSystem.publisher;

import old_practice.PubSubSystem.exception.NullMessageException;
import old_practice.PubSubSystem.manager.PublisherSubscriberManager;
import old_practice.PubSubSystem.message.Message;

public class DefaultPublisher implements Publisher{


    @Override
    public void publishMessage(Message message,
                               PublisherSubscriberManager manager) throws NullMessageException {
            manager.addMessageToQueue(message);
    }
}
