package old_practice.PubSubSystem.manager;

import old_practice.PubSubSystem.exception.InvalidSubscriberException;
import old_practice.PubSubSystem.exception.NullMessageException;
import old_practice.PubSubSystem.exception.NullTopicException;
import old_practice.PubSubSystem.message.Message;
import old_practice.PubSubSystem.subscriber.Subscriber;

public interface PublisherSubscriberManager {

    void  addMessageToQueue(Message message) throws NullMessageException;

    void addNewSubscriber(String topic, Subscriber subscriber) throws NullTopicException, InvalidSubscriberException;

    void removeSubscriber(String topic,Subscriber subscriber) throws InvalidSubscriberException, NullTopicException;

    void broadcast();

}
