package in.strikes.oauthDemo.controller;

import in.strikes.oauthDemo.entity.User;
import in.strikes.oauthDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(){
        return """
                Public Home
                
                Login using : localhost:8080/oauth2/authorization/google
                """;
    }

    @GetMapping("/profile")
    private Map<String,Object> profile(@AuthenticationPrincipal OidcUser oidcUser){
        User user = userService.findByProviderAndProviderSubject("google",oidcUser.getSubject()).orElseThrow();
        Map<String,Object> response=new HashMap<>();

        response.put(
                "internalUserId",
                user.getId()
        );

        response.put(
                "provider",
                user.getProvider()
        );

        response.put(
                "subject",
                oidcUser.getSubject()
        );

        response.put(
                "name",
                oidcUser.getClaimAsString("name")
        );

        response.put(
                "email",
                oidcUser.getClaimAsString("email")
        );

        return  response;
    }
}
