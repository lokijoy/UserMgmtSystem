package com.system.mgmt.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Model:User.
 */
@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
}
