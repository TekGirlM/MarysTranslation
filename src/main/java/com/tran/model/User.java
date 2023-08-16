package com.tran.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
    
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column(name="name")
private String name;

@Column(name="email")
private String email;

@Column(name="password")
private String password;

@Column(name="telephone")
private String telephone;

@Column(name="subscribed")
private boolean  subscribed;

public boolean isSubscribed() {
    return subscribed;
}

public void setSubscribed(boolean subscribed) {
    this.subscribed = subscribed;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getTelephone() {
    return telephone;
}

public void setTelephone(String telephone) {
    this.telephone = telephone;
}

public String setEmail() {
    return null;
}

}
