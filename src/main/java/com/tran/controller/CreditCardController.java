package com.tran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tran.model.CreditCard;

import com.tran.services.CreditCardService;


@RestController
@CrossOrigin("*")
public class CreditCardController {
@Autowired 
CreditCardService creditCardService;

  @RequestMapping(
      value = "/create",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE,
      method = RequestMethod.POST
    )
public ResponseEntity<Object> create(@RequestBody CreditCard creditCard) {

        try {
            CreditCard savedCreditCard = creditCardService.save(creditCard);
            return new ResponseEntity<Object>(savedCreditCard, HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<Object>(e, HttpStatus.BAD_REQUEST);
        } catch (Error e) {
            System.out.println(e);
            return new ResponseEntity<Object>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}