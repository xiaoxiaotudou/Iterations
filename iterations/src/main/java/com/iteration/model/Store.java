package com.iteration.model;


public class Store extends BaseModel {

    private long storeId;
    private long managerStaffId;
    private long addressId;

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public long getManagerStaffId() {
        return managerStaffId;
    }

    public void setManagerStaffId(long managerStaffId) {
        this.managerStaffId = managerStaffId;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }
}