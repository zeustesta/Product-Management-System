package com.zt.product.system.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private String productDescrip;
    private int productStock;
    @OneToOne
    private Brand brand;
    @OneToOne
    private Category category;
    private float productPrice;
    @OneToMany
    private List<Supplier> suppliers;
    private boolean active; 

    public Product() {
    }
    
    public Product(String name, String descrip, int stock, Brand brand, float price, ArrayList<Supplier> suppliers, Category category) {
        this.productName = name;
        this.productDescrip = descrip;
        this.productStock = stock;
        this.brand = brand;
        this.productPrice = price;
        this.suppliers = suppliers;
        this.category = category;
        this.active = true;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescrip() {
        return productDescrip;
    }

    public void setProductDescrip(String productDescrip) {
        this.productDescrip = productDescrip;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand productBrand) {
        this.brand = productBrand;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
