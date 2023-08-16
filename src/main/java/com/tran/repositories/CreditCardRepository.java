package com.tran.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tran.model.CreditCard;

@Repository         // Between the <,> first put the type of object, next the type of the primary key
public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {
    
}
