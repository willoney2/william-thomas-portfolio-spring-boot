package com.IntegratedProject.SpringIntegrated.database;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.IntegratedProject.SpringIntegrated.model.User;

import java.util.List;

@Repository
public interface DataBase extends CrudRepository<User, Integer> {

    @Override
    List<User> findAll();

}
