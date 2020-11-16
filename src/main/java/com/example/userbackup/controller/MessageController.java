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

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody MessageResponse addNewMessage(@RequestBody Message message) {
        return messageService.addNewMessage(message);
    }

    @GetMapping
    public @ResponseBody Iterable<Message> getAllMessage() { return messageService.findAll(); }

    @PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    public @ResponseBody MessageResponse updateMessage(@RequestBody Message message) {
        return messageService.updateMessage(message);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable String id) {
        messageService.deleteById(id);
    }
}
