package com.itau.TheCatApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itau.TheCatApi.model.BreedsModel;
import com.itau.TheCatApi.repository.BreedsRepository;

@RestController
@RequestMapping("/breeds")
@CrossOrigin("*")

public class BreedsController {
	@Autowired
	private BreedsRepository repository;
	
	@GetMapping
	public ResponseEntity<List<BreedsModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<BreedsModel> getById(@PathVariable long id){
		return repository.findById(id)
				.map(response -> ResponseEntity.ok(response))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<List<BreedsModel>> getAllByNome(@PathVariable String name){
		return ResponseEntity.ok(repository.findAllByNameContainingIgnoreCase(name));
	}
	
	@GetMapping("/origin/{origin}")
	public ResponseEntity<List<BreedsModel>> getAllByOrigem(@PathVariable String origin){
		return ResponseEntity.ok(repository.findAllByOriginContainingIgnoreCase(origin));
	}
	
	@GetMapping("/temperament/{temperament}")
	public ResponseEntity<List<BreedsModel>> getAllBytemperament(@PathVariable String temperament){
		return ResponseEntity.ok(repository.findAllByTemperamentContainingIgnoreCase(temperament));
	}
	
	@PostMapping
	public ResponseEntity<BreedsModel> post(@RequestBody BreedsModel breeds){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(breeds));
	}
}
