package old_practice.PubSubSystem.manager;

import old_practice.PubSubSystem.exception.InvalidSubscriberException;
import old_practice.PubSubSystem.exception.NullMessageException;
import old_practice.PubSubSystem.exception.NullTopicException;
import old_practice.PubSubSystem.message.Message;
import old_practice.PubSubSystem.subscriber.Subscriber;

import java.util.*;

public class DefaultPubSubManager implements PublisherSubscriberManager {

    private Queue<Message> messageQueue;
    private Map<String, List<Subscriber>> subscriberTopicMap;

    public DefaultPubSubManager() {
        messageQueue = new LinkedList<>();
    }

    @Override
    public void addMessageToQueue(Message message) throws NullMessageException {
        if (message == null) throw new NullMessageException();
        messageQueue.add(message);
    }

    @Override
    public void addNewSubscriber(String topic, Subscriber subscriber) throws NullTopicException, InvalidSubscriberException {
        if (topic == null) throw new NullTopicException();
        if (subscriber == null) throw new InvalidSubscriberException();
        if (!subscriberTopicMap.containsKey(topic)){
            subscriberTopicMap.put(topic, new ArrayList<>());
        }
        subscriberTopicMap.get(topic).add(subscriber);
    }

    @Override
    public void removeSubscriber(String topic,Subscriber subscriber) throws InvalidSubscriberException, NullTopicException {
        if (subscriber == null) throw new InvalidSubscriberException();
        if (topic == null || topic.isEmpty()) throw new NullTopicException();
        subscriberTopicMap.get(topic).remove(subscriber);

    }

    @Override
    public void broadcast() {
        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            String topicName = message.getTopic().getTopicName();
            List<Subscriber> subscribers = subscriberTopicMap.get(topicName);
            subscribers.forEach(subscriber -> {
                subscriber.consumeMessage(message);
            });
        }
    }
}
