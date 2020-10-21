package com.IntegratedProject.SpringIntegrated.controller;

import com.IntegratedProject.SpringIntegrated.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.IntegratedProject.SpringIntegrated.model.User;

import java.util.List;


@RestController
@RequestMapping(value = "/users")
public class Controller {

    @Autowired
    private Service service;

    @CrossOrigin
    @GetMapping(value = "/{division}")
    public List<User> getUsers(@PathVariable String division){
        return this.service.getUsers(division);
    }

    @CrossOrigin
    @GetMapping(value = "/{check}/{id}")
    public boolean checkId(@PathVariable int id){
        return this.service.checkId(id);
    }

    @CrossOrigin
    @PostMapping
    public User postUser(@RequestBody User user){
        return this.service.postUser(user);
    }

    @CrossOrigin
    @PutMapping(value = "/{id}")
    public User putUser(@PathVariable int id, @RequestBody User user){
        return this.service.putUser(id, user);
    }

    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable int id){
        this.service.deleteUser(id);
    }

    @CrossOrigin
    @DeleteMapping
    public void clearAll(){
        this.service.clearAll();
    }

    @CrossOrigin
    @GetMapping
    public int getLatestId(){
        return this.service.getLatestId();
    }

}
