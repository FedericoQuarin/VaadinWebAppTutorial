package com.example.application.data.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;

@Entity
public class Status extends AbstractEntity {

    @NotNull
    private String name;

    public Status(String name) {
        this.name = name;
    }

    public Status() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
