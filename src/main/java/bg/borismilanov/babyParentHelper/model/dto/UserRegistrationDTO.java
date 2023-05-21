package bg.borismilanov.babyParentHelper.model.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRegistrationDTO {

    @NotBlank
    @Size(min = 5, max = 15)
    private String userName;

    @NotBlank
    @Size(min = 10, max = 20)
    private String password;

    @NotBlank
    @Size(min = 10, max = 20)
    private String confirmPassword;

    @Size(min = 5, max = 15)
    private String fullName;

    @Email
    @NotBlank
    private String email;

    public UserRegistrationDTO(){}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
