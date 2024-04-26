package com.daniel.modulo03.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.modulo03.modules.candidate.CandidateEntity;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
    
    @PostMapping("/")
    public CandidateEntity create(@RequestBody @Valid CandidateEntity candidateEntity) {
    return candidateEntity;
    }
}