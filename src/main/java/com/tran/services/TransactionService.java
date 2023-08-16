package com.tran.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tran.model.Transaction;
import com.tran.repositories.TransactionRepository;

@Service
public class TransactionService {
   
    @Autowired
    private TransactionRepository transactionRepository;

    
    public List<Transaction>getAllTransactions(){
        return transactionRepository.findAll();
    
}
}