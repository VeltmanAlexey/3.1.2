package com.Spring.Boot.SpringBoot.service;

import com.Spring.Boot.SpringBoot.model.Role;
import com.Spring.Boot.SpringBoot.model.User;
import com.Spring.Boot.SpringBoot.repository.UserRepository;

import java.util.List;
import java.util.Set;

public interface UserServiceImp {

     public Set<Role> findRolesByName(String roleName);

     void updateUser(User user, int id);

     List<Role> listRoles();

     User getUserById(int id);

     List<User> getAllUsers();

     void saveUser(User user);

     void deleteUserById(int id);

     User findByUsername(String username);


}
