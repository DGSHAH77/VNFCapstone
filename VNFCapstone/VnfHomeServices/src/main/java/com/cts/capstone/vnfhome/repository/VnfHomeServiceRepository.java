package com.cts.capstone.vnfhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.capstone.vnfhome.entity.CapstoneUser;

public interface VnfHomeServiceRepository extends JpaRepository<CapstoneUser, String> {

}
