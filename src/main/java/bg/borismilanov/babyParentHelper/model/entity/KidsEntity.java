package bg.borismilanov.babyParentHelper.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "kids")
public class KidsEntity extends BaseEntity{

    @NotBlank
    private String fullName;

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @NotBlank
    private LocalDate birthdate;

    private String fatherName;

    private String motherName;

    @ManyToOne
    private UserEntity user;

    @ManyToMany
    private Set<SleepEntity> sleepingTimes;

    @ManyToMany
    private Set<FeedEntity> feedingTimes;

    @ManyToMany
    private Set<MedicalEntity> medicalProfile;

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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Set<SleepEntity> getSleepingTimes() {
        return sleepingTimes;
    }

    public void setSleepingTimes(Set<SleepEntity> sleepingTimes) {
        this.sleepingTimes = sleepingTimes;
    }

    public Set<FeedEntity> getFeedingTimes() {
        return feedingTimes;
    }

    public void setFeedingTimes(Set<FeedEntity> feedingTimes) {
        this.feedingTimes = feedingTimes;
    }

    public Set<MedicalEntity> getMedicalProfile() {
        return medicalProfile;
    }

    public void setMedicalProfile(Set<MedicalEntity> medicalProfile) {
        this.medicalProfile = medicalProfile;
    }
}
