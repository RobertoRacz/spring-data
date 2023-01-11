package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Item() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
