package com.tran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tran.model.Transaction;
import com.tran.services.TransactionService;

@RestController
@CrossOrigin("*")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping(
    value = "/getAllTransactions", 
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE,
    method = RequestMethod.GET)
    public ResponseEntity<Object> getAllTransactions() {

        try {
            List<Transaction> allTransactions = transactionService.getAllTransactions();
            return new ResponseEntity<Object>(allTransactions, HttpStatus.OK);

        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Error e) {
            System.out.println(e);
            return new ResponseEntity<Object>(e, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
}
