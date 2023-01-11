package com.example.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne(fetch = FetchType.EAGER)
    private Item item;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Item> lentItems;

    public Person() {
    }

    public Person(String name, Item item) {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public Item getItem() {
        return item;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", item=" + item +
                '}';
    }

    public List<Item> getLentItems() {
        return lentItems;
    }

    public void setLentItems(List<Item> lentItems) {
        this.lentItems = lentItems;
    }
}
