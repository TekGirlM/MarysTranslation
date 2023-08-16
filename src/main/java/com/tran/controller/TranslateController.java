package com.tran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tran.model.TranslateRequest;
import com.tran.services.TranslateService;

@RestController

@RequestMapping("/api/translate")
@CrossOrigin("*")
public class TranslateController {

    @Autowired
    private TranslateService translateService;
    

    @PostMapping
    public String translate(@RequestBody TranslateRequest request) throws Exception {
        return translateService.translateText(request.getSourceLang(), request.getTargetLang(), request.getText());
    }
}
