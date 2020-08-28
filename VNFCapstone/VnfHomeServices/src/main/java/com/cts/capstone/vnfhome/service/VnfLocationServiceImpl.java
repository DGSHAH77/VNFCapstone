package com.cts.capstone.vnfhome.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.capstone.vnfhome.entity.VnfLocations;
import com.cts.capstone.vnfhome.repository.VnfLocationRepository;

@Component
public class VnfLocationServiceImpl implements VnfLocationService{
	
	@Autowired
	VnfLocationRepository vnfLocationRepository;
	
	@Override
	public Set<String> getLocationList() {
		Set<String> listLocation = vnfLocationRepository.findAll().stream().map(s->s.getLocationName()).collect(Collectors.toSet());
		return listLocation;
	}

}
