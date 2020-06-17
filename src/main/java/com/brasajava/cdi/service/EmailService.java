package com.brasajava.cdi.service;

import com.brasajava.cdi.domain.Contact;
import com.brasajava.cdi.domain.Email;

public class EmailService {

    public Contact create(){
        return new Email();
    }
}
