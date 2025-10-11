package com.tribal.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Table(name = "basetable")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
public class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(nullable = false)
    protected String name;

    @Column(nullable = false, unique = true)
    protected String email;

    @Column(nullable = false)
    protected String password;

    @Column(nullable = false)
    protected String confirmPassword;

    @Column(length = 15)
    protected String phone;

    @Column(length = 255)
    protected String address;

    @Column(length = 15)
    protected String pincode;

    @Column(name = "created_at", updatable = false)
    protected LocalDateTime createdAt = LocalDateTime.now();
}
