package com.sneha.StudentSelfReflection.repository;

import com.sneha.StudentSelfReflection.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile,Long> {
}
