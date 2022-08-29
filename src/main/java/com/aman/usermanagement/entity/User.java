package com.aman.usermanagement.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class User {

    private int id;

    private String name;

    private String email;

    private String address;

    private String password;

    private boolean isActive;


}
