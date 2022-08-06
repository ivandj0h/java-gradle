package online.ivandjoh.demogradle.service.Impl;

import online.ivandjoh.demogradle.Entity.User;
import online.ivandjoh.demogradle.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public ResponseEntity<List<User>> getAllUsers() {
        return null;
    }

    @Override
    public ResponseEntity<User> getUserById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateUser(Long id, User user) {
        return null;
    }

    @Override
    public ResponseEntity<?> createUser(User user) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteUser(Long id) {
        return null;
    }
}
