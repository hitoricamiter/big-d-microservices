package ru.zaikin.requestnotificationmicroservice.controller;

import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.zaikin.requestnotificationmicroservice.model.UserFormBlank;
import ru.zaikin.requestnotificationmicroservice.service.UserEventSender;

@Controller
@Named
public class RegistrationController {

    private final UserEventSender userEventSender;

    @Autowired
    public RegistrationController(UserEventSender userEventSender) {
        this.userEventSender = userEventSender;
    }

    @GetMapping("/register")
    public String register(Model model) {
        UserFormBlank userForm = new UserFormBlank();

        model.addAttribute("userFormBlank", userForm);

        return "register";
    }

    @PostMapping("/register/save")
    @ResponseBody
    public String save(Model model, @ModelAttribute("userFormBlank") UserFormBlank userForm) {
        userEventSender.sendUserEvent(userForm);
        return "data was sent";
    }

}
