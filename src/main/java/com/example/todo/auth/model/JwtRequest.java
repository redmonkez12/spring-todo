package com.example.todo.auth.model;

import javax.validation.constraints.NotEmpty;

public record JwtRequest(
        @NotEmpty(message = "Email is required") String email,
        @NotEmpty(message = "Password is required") String password) {
}

