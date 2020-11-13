package com.example.userbackup.service;

import com.example.userbackup.entity.Message;
import com.example.userbackup.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message addNewMessage (String title, String body) {

        Message m = new Message();
        m.setTitle(title);
        m.setBody(body);
        return messageRepository.save(m);

    }

    public @ResponseBody Iterable<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public Message updateMessage(String title, String body, String id) {
        Message m = new Message();
        m.setId(id);
        m.setTitle(title);
        m.setBody(body);
        return messageRepository.save(m);
    }

    public void deleteById(String id) {
        try {
            messageRepository.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }

    public Iterable<Message> findAll() {
        return messageRepository.findAll();
    }

}
