package bg.borismilanov.babyParentHelper.service;

import bg.borismilanov.babyParentHelper.model.dto.UserRegistrationDTO;
import bg.borismilanov.babyParentHelper.model.entity.UserEntity;
import bg.borismilanov.babyParentHelper.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean register(UserRegistrationDTO userRegistrationDTO){

        if (!userRegistrationDTO.getPassword().equals(userRegistrationDTO.getConfirmPassword())) {
            return false;
        }

        Optional<UserEntity> byEmail = this.userRepository.findByEmail(userRegistrationDTO.getEmail());
        if (byEmail.isPresent()){
            return false;
        }

        

        return true;
    }
}
