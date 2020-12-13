package com.itau.TheCatApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itau.TheCatApi.model.HatCatModel;
import com.itau.TheCatApi.repository.HatCatRepository;


@RestController
@RequestMapping("/hat")
@CrossOrigin("*")


public class HatCatController {
	
	@Autowired
	private HatCatRepository repository;
	
	@GetMapping
	public ResponseEntity<List<HatCatModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<HatCatModel> post(@RequestBody HatCatModel hatcat){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(hatcat));
	}
}
