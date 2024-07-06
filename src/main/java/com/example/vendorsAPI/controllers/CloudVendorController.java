package com.example.vendorsAPI.controllers;

import com.example.vendorsAPI.model.CloudVendor;
import com.example.vendorsAPI.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService){
        this.cloudVendorService= cloudVendorService;
    }

    @GetMapping()
    public List<CloudVendor> getCloudVendors() {
        return cloudVendorService.getCloudVendors();
    }
    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendors(String vendorID) {
        return cloudVendorService.getCloudVendor(vendorID);
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        return cloudVendorService.createCloudVendor(cloudVendor);
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudvendor) {
        cloudVendorService.updateCloudVendor(cloudvendor);
        return "Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendor(@PathVariable("vendorID") String vendorID) {
        cloudVendorService.deleteCloudVendor(vendorID);
        return "Vendor Deleted Successfully";
    }

}
