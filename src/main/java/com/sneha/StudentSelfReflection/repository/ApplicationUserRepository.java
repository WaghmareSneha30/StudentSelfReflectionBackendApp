package com.sneha.StudentSelfReflection.repository;

import com.sneha.StudentSelfReflection.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser,Long> {
}
