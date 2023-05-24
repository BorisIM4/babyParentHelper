package bg.borismilanov.babyParentHelper.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "medical_data")
public class MedicalEntity extends BaseEntity{

    @Column(nullable = false)
    private LocalDateTime examinationDate;

    //orthopedist, pediatrician
    @Column(nullable = false)
    private String medicalSpecialist;

    @Column(columnDefinition = "TEXT")
    private String description;

    //Can be picture of any given medical document
    private String pictureUrl;

    @ManyToOne
    private KidsEntity medicalDataKidId;

    public MedicalEntity() {
    }

    public LocalDateTime getExaminationDate() {
        return examinationDate;
    }

    public void setExaminationDate(LocalDateTime examinationDate) {
        this.examinationDate = examinationDate;
    }

    public String getMedicalSpecialist() {
        return medicalSpecialist;
    }

    public void setMedicalSpecialist(String medicalSpecialist) {
        this.medicalSpecialist = medicalSpecialist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
