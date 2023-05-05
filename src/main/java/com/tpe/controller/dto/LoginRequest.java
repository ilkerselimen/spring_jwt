package com.tpe.controller.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class LoginRequest {

    @NotBlank
    @NotNull
    @Size(min=1, max=20, message="username '${validatedValue}' must be between {min} and {max} chars long")
    private String userName;

    @NotBlank
    @NotNull
    @Size(min=5, max=20, message="password '${validatedValue}' must be between {min} and {max} chars long")
    private String password;

}
