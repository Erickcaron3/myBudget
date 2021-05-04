package myBudget;

import myBudget.user.User;
import myBudget.user.UserDAO;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

public class LoginController {

    @Autowired
    private UserDAO userDAO;

    @PostMapping("/login")
    public String authentification(@RequestParam String login, @RequestParam String password) {
        //TODO session à mettre en place
        User loginToAuth = userDAO.findByLogin(login);
        if(isAuthOk(loginToAuth, password)){
            return "redirect:in/home";
        } else {
            return "redirect:index";
        }

    }

    public Boolean isAuthOk(User login, String password) {
        return password.equals(login.getPassword1());
    }

}
