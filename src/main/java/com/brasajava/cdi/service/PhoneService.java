package com.brasajava.cdi.service;

import com.brasajava.cdi.domain.Contact;
import com.brasajava.cdi.domain.Phone;

public class PhoneService {

    public Contact create(){
        return new Phone();
    }
}
