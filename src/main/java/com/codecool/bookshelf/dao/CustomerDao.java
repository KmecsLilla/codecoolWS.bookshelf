package com.codecool.bookshelf.dao;

import com.codecool.bookshelf.model.user.Costumer;

public interface CustomerDao {
    public void addCustomer(Costumer costumer);
    public Costumer findById(long id);
    public Costumer findCustomerByNameAndEmail(String name, String email);
    public Costumer findByEmail(String email);
}
