package com.losom.phoneselling.phoneselling.service;

import com.losom.phoneselling.phoneselling.entity.Role;
import com.losom.phoneselling.phoneselling.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }
}
