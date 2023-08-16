package com.tran.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tran.model.CreditCard;
import com.tran.repositories.CreditCardRepository;

@Service
public class CreditCardService {
    
@Autowired 
CreditCardRepository creditCardRepository;

public CreditCard save(CreditCard creditCard){
    // System.out.println("expdate: "+ creditCard.getExpDate);
    return  creditCardRepository.save(creditCard);
}
}