package com.IntegratedProject.SpringIntegrated.service;
import com.IntegratedProject.SpringIntegrated.model.User;
import java.util.Comparator;

public class SorterService implements Comparator<User> {

    @Override
    public int compare (User first, User next) {
        Integer firstInt = (first.getScore());
        Integer nextInt = (next.getScore());
        return firstInt.compareTo(nextInt);
    }
}