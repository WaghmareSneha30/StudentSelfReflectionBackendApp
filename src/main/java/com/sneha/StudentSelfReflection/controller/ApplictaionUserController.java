package com.sneha.StudentSelfReflection.controller;

import com.sneha.StudentSelfReflection.model.ApplicationUser;
import com.sneha.StudentSelfReflection.services.ApplicationUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user/")
public class ApplictaionUserController {


    @Autowired
    ApplicationUserServices applicationUserServices;

    // http://localhost:8080/api/v1/user/create
    @PostMapping("create")
    public ResponseEntity<ApplicationUser> createUser(@RequestBody ApplicationUser applicationUser)
    {
        ApplicationUser savedUser = applicationUserServices.createUser(applicationUser);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/v1/user/all
    @GetMapping("all")
    public ResponseEntity<List<ApplicationUser>> fetchAllUser()
    {
        List<ApplicationUser> applicationUsers = applicationUserServices.getAllUser();
        return new ResponseEntity<>(applicationUsers,HttpStatus.OK);
    }

}
