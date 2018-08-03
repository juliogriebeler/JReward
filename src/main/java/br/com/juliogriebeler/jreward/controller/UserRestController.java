package br.com.juliogriebeler.jreward.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.juliogriebeler.jreward.exception.UserNotFoundException;
import br.com.juliogriebeler.jreward.model.User;
import br.com.juliogriebeler.jreward.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private UserRepository userRepository;


	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userRepository.insert(user);
	}

	@GetMapping("/{userId}")
	public User readUser(@PathVariable String userId) {
		return userRepository.findById(userId)
			.orElseThrow(() -> new UserNotFoundException(userId));
	}
	
	@GetMapping("/all")
	public List<User> readUsers() {
		return userRepository.findAll();
	}

	@PostMapping("/update")
	public User updateUser(@PathVariable String userId, @RequestBody User user) {
		this.validateUser(userId);
		return userRepository.insert(user);
	}

	@PostMapping("/delete/{userId}")
	public boolean deleteUser(@PathVariable String userId) {
		this.validateUser(userId);
		userRepository.deleteById(userId);
		return true;
	}
	/**
	 * Verify the {@literal userId} exists.
	 *
	 * @param userId
	 */
	private void validateUser(String userId) {
		userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
	}
}