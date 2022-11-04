package com.nuop.mobileProject.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSettings {

  private final UserRepository userRepository;

  @Autowired
  public UserSettings(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User createUser(UserForm userForm) {

    User user = new User();

    user.setName(userForm.getName());
    user.setSurname(userForm.getSurname());
    user.setEmail(userForm.getEmail());
    user.setEmail(userForm.getMobile());

    return user;
  }
  
  public User saveUser(User user) {
    return userRepository.save(user);
  }
  
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
