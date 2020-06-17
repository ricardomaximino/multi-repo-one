package com.brasajava.cdi.domain;

public class Phone implements Contact {
    private String phone;
    private String title;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getContact() {
        return phone;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone='" + phone + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
