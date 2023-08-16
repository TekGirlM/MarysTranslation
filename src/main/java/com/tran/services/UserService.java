package com.tran.services;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tran.model.User;
import com.tran.repositories.UserRepository;

    @Service
public class UserService {
 @Autowired
 UserRepository userRepository;
 
 

 public User save(User user) throws Exception {

        return userRepository.save(user);
    }

    public User signIn(User user) throws Exception {
        User foundUser = userRepository.findByEmail(user.getEmail());

        if (foundUser == null) {
            throw new Exception("User not found");
        }

        if (!foundUser.getPassword().equals(user.getPassword())) {
            throw new Exception("Invalid credentials");
        }

        return foundUser;
    

}
public User findById(Long id) throws Exception {
    Optional<User> user = userRepository.findById(id);

    if (user.isPresent()) {
        return user.get();
    } else {
        throw new Exception("User not found");
    }
}


public User signUp(User user) throws Exception {
return  userRepository.save(user);
}

}

