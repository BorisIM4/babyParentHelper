package bg.borismilanov.babyParentHelper.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @Size(min = 5, max = 15)
    private String fullName;

    @NotBlank
    @Size(min = 5, max = 15)
    private String userName;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 10, max = 20)
    private String password;

    @NotBlank
    @Size(min = 10, max = 20)
    private String confirmPassword;

    @OneToMany(mappedBy="user")
    private Set<KidsEntity> kidsEntities;

    public UserEntity() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Set<KidsEntity> getKidsEntities() {
        return kidsEntities;
    }

    public void setKidsEntities(Set<KidsEntity> kidsEntities) {
        this.kidsEntities = kidsEntities;
    }
}
