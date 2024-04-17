package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    // private List<User> userList = new ArrayList<>(); // futuro sera una base de
    // datos
    @Autowired
    private IUserRepository repositoryUser;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/adasasda/{id}")
    @ResponseBody
    public User getUser(@PathVariable int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null; // si no esta el id
    }

    @GetMapping("/users") // recibo la lista
    @ResponseBody
    public List<User> getUsers(String param) {

        return repositoryUser.findAll();
    }

    @PostMapping("/users")
    public String setUsers(@RequestBody User entity) {
        userList.add(entity);

        return "Usuario creado";
    }

    @PutMapping("/users/{id}") // defin ruta {id}
    public String updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        for (User user : userList) {
            if (user.getId() == id) { // busca usuario por id
                // actualiza el usuario
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());

                return "Usuario actualizado exitosamente";
            }
        }
        return "Usuario no encontrado"; // si usuario no esta
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        for (User user : userList) {
            if (user.getId() == id) { // busca id
                userList.remove(user); // elimina usuario
                return "Usuario eliminado exitosamente";
            }
        }
        return "Usuario no encontrado"; // si usuario no esta
    }
}