package com.example.vendorsAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_details")
public class CloudVendor {

    @Id
    private String vendorID;
    private String vendorName;
    private String vendorAddress;
    private int vendorPhoneNumber;

    public CloudVendor() {
    }

    public CloudVendor(String vendorID, String vendorName, String vendorAddress, int vendorPhoneNumber) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorID() {
        return vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public int getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public void setVendorPhoneNumber(int vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}



