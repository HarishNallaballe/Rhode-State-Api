package com.harish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harish.bindings.CitizenRequest;
import com.harish.bindings.CitizenResponse;
import com.harish.serviceimpl.RhodeService;

@RestController
public class RhodeStateController {
	
	@Autowired
	private RhodeService rhodeService;
	
    @GetMapping("/state/{ssn}")
	public ResponseEntity<String> getStateName(@PathVariable Long ssn) {
		 String stateName = rhodeService.checkSsn(ssn);
		return new ResponseEntity<String>(stateName,HttpStatus.OK);
	}
}
