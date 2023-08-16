package com.tran.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tran.model.Transaction;



@Repository
public interface TransactionRepository extends JpaRepository< Transaction, Long>  {
    
}
