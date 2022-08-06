package online.ivandjoh.demogradle.controller;

import online.ivandjoh.demogradle.Entity.User;
import online.ivandjoh.demogradle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	UserService userService;

	public ResponseEntity<?> homeController() {
		return ResponseEntity.ok("Hello World");
	}

	public ResponseEntity<?> createUser(User user) {
		return userService.createUser(user);
	}

	public ResponseEntity<?> getAllUsers() {
		return userService.getAllUsers();
	}

	public ResponseEntity<?> getUserById(Long id) {
		return userService.getUserById(id);
	}

	public ResponseEntity<?> updateUser(Long id, User user) {
		return userService.updateUser(id, user);
	}

	public ResponseEntity<?> deleteUser(Long id) {
		return userService.deleteUser(id);
	}
}
