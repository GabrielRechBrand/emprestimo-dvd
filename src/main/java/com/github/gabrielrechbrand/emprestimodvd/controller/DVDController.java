package com.github.gabrielrechbrand.emprestimodvd.controller;

import com.github.gabrielrechbrand.emprestimodvd.model.DVD;
import com.github.gabrielrechbrand.emprestimodvd.repository.DVDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dvd")
public class DVDController {

    @Autowired
    private DVDRepository dvdRepository;

    @PostMapping
    public ResponseEntity<?> createDVD(@RequestBody DVD dvd) {
        return ResponseEntity.ok(dvdRepository.save(dvd));
    }

}
