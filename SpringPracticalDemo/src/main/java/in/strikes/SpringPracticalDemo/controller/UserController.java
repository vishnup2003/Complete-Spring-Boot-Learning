package in.strikes.SpringPracticalDemo.controller;

import in.strikes.SpringPracticalDemo.service.AuthService;
import in.strikes.SpringPracticalDemo.dto.UserRegisterRequestDto;
import in.strikes.SpringPracticalDemo.dto.UserRegisterResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private AuthService authService;

    public UserController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/hello")
    public String sayHello(Authentication authentication) {
        return "Hello"+ authentication.getName();
    }

    @PostMapping("/register")
    public ResponseEntity<UserRegisterResponseDto> registerUser(@RequestBody UserRegisterRequestDto registerRequestDto) {
       UserRegisterResponseDto userRegisterResponseDto= authService.register(registerRequestDto);

       return ResponseEntity.ok(userRegisterResponseDto);
    }


}
