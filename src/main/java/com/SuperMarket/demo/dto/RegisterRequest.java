package com.SuperMarket.demo.dto;

public class RegisterRequest {
//    {
//        "username":"",
//        "email":"",
//        "password":""
//    }
    private String username;
    private String email;
    private String password;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getEmail(){
        return email;
    }
    public void serEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
}
