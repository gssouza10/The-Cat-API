package com.itau.TheCatApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itau.TheCatApi.model.GlassesCatModel;
import com.itau.TheCatApi.repository.GlassesCatRepository;

@RestController
@RequestMapping("/glasses")
@CrossOrigin("*")

public class GlassesCatController {
 
	@Autowired
	private GlassesCatRepository repository;
	
	@GetMapping
	public ResponseEntity<List<GlassesCatModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
				
	}
	
	public ResponseEntity<GlassesCatModel> post(@RequestBody GlassesCatModel glassescat){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(glassescat));
	}	
}
