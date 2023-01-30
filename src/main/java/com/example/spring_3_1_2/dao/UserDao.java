package com.example.spring_3_1_2.dao;

import com.example.spring_3_1_2.model.User;
import java.util.List;

public interface UserDao {

    List<User> getUserList();

    void addUser(User user);

    void updateUser(long id, User updateUser);

    void deleteUser(long id);

    User getUserById(long id);

}
