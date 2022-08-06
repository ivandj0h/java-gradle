package online.ivandjoh.demogradle.controller;

import lombok.extern.slf4j.Slf4j;
import online.ivandjoh.demogradle.Entity.User;
import online.ivandjoh.demogradle.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class HomeController {

	@Autowired
	UserService userService;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("")
	public ResponseEntity<?> homeController() {
		return ResponseEntity.ok("Hello World");
	}

	@PostMapping(value = "/user", produces = "application/json")
	public ResponseEntity<User> createUser(User user) {
		try {
			logger.info("Creating user: {}", user);
			userService.createUser(user);
			return new ResponseEntity<>(user, HttpStatus.CREATED);
		} catch (Exception e) {
			logger.error("Error creating user: {}", user);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

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
