package com.SuperMarket.demo.Service;

import com.SuperMarket.demo.dto.LoginRequest;
import com.SuperMarket.demo.dto.AuthResponse;
import com.SuperMarket.demo.dto.RegisterRequest;
import com.SuperMarket.demo.Model.UserModel;
import com.SuperMarket.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public void register(RegisterRequest registerRequest) {
        UserModel user = new UserModel();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        userRepository.save(user);

    }
    public AuthResponse login(LoginRequest loginRequest){
        boolean isSuccess =  userRepository.findAll().stream()
                .anyMatch(user-> user.getUsername().equals(loginRequest.getUsername())
        && user.getPassword().equals(loginRequest.getPassword()));
        return new AuthResponse(isSuccess, loginRequest.getUsername());
    }
}
