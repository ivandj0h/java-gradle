package online.ivandjoh.demogradle.controller;

import online.ivandjoh.demogradle.Entity.User;
import online.ivandjoh.demogradle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

	@Autowired
	UserService userService;

	@GetMapping("")
	public ResponseEntity<?> homeController() {
		return ResponseEntity.ok("Hello World");
	}

	@PostMapping("/user")
	public ResponseEntity<?> createUser(User user) {

		return userService.createUser(user);
	}

	@GetMapping("/users/all")
	public ResponseEntity<?> getAllUsers() {

		return userService.getAllUsers();
	}

	@GetMapping("/users/id")
	public ResponseEntity<?> getUserById(Long id) {

		return userService.getUserById(id);
	}

	@PutMapping("/users/id")
	public ResponseEntity<?> updateUser(Long id, User user) {

		return userService.updateUser(id, user);
	}

	@DeleteMapping("/users/id")
	public ResponseEntity<?> deleteUser(Long id) {

		return userService.deleteUser(id);
	}
}
