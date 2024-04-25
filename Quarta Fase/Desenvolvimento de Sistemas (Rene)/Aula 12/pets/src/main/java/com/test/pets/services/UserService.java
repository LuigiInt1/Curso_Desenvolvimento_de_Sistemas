package com.test.pets.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pets.dtos.users.UserInput;
import com.test.pets.dtos.users.UserOutput;
import com.test.pets.entities.User;
import com.test.pets.repositories.UserRepository;

@Service
public class UserService {

    @Autowired    
    private UserRepository repository;

    public UserOutput create(UserInput input){

        User user = convertInputToUser(input);
        user = repository.save(user);
        return convertUserToOutput(user);

    }

    public List<UserOutput> list(){
        //[user1, user2, user3].map(user => convertUserOutput(user))
        return repository
        .findAll()
        .stream()
        .map(u -> convertUserToOutput( u ))
        .toList();
    }

    private UserOutput convertUserToOutput(User user){
        UserOutput output = new UserOutput(
            user.getId(),
            user.getUsername(),
            user.getFirstName(),
            user.getLasName(),
            user.getEmail(),
            user.getUserStatus()
            );
            return output;
    }


    private User convertInputToUser(UserInput input){
        User user = new User();
        user.setEmail(input.getEmail());
        user.setUsername(input.getUsername());
        user.setPassword(input.getPassword());
        user.setFirstName(input.getFirstName());
        user.setLasName(input.getLasName());
        user.setPhone(input.getPhone());
        return user;
    }

}
