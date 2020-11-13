package com.example.userbackup.controller;

import com.example.userbackup.entity.Message;
import com.example.userbackup.controller.response.MessageResponse;
import com.example.userbackup.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping(path = "/add")
    @ResponseBody
    public MessageResponse addNewMessage(
            @RequestParam String title,
            @RequestParam String body) {
        Message message = messageService.addNewMessage(title, body);
        return new MessageResponse(message);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Message> getAllMessage() { return messageService.findAll(); }

    @PutMapping(path="/{id}")
    public MessageResponse updateMessage(
            @RequestParam String title,
            @RequestParam String body,
            @RequestParam String id) {
        Message message = messageService.updateMessage(title, body, id);
        return new MessageResponse(message);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(String id) {
        messageService.deleteById(id);
    }
}
