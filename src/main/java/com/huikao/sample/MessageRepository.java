package com.huikao.sample;

/**
 * Created by admin on 2018/3/8.
 */
public interface MessageRepository {

    Iterable<Message> findAll();

    Message save(Message message);

    Message findMessage(Long id);

    void deleteMessage(Long id);
}
