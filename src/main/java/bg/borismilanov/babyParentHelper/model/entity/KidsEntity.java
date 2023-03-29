package bg.borismilanov.babyParentHelper.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class KidsEntity extends BaseEntity{

    @NotBlank
    private String fullName;

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @NotBlank
    private LocalDate birthdate;

    private String fatherName;

    private String motherName;

    public KidsEntity() {
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
}
