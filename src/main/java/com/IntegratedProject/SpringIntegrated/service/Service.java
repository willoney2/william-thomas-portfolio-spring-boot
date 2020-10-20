package com.IntegratedProject.SpringIntegrated.service;

import com.IntegratedProject.SpringIntegrated.database.DataBase;
import com.IntegratedProject.SpringIntegrated.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class Service {

    @Autowired
    DataBase dataBase;

    public List<User> getUsers(String division){
        List<User> allUsers = this.dataBase.findAll();
        List<User> divisionUsers = new ArrayList<>();
        for (int i = 0; i < allUsers.size(); i++){
            if (allUsers.get(i).getDivision().equals(division)){
                divisionUsers.add(allUsers.get(i));
            }
        }
        divisionUsers.sort(new SorterService());
        Collections.reverse(divisionUsers);
        return divisionUsers;
    }

    public User postUser(User user){
        return this.dataBase.save(user);
    }

    public User putUser(int id, User user){
        user.setId(id);
        return this.dataBase.save(user);
    }

    public void deleteUser(int id){
        this.dataBase.deleteById(id);
    }

    public void clearAll(){
        this.dataBase.deleteAll();
    }

    public int getLatestId(){
        List<User> users = this.dataBase.findAll();
        int number = 0;
        for(int i = 0; i < users.size(); i++){
            if (users.get(i).getId() > number){
                number = users.get(i).getId();
            }
        }
        return number;
    }

    public boolean checkId(int id){
        return this.dataBase.existsById(id);
    }
}
