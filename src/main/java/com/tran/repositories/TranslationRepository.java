package com.tran.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tran.model.TranslateRequest;

@Repository
public interface TranslationRepository extends  JpaRepository<TranslateRequest, Long>  {
    
}
