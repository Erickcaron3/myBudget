package myBudget.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class AdminController {

    @GetMapping("/admin")
    public String goToHome(){
        return "in/admin/admin";
    }
}
