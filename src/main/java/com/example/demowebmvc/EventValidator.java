package com.example.demowebmvc;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Event.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Event event = (Event) target;
        if(event.getName().equalsIgnoreCase("aaaa")){
            errors.rejectValue("name", "wrongValue", "the value is now allowed");
        }

    }
}
