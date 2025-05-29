package ru.zaikin.userstoragemicroservice.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import ru.zaikin.userstoragemicroservice.dto.UserDTO;

import java.util.function.Consumer;

@Service
public class UserProcessor {

    @Bean
    public Consumer<UserDTO> processRequestNotification() {
        return event -> {
            // Логика обработки события, например, сохранение в базу данных
            System.out.println("Получено событие: " + event.getFirstName() + " - " + event.getLastName());
        };
        }
    }


