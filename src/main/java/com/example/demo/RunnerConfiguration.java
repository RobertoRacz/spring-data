package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RunnerConfiguration {

    @Bean
    ApplicationRunner whyAreYouRunning(ItemRepository itemRepository, PersonRepository personRepository) {
        return arguments -> {
            Item item = new Item("Termos");
            itemRepository.save(item);
            itemRepository.findAll().forEach(System.out::println);

            Person person = new Person("Roby", item);
            personRepository.save(person);
            personRepository.findAll().forEach(System.out::println);
        };
    }
}
