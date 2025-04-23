package com.sneha.StudentSelfReflection.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationUserId;

    @NotBlank
    @Size(min = 3, max = 15)
    private String username;

    @Email(message = "Invalid Email")
    private String email;

    @Size(min = 8, max = 16)
    private String pwd;

    @OneToOne(fetch = FetchType.EAGER,optional = true)
    @JoinColumn(name = "profile_id", referencedColumnName = "profileId")
    private Profile profile;

    @OneToOne(fetch = FetchType.EAGER,optional = true)
    @JoinColumn(name = "personal_info_id", referencedColumnName = "personalInfoId")
    private PersonalInfo personalInfo;


}
