package com.harish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
    @PostMapping("/save")
	public boolean getState(@RequestBody CitizenRequest citizenRequest) {
		return rhodeService.checkSsn(citizenRequest);
	}
}
