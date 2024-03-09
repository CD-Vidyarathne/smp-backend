package com.eadcw.user;

import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository repo;

  public List<User> getAllUsers(){
    return repo.findAll();
  }
  public User getUserById(String id) {
    System.out.println("Fetching user by ID: " + id);
    return repo.findById(new ObjectId(id)).orElse(User.builder().build());
  }
  public User registerUser(User user){
    return repo.save(user);
  }
}
