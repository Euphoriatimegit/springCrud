package org.example.service;

import org.example.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUserById(Long id);

    void saveOrUpdate(User user);

    void delete(Long id);
}
