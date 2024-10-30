package org.example.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class User {
    private String username;
    private String password;
    private boolean enabled;
    private List<UserRole> roles;
}
