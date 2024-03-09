package com.eadcw.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping("")
  public List<User> getAllUsers(){
    return userService.getAllUsers();
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getUserById(@PathVariable("id") String id){
    return ResponseEntity.ok(userService.getUserById(id));

  }

  @PostMapping("/register")
  public User registerUser(@RequestBody User user){
    return userService.registerUser(user);
  }


}
