package com.example.user.controller;

import com.example.user.dto.LoginRequestDto;
import com.example.user.dto.TokenResponseDto;
import com.example.user.security.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final JwtTokenUtil jwtTokenUtil;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequestDto loginRequest) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getUsername(),
                            loginRequest.getPassword()
                    )
            );

            String token = jwtTokenUtil.generateToken(authentication.getName());
            return ResponseEntity.ok().body(new TokenResponseDto(token));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid username or password");
        }
    }
}