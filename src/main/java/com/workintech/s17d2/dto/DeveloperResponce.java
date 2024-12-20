package com.workintech.s17d2.dto;

import com.workintech.s17d2.model.Developer;

public class DeveloperResponce {
    private Developer developer;
    private int status;
    private String message ;

    public DeveloperResponce(Developer developer, int status , String message ) {
        this.developer = developer;
        this.message = message;
        this.status = status;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
