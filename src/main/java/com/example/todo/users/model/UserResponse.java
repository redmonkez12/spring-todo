package com.example.todo.users.model;

import com.example.todo.roles.entities.RoleEntity;

import java.util.Set;
import java.util.UUID;

public record UserResponse(String email, String firstname, String lastName, UUID id, Set<RoleEntity> roles) {
}

