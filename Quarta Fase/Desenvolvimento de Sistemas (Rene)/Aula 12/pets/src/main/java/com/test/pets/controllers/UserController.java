package com.test.pets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.pets.dtos.users.UserInput;
import com.test.pets.dtos.users.UserOutput;
import com.test.pets.entities.User;
import com.test.pets.repositories.UserRepository;
import com.test.pets.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserRepository repository;

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity <List<UserOutput>> list(){
        List <UserOutput> list = service.list();
        return ResponseEntity.ok(list);
    }


    @PostMapping
    public ResponseEntity <UserOutput> create(@RequestBody UserInput user) {

        UserOutput output = service.create(user);
        return new ResponseEntity(output, HttpStatus.CREATED);
        
    }

    @GetMapping("/{id}")
    public ResponseEntity <User> read(@PathVariable long id){
        User user = repository.findById(id).get();

        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @PutMapping
    public ResponseEntity <User> update(@RequestBody User user){
        User userUpdated = repository.save(user);
        return ResponseEntity.ok(userUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete (@PathVariable Long id){

        repository.deleteById(id);

       // return new ResponseEntity(HttpStatusCode. NO_CONTENT);
       return  ResponseEntity.noContent().build();

    }


    /* 

    http://localhost:8080/swagger-ui.html

    @PathVariable
    http://localhost:8080/users/{user}

    @RequestParam
    http://localhost:8080/users?user={user}

    @RequestBody POST | PUT
    JSON

    */

}
