package com.itau.TheCatApi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itau.TheCatApi.model.GlassesCatModel;
import com.itau.TheCatApi.repository.GlassesCatRepository;

@RestController
@RequestMapping("/glasses")
@CrossOrigin("*")

public class GlassesCatController {
	
	Logger logger = LoggerFactory.getLogger(BreedsController.class);
 
	@Autowired
	private GlassesCatRepository repository;
	
	@GetMapping
	public ResponseEntity<List<GlassesCatModel>> getAll(){
		logger.info("method accessed");
		return ResponseEntity.ok(repository.findAll());
				
	}
	
	@PostMapping
	public ResponseEntity<GlassesCatModel> post(@RequestBody GlassesCatModel glassescat){
		logger.info("method insert");
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(glassescat));
	}
	
	@PutMapping
	public ResponseEntity<GlassesCatModel> put(@RequestBody GlassesCatModel glassescat){
		logger.info("method update");
		return ResponseEntity.ok(repository.save(glassescat));
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		logger.info("method delete");
		repository.deleteById(id);
	}
}
