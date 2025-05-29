package ru.zaikin.requestnotificationmicroservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.zaikin.requestnotificationmicroservice.model.UserFormBlank;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String register(Model model) {
        UserFormBlank userForm = new UserFormBlank();

        model.addAttribute("userFormBlank", userForm);

        return "register";
    }

    @PostMapping("/register/save")
    @ResponseBody
    public String save(Model model, @ModelAttribute("userFormBlank") UserFormBlank userForm) {
        return "Данные были отправлены";
    }

}
