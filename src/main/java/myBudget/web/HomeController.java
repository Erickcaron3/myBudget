package myBudget.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/in/")
    public String goToHome(){
        return "home.jsp";
    }
}
