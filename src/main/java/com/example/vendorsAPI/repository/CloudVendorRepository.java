package com.example.vendorsAPI.repository;

import com.example.vendorsAPI.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository <CloudVendor, String>{
}
