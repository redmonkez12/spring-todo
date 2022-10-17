package com.example.todo.auth.model;

import com.example.todo.users.model.UserResponse;

public record JwtResponse(String jwtToken, String refreshToken, UserResponse user) {

}