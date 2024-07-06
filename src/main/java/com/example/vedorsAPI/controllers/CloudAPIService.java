package com.example.vedorsAPI.controllers;

import com.example.vedorsAPI.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
    CloudVendor cloudvendor;

    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendors(String vendorID) {
        // return new CloudVendor("c1", "vendor1", "address 1", 123);
        return cloudvendor;
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudvendor = cloudVendor;
        return "CloudVendor created successfully";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudvendor) {
        this.cloudvendor = cloudvendor;
        return "Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendor(CloudVendor cloudvendor) {
        this.cloudvendor = null;
        return "Vendor Deleted Successfully";
    }

}
