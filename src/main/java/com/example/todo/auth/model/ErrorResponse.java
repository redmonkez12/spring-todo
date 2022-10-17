package com.example.todo.auth.model;

import com.example.todo.common.codes.ErrorCodes;

public record ErrorResponse(String message, ErrorCodes code, Integer status) {
}


