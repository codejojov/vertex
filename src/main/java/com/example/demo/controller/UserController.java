package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.User;
import com.example.demo.services.IUserRepository;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

	private List<User> userList;

	// datos
	@Autowired
	private IUserRepository repositoryUser;

	// Listar todos los datos
	@GetMapping("/users")
	@ResponseBody
	public Iterable<User> findAll() {
		return repositoryUser.findAll();
	}

	@GetMapping("/users/{id}")
	@ResponseBody
	public Optional<User> findById(@PathVariable Long id) {

		User user = repositoryUser.findAll();

		for (User u : userList) {
			if (user.getId() == id) {
				return user.;
			}
		}
		return null;
	}

	@PostMapping("/users")
	public String setUsers(@RequestBody User entity) {
		repositoryUser.save(entity);

		return "Usuario creado";
	}

}

/*
 * 
 * 
 * //LEER DATOS POR ID // @GetMapping("/users/{id}") // @ResponseBody // public
 * User getUser(@PathVariable int id) { // for (User user : userList) { // if
 * (user.getId() == id) { // return user; // } // } // return null; // }
 * 
 * 
 * @PostMapping("/users") public String setUsers(@RequestBody User entity) {
 * userList.add(entity);
 * 
 * return "Usuario creado"; }
 * 
 * // @PutMapping("/users/{id}") // defin ruta {id} // public String
 * updateUser(@PathVariable int id, @RequestBody User updatedUser) { // for
 * (User user : userList) { // if (user.getId() == id) { // busca usuario por id
 * // // actualiza el usuario // user.setName(updatedUser.getName()); //
 * user.setEmail(updatedUser.getEmail()); // // return
 * "Usuario actualizado exitosamente"; // } // } return "Usuario no encontrado";
 * // si usuario no esta }
 * 
 * // @DeleteMapping("/users/{id}") // public String deleteUser(@PathVariable
 * int id) { // for (User user : userList) { // if (user.getId() == id) { //
 * busca id // userList.remove(user); // elimina usuario // return
 * "Usuario eliminado exitosamente"; // } // } // return
 * "Usuario no encontrado"; // si usuario no esta // } }
 */