package com.mtuci.mutalibov.models;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email, password;
}
