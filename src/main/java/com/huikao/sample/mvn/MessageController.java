package com.huikao.sample.mvn;

import com.huikao.sample.Message;
import com.huikao.sample.MessageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 2018/3/8.
 */
@Controller
@RequestMapping("/")
public class MessageController {

    private final MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping
    public ModelAndView list() {
        Iterable<Message> messages = this.messageRepository.findAll();
        return new ModelAndView("");//TODO
    }

    /**
     * TODO
     * @param message
     * @return
     */
    public ModelAndView view(@PathVariable("id") Message message) {
        return new ModelAndView("");
    }
}
