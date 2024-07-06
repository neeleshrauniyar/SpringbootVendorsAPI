package com.example.vendorsAPI.service.impl;

import com.example.vendorsAPI.model.CloudVendor;
import com.example.vendorsAPI.repository.CloudVendorRepository;
import com.example.vendorsAPI.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository){
        this.cloudVendorRepository= cloudVendorRepository;
    }

    @Override
    public List<CloudVendor> getCloudVendors() {
        return cloudVendorRepository.findAll();
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorID) {
        return cloudVendorRepository.findById(cloudVendorID).get();
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully Created a Vendor";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully Updated the Vendor";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorID) {
        cloudVendorRepository.deleteById(cloudVendorID);
        return "Successfully deleted the vendor";
    }
}
