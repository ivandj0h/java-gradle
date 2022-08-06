package online.ivandjoh.demogradle.controller;

import online.ivandjoh.demogradle.Entity.User;
import online.ivandjoh.demogradle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
		List<User> users = null;
		try {
			users = (List<User>) userService.getAllUsers();

			return new ResponseEntity<>(users, HttpStatus.OK);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
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
