package myBudget.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateUserController {

    @RequestMapping("/out/")
    public String createUser(){
        return "create.jsp";
    }
}
