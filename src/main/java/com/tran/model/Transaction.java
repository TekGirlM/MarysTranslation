package com.tran.model;

import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="transaction")
public class Transaction {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

@Column(name="price")
private int  price;

@Column(name="freeaccount")
private String freeaccount;

@Column(name="premiumaccount")
private String premiumaccount;

@Column(name="CreditCardNumber")
private String creditardumber;

@Column(name="CVC")
private String cvc;

@Column(name="Email")
private String email;

public String getCreditardumber() {
    return creditardumber;
}

public void setCreditardumber(String creditardumber) {
    this.creditardumber = creditardumber;
}

public String getCvc() {
    return cvc;
}

public void setCvc(String cvc) {
    this.cvc = cvc;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public int getPrice() {
    return price;
}

public void setPrice(int price) {
    this.price = price;
}

public String getFreeaccount() {
    return freeaccount;
}

public void setFreeaccount(String freeaccount) {
    this.freeaccount = freeaccount;
}

public String getPremiumaccount() {
    return premiumaccount;
}

public void setPremiumaccount(String premiumaccount) {
    this.premiumaccount = premiumaccount;
}

}