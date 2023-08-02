package com.handsmade.datn.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User{ 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String address;
    private String email;
    private String phone;
    private String username;
    private String password;    
}