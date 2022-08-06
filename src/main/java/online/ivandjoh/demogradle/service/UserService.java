package online.ivandjoh.demogradle.service;

import online.ivandjoh.demogradle.Entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<List<User>> getAllUsers();

    ResponseEntity<User> getUserById(Long id);

    ResponseEntity<?> updateUser(Long id, User user);

    ResponseEntity<?> createUser(User user);

    ResponseEntity<?> deleteUser(Long id);
}
