package com.cts.capstone.vnfhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.capstone.vnfhome.entity.VnfLocations;

public interface VnfLocationRepository extends JpaRepository<VnfLocations, String> {

}
