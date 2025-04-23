package com.sneha.StudentSelfReflection.services;

import com.sneha.StudentSelfReflection.model.ApplicationUser;
import com.sneha.StudentSelfReflection.repository.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationUserServices {

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    public ApplicationUser createUser(ApplicationUser applicationUser) {

        ApplicationUser savedUser = applicationUserRepository.save(applicationUser);
        return savedUser;
    }

    public List<ApplicationUser> getAllUser()
    {
        List<ApplicationUser> fetchedUserFromDb = applicationUserRepository.findAll();
        return fetchedUserFromDb;
    }
}
