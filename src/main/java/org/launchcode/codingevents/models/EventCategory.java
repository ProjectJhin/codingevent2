package org.launchcode.codingevents.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Objects;

@Entity
public class EventCategory extends AbstractEntity {


    public EventCategory(String name) {
        super(name);
    }

    public EventCategory() {}
    @Override
    public String toString() {
        return "EventCategory{" +
                "name='" + this.getName() + '\'' +
                '}';
    }

}
