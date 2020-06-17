package com.brasajava.cdi.service;

import com.brasajava.cdi.domain.*;

import javax.inject.Inject;

public class PersonService {
    @Inject
    private AddressService addressService;
    @Inject
    private EmailService emailService;
    @Inject
    private PhoneService phoneService;

    public Person create(){
        return new Person();
    }
}
