package br.com.skeleton.controller.impl;

import br.com.skeleton.controller.entities.response.PersonResponse;
import br.com.skeleton.repositories.entities.PersonEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.skeleton.controller.PersonController;

@RestController
@RequestMapping(path = "/person")
public class PersonControllerImpl implements PersonController {
	
	@GetMapping
	@Override
	public ResponseEntity<PersonResponse> save(@RequestBody PersonEntity person) {
		return ResponseEntity.ok(PersonResponse.builder().build());
	}

	@Override
	public ResponseEntity<PersonResponse> findById(Long id) {
		return null;
	}

	@Override
	public ResponseEntity findByAge(Long age) {
		return null;
	}

}
