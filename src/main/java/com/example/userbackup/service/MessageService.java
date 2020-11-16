package com.example.userbackup.service;

import com.example.userbackup.controller.response.MessageResponse;
import com.example.userbackup.entity.Message;
import com.example.userbackup.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public MessageResponse addNewMessage (Message message) {
        Message messageResponse = messageRepository.save(message);
        return new MessageResponse(messageResponse);
    }

    public MessageResponse updateMessage(Message message) {
        Message messageResponse = messageRepository.save(message);
        return new MessageResponse(messageResponse);
    }

    public void deleteById(String id) {
            messageRepository.deleteById(id);
    }

    public Iterable<Message> findAll() {
        return messageRepository.findAll();
    }

}
