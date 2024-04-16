package com.harish.serviceimpl;

import org.springframework.stereotype.Service;

@Service
public class RhodeServiceImpl implements RhodeService{

	@Override
	public String checkSsn(Long ssnValue) {
		
		
		String ssn = String.valueOf(ssnValue);
		if(ssn.startsWith("1")) {
			return "New Jersy";
		}else if(ssn.startsWith("2")) {
			return "Texas";
		}else if(ssn.startsWith("3")) {
			return "Ohio"; 
		}else if(ssn.startsWith("4")) {
			return "Rhode Island"; 
		}else if(ssn.startsWith("5")) {
			return "Kentucky";  
		}else if(ssn.startsWith("6")) {
			return "Albama"; 
		}else {
			return "Invalid SSN";
		}
	}

}
