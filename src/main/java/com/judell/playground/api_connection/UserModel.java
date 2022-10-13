package com.judell.playground.api_connection;

import lombok.Data;

@Data
public class UserModel {
    private Long userId;
    private String email;
    private String firstName;
    private String lastName;
    private String description;
}
