package com.skill_connect.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data

@Entity


@Table(name="usr_tbl")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private	int id;
private String username;
private String password;

}
