package myBudget.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor

@Controller
public class UserController {


    final private UserService userService;

    @GetMapping(value = "/user/createForm")
    public String showUserCreationForm(Model model) {
        model.addAttribute("user", new User());
        return "/out/create";
    }

    @PostMapping("/user/createForm")
    public String create(@ModelAttribute User user) {
        userService.addUser(user);
        return "index";
    }

    @GetMapping("/user/update/{id}")
    public String showUpdateUserForm(@PathVariable Long id, Model model) {
        User userToUpdate = userService.getUserById(id);
        model.addAttribute("userToUpdate", userToUpdate);
        return "users/userEditionForm";
    }

    @PostMapping("user/update/{id}")
    public void update(User userToUpdate) {
        userService.updateUser(userToUpdate);
    }

    @GetMapping("user/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        User userTodelete = userService.getUserById(id);
        model.addAttribute(userTodelete);
        return "users/userDeletionForm";
    }
    @PostMapping("/user/delete/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteUserById(id);
    }

    @GetMapping(value = "/user/all")
    public String showAll(Model model) {
        List<User> allUsers = userService.showAllUsers();
        model.addAttribute(allUsers);
        return "in/users/allUsers";
    }

}
