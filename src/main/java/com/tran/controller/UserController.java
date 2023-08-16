package com.tran.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tran.model.User;
import com.tran.services.UserService;


@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userServices;
    

    @RequestMapping(
        value = "/customer/signIn",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> signIn(@RequestBody User user) {

        try {
            User saveduser = userServices.signIn(user);

            return new ResponseEntity<Object>(saveduser, HttpStatus.CREATED);
        } catch(DataIntegrityViolationException e) {
            System.out.println("Duplicate email");
            return new ResponseEntity<Object>("Duplicate Email", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<Object>(e, HttpStatus.BAD_REQUEST);
        } catch (Error e) {
            System.out.println(e);
            return new ResponseEntity<Object>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(
        value = "/customer/signUp",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.POST
    )
    public ResponseEntity<Object> signUpUser(@RequestBody User user) {

        try {
           
            User savedCustomer = userServices.signUp(user);

            return new ResponseEntity<Object>(savedCustomer, HttpStatus.CREATED);
        } catch(DataIntegrityViolationException e) {
            System.out.println("Duplicate email");
            return new ResponseEntity<Object>("Duplicate Email", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<Object>(e, HttpStatus.BAD_REQUEST);
        } catch (Error e) {
            System.out.println(e);
            return new ResponseEntity<Object>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    
    }
 @RequestMapping(
        value = "/findUserById/{id}",
        produces = MediaType.APPLICATION_JSON_VALUE,
        method = RequestMethod.GET
    )
    public ResponseEntity<Object> findUserById(@PathVariable Long id) {
        try {
            User foundUser = userServices.findById(id);
            return new ResponseEntity<Object>(foundUser, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Error e) {
            System.out.println(e);
            return new ResponseEntity<Object>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}



