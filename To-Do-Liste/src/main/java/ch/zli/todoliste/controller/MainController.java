package ch.zli.todoliste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//dient für das aufrufen der seiten im frontend (thymeleaf)
@Controller
public class MainController {
    //homepage
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    //login page
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
