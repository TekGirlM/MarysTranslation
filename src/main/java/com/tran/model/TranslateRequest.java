package com.tran.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="translaterequest")
public class TranslateRequest {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    
    @Column(name="sourcelang")
    private String sourceLang;

    @Column(name="targetlang")
    private String targetLang;

    @Column(name="text")
    private String text;

    public String getSourceLang() {
        return sourceLang;
    }

    public void setSourceLang(String sourceLang) {
        this.sourceLang = sourceLang;
    }

    public String getTargetLang() {
        return targetLang;
    }

    public void setTargetLang(String targetLang) {
        this.targetLang = targetLang;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    
    
}
