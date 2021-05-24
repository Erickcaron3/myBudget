package net.erickcaron.mybudget.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/in/")
    public String goToHome(){
        return "in/home";
    }
}
