package com.harish.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.harish.bindings.CitizenRequest;

@Service
public class RhodeServiceImpl implements RhodeService{

	@Override
	public boolean checkSsn(CitizenRequest request) {
		Map<String,String> map=new HashMap<>();
		map.put("1","New Jersy");
		map.put("2","Texas");
		map.put("3","Ohia");
		map.put("4","Rhode");
		map.put("5", "California");
		map.put("6", "florida");
		map.put("7", "Alaska");
		map.put("8", "Virginia");
		map.put("9", "Arizona");
		String ssn = request.getSsn().toString();
		if(ssn.startsWith("4") ) {
			return true;
		}
		return false;
	}

}
