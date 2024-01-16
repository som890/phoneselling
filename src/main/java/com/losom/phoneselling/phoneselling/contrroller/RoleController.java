package com.losom.phoneselling.phoneselling.contrroller;

import com.losom.phoneselling.phoneselling.entity.Role;
import com.losom.phoneselling.phoneselling.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    private RoleService  roleService;
    @PostMapping({"/addNewRole"})
    private Role addNewRole(@RequestBody Role role) {
        return roleService.addNewRole(role);
    }
}
