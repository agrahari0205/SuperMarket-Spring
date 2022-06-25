package com.SuperMarket.demo.Controller;

import com.SuperMarket.demo.dto.AuthResponse;
import com.SuperMarket.demo.dto.LoginRequest;
import com.SuperMarket.demo.dto.RegisterRequest;
import com.SuperMarket.demo.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
@CrossOrigin(
        origins={"http://localhost:4200"},
        allowCredentials = "false",
        originPatterns = {"*"},
        allowedHeaders = {"*"},
        exposedHeaders = {"*"},
        maxAge = 60*30,
        methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT}
)
public class AuthController {

    @Autowired
    private AuthService authService;

    //  /api/auth/register
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterRequest registerRequest){
        authService.register(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    //  /api/auth/login
    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest loginRequest){
        return authService.login(loginRequest);
    }

}
