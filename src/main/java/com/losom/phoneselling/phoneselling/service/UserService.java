package com.losom.phoneselling.phoneselling.service;

import com.losom.phoneselling.phoneselling.entity.Role;
import com.losom.phoneselling.phoneselling.entity.User;
import com.losom.phoneselling.phoneselling.repository.RoleRepository;
import com.losom.phoneselling.phoneselling.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    public User registerNewUser(User user){
        return userRepository.save(user);
    }
    public void createNewRolesAndUer() {
        Role roleAdmin = new Role();
        roleAdmin.setRoleName("admin");
        roleAdmin.setRoleDescription("Admin role for an application");
        roleRepository.save(roleAdmin);

        Role roleUser = new Role();
        roleUser.setRoleName("Hoang");
        roleUser.setRoleDescription("Som is admin user for phoneselling application");
        roleRepository.save(roleUser);

        User adminUser = new User();
        adminUser.setUserName("admin");
        adminUser.setUserFirstName("Nguyen");
        adminUser.setUserLastName("Nam");
        adminUser.setUserPassword("nam@12345");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(roleAdmin);
        adminUser.setRole(adminRoles);
        userRepository.save(adminUser);

        User user = new User();
        user.setUserPassword("hoang@12345");
        user.setUserLastName("hoang");
        user.setUserFirstName("Luu");
        user.setUserName("User");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(roleUser);
        user.setRole(userRoles);
        userRepository.save(user);


    }
}
