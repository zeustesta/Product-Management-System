package com.zt.product.system.controller;

import com.zt.product.system.model.Brand;
import com.zt.product.system.model.Category;
import com.zt.product.system.model.Product;
import com.zt.product.system.model.Supplier;
import com.zt.product.system.persistence.PersistenceController;
import java.util.ArrayList;
import java.util.List;

public class MainController {
    
    private PersistenceController persController = new PersistenceController();
    
    /******  PRODUCT  *****/

    public void addProduct(String name, String model, int stock, float price, ArrayList<Supplier> suppliers, Brand brand, String descrip, Category category) {
        Product newProduct = new Product(name, model, descrip, stock, brand, price, suppliers, category);
        
        try {
            persController.addProduct(newProduct);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public Product getProduct(int productId) {
        return persController.getProduct(productId);
    }
    
    public List<Product> getProducts() {
        return persController.getProducts();
    }
    
    public void modifyProduct(Product product, String name, String model, int stock, float price, ArrayList<Supplier> suppliers, Brand brand, String descrip, Category category) {
        try {
            product.setProductName(name);
            product.setProductModel(model);
            product.setProductStock(stock);
            product.setProductPrice(price);
            product.setProductDescrip(descrip);
            product.setBrand(brand);
            product.setSuppliers(suppliers);
            product.setCategory(category);
            
            persController.modifyProduct(product);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void deleteProduct(int productId) {
        try {
            persController.deleteProduct(productId);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /***** SUPPLIER *****/
    
    public void addSupplier(String name, String phone) {
        Supplier newSupplier = new Supplier(name, phone);
        
        try {
            persController.addSupplier(newSupplier);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }  
    
    public Supplier getSupplier(int supplierId) {
        return persController.getSupplier(supplierId);
    }
    
    public Supplier getSupplierByName(String supplierName) {
        return persController.getSupplierByName(supplierName);
    }
    
    public List<Supplier> getSuppliers() {
        return persController.getSuppliers();
    }
    
    public void modifySupplier(Supplier supplier, String name, String phone) {
        try {
            supplier.setSupplierName(name);
            supplier.setSupplierPhone(phone);
            
            persController.modifySupplier(supplier);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void deleteSupplier(int supplierId) {
        try {
            persController.deleteSupplier(supplierId);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /***** CATEGORY *****/
    
    public void addCategory(String name) {
        Category newCategory = new Category(name);
        
        try {
            persController.addCategory(newCategory);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public Category getCategory(int categoryId) {
        return persController.getCategory(categoryId);
    }
    
    public Category getCategoryByName(String categoryName) {
        return persController.getCategoryByName(categoryName);
    }
    
    public List<Category> getCategories() {
        return persController.getCategories();
    }
    
    /***** BRAND *****/
    
    public void addBrand(String name) {
        Brand newBrand = new Brand(name);
        
        try {
            persController.addBrand(newBrand);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public Brand getBrand(int brandId) {
        return persController.getBrand(brandId);
    }
    
    public Brand getBrandByName(String brandName) {
        return persController.getBrandByName(brandName);
    }
    
    public List<Brand> getBrands() {
        return persController.getBrands();
    }
 
    public void modifyBrand(Brand brand, String name) {
        try {
            brand.setBrandName(name);
            
            persController.modifyBrand(brand);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void deleteBrand(int brandId) {
        try {
            persController.deleteBrand(brandId);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}