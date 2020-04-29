package com.airhacks.workshops.entity;
import java.time.LocalDate;
import javax.persistence.Entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Workshop extends PanacheEntity {
    public String name;
    public LocalDate date;
    public String description;

    public Workshop() {
    }

    public Workshop(String name, LocalDate date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }


}