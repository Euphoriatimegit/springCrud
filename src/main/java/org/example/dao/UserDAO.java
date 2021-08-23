package org.example.dao;

import org.example.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUser();

    User getUserById(Long id);

    void saveOrUpdate(User user);

    void delete(Long id);
}
