package com.brasajava.cdi.domain;

public class Email implements Contact {
    private String email;
    private String title;

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String getContact() {
        return email;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
