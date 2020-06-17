package com.brasajava.cdi.domain;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private int age;
    private List<Address> addresses;
    private List<Contact> emails;
    private List<Contact> phones;

    public Person() {
        addresses = new ArrayList<>();
        emails = new ArrayList<>();
        phones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Contact> getEmails() {
        return emails;
    }

    public void setEmails(List<Contact> emails) {
        this.emails = emails;
    }

    public List<Contact> getPhones() {
        return phones;
    }

    public void setPhones(List<Contact> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addresses=" + addresses.size() +
                ", emails=" + emails.size() +
                ", phones=" + phones.size() +
                '}';
    }
}
