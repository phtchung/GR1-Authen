package com.example.gr1.controller;


import com.example.gr1.request.LoginRequest;
import com.example.gr1.request.RegisterRequest;
import com.example.gr1.response.AuthenticationResponse;
import com.example.gr1.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class AuthenticationController {



    private final AuthenticationService authenticationService;


    @PostMapping(path = "/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){

        return ResponseEntity.ok(authenticationService.register(request));

    }


    @PostMapping(path = "/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody LoginRequest request){

        return ResponseEntity.ok(authenticationService.login(request));
    }




}
