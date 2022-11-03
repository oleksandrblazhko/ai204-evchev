package com.nuop.mobileProject.model.User;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

  private final UserSettings userService;

  @Autowired
  public UserController(UserSettings userService) {
    this.userService = userService;
  }

  @GetMapping("/users")
  public String getAllUsers(Model model) {

    List<User> users = userService.getAllUsers();
    model.addAttribute("users", users);
    System.out.println("USERS = " + users);

    return "usersPage";
  }

  @PostMapping("/users")
  public String addUser(@RequestBody UserForm userForm) {

    User user = userService.createUser(userForm);
    userService.saveUser(user);

    return "redirect:/users";
  }
  
  @GetMapping("/users/add")
  public String getAddUserPage() {

    return "addUserPage";
  }
}
