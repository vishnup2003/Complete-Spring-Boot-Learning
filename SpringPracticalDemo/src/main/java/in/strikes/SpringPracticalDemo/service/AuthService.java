package in.strikes.SpringPracticalDemo.service;

import in.strikes.SpringPracticalDemo.dto.UserRegisterRequestDto;
import in.strikes.SpringPracticalDemo.dto.UserRegisterResponseDto;
import in.strikes.SpringPracticalDemo.entity.Role;
import in.strikes.SpringPracticalDemo.entity.User;
import in.strikes.SpringPracticalDemo.repository.RoleRepository;
import in.strikes.SpringPracticalDemo.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserRegisterResponseDto register(UserRegisterRequestDto registerRequestDto) {
        User user = new User();
        user.setUsername(registerRequestDto.getUsername());

        String encodedPassword = passwordEncoder.encode(registerRequestDto.getPassword());
        user.setPassword(encodedPassword);
        user.setEnabled(true);

        Role role = roleRepository.findByName("ROLE_USER").get();

        user.getRoles().add(role);

        userRepository.save(user);

        UserRegisterResponseDto responseDto = new UserRegisterResponseDto();
        responseDto.setUsername(user.getUsername());
        responseDto.setMessage("User saved successfully!");

        return responseDto;
    }
}
