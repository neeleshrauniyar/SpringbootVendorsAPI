package com.example.vendorsAPI.service;

import com.example.vendorsAPI.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public List<CloudVendor> getCloudVendors();
    public CloudVendor getCloudVendor(String cloudVendorID);
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorID);
}
