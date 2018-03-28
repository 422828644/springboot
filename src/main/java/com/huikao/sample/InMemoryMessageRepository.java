package com.huikao.sample;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by admin on 2018/3/8.
 */
public class InMemoryMessageRepository implements MessageRepository {

    private static AtomicLong counter = new AtomicLong();

    private final ConcurrentMap<Long, Message> message = new ConcurrentHashMap<>();

    @Override
    public Iterable<Message> findAll() {
        return this.message.values();
    }

    @Override
    public Message save(Message message) {
        Long id = message.getId();
        if (id == null) {
            id = counter.incrementAndGet();
            message.setId(id);
        }
        return message;
    }

    @Override
    public Message findMessage(Long id) {
        return this.message.get(id);
    }

    @Override
    public void deleteMessage(Long id) {
        this.message.remove(id);
    }
}
