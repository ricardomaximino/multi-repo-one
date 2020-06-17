package com.brasajava.cdi;

import com.brasajava.cdi.domain.Person;
import com.brasajava.cdi.service.PersonService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class AppCID {
        public static void main(String[] args) {
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();

        try (SeContainer container = initializer.initialize()) {
            PersonService service = container.select(PersonService.class).get();
            Person person = service.create();
            System.out.println(person);
        }
    }
//    public static void main(String[] args) {
//        WeldContainer weldContainer = new Weld().initialize();
//        PersonService service = weldContainer.instance().select(PersonService.class).get();
//        Person person = service.create();
//        System.out.println(person);
//
//    }
}
