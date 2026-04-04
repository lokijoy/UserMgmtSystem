package com.system.mgmt.user.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Model:User.
 */
@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String email;
}