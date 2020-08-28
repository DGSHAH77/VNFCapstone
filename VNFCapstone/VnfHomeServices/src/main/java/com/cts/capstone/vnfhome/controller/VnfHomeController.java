package com.cts.capstone.vnfhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.capstone.vnfhome.service.VnfLocationService;

@RestController
@RequestMapping("/vnf/home")
public class VnfHomeController {
	
	@Autowired
	VnfLocationService vnfLocationService;
	
	@GetMapping("/locations")
	public ResponseEntity<Object> GetAllLocation(){
		return new ResponseEntity<Object>(vnfLocationService.getLocationList(),HttpStatus.OK);
	}

}
