package PubSubSystem.manager;

import PubSubSystem.exception.InvalidSubscriberException;
import PubSubSystem.exception.NullMessageException;
import PubSubSystem.exception.NullTopicException;
import PubSubSystem.message.Message;
import PubSubSystem.subscriber.Subscriber;
import PubSubSystem.topic.Topic;

public interface PublisherSubscriberManager {

    void  addMessageToQueue(Message message) throws NullMessageException;

    void addNewSubscriber(String topic, Subscriber subscriber) throws NullTopicException, InvalidSubscriberException;

    void removeSubscriber(String topic,Subscriber subscriber) throws InvalidSubscriberException, NullTopicException;

    void broadcast();

}
