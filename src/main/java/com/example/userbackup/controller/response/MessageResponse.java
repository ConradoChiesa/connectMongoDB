package com.example.userbackup.controller.response;

import com.example.userbackup.entity.Message;

public class MessageResponse {
    private String title;
    private String message;
    private String id;
    /**
     * Constructor.
     */
    public MessageResponse(Message message) {
        this.title = message.getTitle();
        this.message = message.getBody();
        this.id = message.getId();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
