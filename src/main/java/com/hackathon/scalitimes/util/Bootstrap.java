package com.hackathon.scalitimes.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hackathon.scalitimes.domains.models.Role;
import com.hackathon.scalitimes.domains.repositories.ProfileRulesRepository;
import com.hackathon.scalitimes.service.RoleService;
import com.hackathon.scalitimes.service.UserService;

/**
 * Created by Pedro on 10/06/2017.
 */
@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Autowired
    ProfileRulesRepository profileRulesRepository;

    @Override
    public void run(String... strings) throws Exception {

        Role role = Role.builder()
                .name("TEST")
                .build();
//
//        roleService.createRole(role);
//
//        User user = User.builder()
//                .email("somemail@gmail.com")
//                .login("user")
//                .password("user")
//                .name("Arnaldo")
//                .role(role)
//                .build();
//
//        userService.createUser(user);
    }
}
