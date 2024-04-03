package com.github.gabrielrechbrand.emprestimodvd.controller;

import com.github.gabrielrechbrand.emprestimodvd.model.DVD;
import com.github.gabrielrechbrand.emprestimodvd.repository.DVDRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/dvd")
public class DVDController {

    private static final Logger logger = LoggerFactory.getLogger(DVDController.class);

    @Autowired
    private DVDRepository dvdRepository;

    @PostMapping
    public ResponseEntity<DVD> createDVD(@RequestBody DVD dvd) {
        logger.info("Creating DVD: {}", dvd);
        DVD savedDVD = dvdRepository.save(dvd);
        logger.info("DVD created successfully: {}", savedDVD);
        return new ResponseEntity<>(savedDVD, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DVD> getDVDById(@PathVariable UUID id) {
        logger.info("Retrieving DVD with ID: {}", id);
        DVD dvd = dvdRepository.findById(id).orElse(null);
        if (dvd == null) {
            logger.info("DVD not found with ID: {}", id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        logger.info("DVD retrieved successfully: {}", dvd);
        return ResponseEntity.ok(dvd);
    }

    @GetMapping
    public ResponseEntity<Iterable<DVD>> getAllDVDs() {
        logger.info("Retrieving all DVDs");
        Iterable<DVD> dvds = dvdRepository.findAll();
        logger.info("DVDs retrieved successfully: {}", dvds);
        return ResponseEntity.ok(dvds);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DVD> updateDVD(@PathVariable UUID id, @RequestBody DVD dvd) {
        logger.info("Updating DVD with ID: {}", id);
        if (!dvdRepository.existsById(id)) {
            logger.info("DVD not found with ID: {}", id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        dvd.setId(id); // Ensure ID is set for update
        DVD updatedDVD = dvdRepository.save(dvd);
        logger.info("DVD updated successfully: {}", updatedDVD);
        return ResponseEntity.ok(updatedDVD);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDVD(@PathVariable UUID id) {
        logger.info("Deleting DVD with ID: {}", id);
        if (!dvdRepository.existsById(id)) {
            logger.info("DVD not found with ID: {}", id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        dvdRepository.deleteById(id);
        logger.info("DVD deleted successfully with ID: {}", id);
        return ResponseEntity.ok().build();
    }
}
