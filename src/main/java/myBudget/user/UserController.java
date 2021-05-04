package myBudget.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping(value="/user/createForm")
    public String showUserCreationForm(Model model){
        model.addAttribute("user", new User());
        return "/out/create";
    }

    @PostMapping("/user/createForm")
    public String create(@ModelAttribute User user) {
        userDAO.create(user);
        return "index";
    }

    @RequestMapping("/user/update/{id}")
    @ResponseBody
    public void update(@PathVariable long id){

    }

    @RequestMapping("/user/delete/{id}")
    public void delete(@PathVariable long id) {

        User userToDelete = userDAO.findById(id);
        userDAO.delete(userToDelete);
    }

    @RequestMapping(value = "/user/all", method = RequestMethod.GET)
    public List<User> findAll(){
        return userDAO.findAll();
    }

}
