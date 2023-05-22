package bg.borismilanov.babyParentHelper.model.dto;

import bg.borismilanov.babyParentHelper.model.entity.UserEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class KidsRegistrationDTO {

    @NotBlank
    private String fullName;

    @NotBlank
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate birthdate;

    private String fatherName;

    private String motherName;

    @NotBlank
    private UserEntity profileOwner;

    public KidsRegistrationDTO() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public UserEntity getProfileOwner() {
        return profileOwner;
    }

    public void setProfileOwner(UserEntity profileOwner) {
        this.profileOwner = profileOwner;
    }
}
