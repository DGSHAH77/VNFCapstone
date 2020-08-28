package com.cts.capstone.vnfhome.service;

import org.springframework.stereotype.Service;

import com.cts.capstone.vnfhome.entity.CapstoneUser;

@Service
public interface VnfHomeService {
	
	CapstoneUser findUserByIdAndLocation();

}
