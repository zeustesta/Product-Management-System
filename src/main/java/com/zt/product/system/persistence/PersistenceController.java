package com.zt.product.system.persistence;

import com.zt.product.system.model.Brand;
import com.zt.product.system.model.Category;
import com.zt.product.system.model.Product;
import com.zt.product.system.model.Supplier;
import java.util.List;

public class PersistenceController {
    
    private final BrandJpaController brandJpa = new BrandJpaController();
    private final SupplierJpaController supplierJpa = new SupplierJpaController();
    private final ProductJpaController productJpa = new ProductJpaController();
    private final CategoryJpaController categoryJpa = new CategoryJpaController();
            
    /**** PRODUCT *****/
    
    public void addProduct(Product newProduct) throws Exception {
        productJpa.create(newProduct);
    }
    
    public Product getProduct(int productId) {
        return productJpa.findProductModel(productId);
    }
    
    public List<Product> getProducts() {
        return productJpa.findProductModelEntities();
    }
    
    public void modifyProduct(Product product) throws Exception {
        productJpa.edit(product);
    }
    
    public void modifyPrices(String operation, String type, String typeSelection, int percent) {
        productJpa.modifyPrices(operation, type, typeSelection, percent);
    }
    
    public void deleteProduct(int productId) throws Exception {
        productJpa.destroy(productId);
    }
    
    /***** SUPPLIER *****/
    
    public void addSupplier(Supplier newSupplier) throws Exception {
        supplierJpa.create(newSupplier);
    }
    
    public Supplier getSupplier(int supplierId) {
        return supplierJpa.findSupplier(supplierId);
    }
    
    public Supplier getSupplierByName(String supplierName) {
        return supplierJpa.findSupplierByName(supplierName);
    }
    
    public List<Supplier> getSuppliers() {
        return supplierJpa.findSupplierEntities();
    }
    
    public void modifySupplier(Supplier supplier) throws Exception {
        supplierJpa.edit(supplier);
    }
    
    public void deleteSupplier(int supplierId) throws Exception {
        supplierJpa.destroy(supplierId);
    }
    
    /***** CATEGORY *****/
    
    public void addCategory(Category newCategory) throws Exception {
        categoryJpa.create(newCategory);
    }
    
    public Category getCategory(int categoryId) {
        return categoryJpa.findCategory(categoryId);
    }
    
    public Category getCategoryByName(String categoryName) {
        return categoryJpa.findCategoryByName(categoryName);
    }
    
    public List<Category> getCategories() {
        return categoryJpa.findCategoryEntities();
    }
    
    /***** BRAND *****/
    
    public void addBrand(Brand newBrand) throws Exception {
        brandJpa.create(newBrand);
    }
    
    public Brand getBrand(int brandId) {
        return brandJpa.findBrand(brandId);
    }
    
    public Brand getBrandByName(String brandName) {
        return brandJpa.findBrandByName(brandName);
    }
    
    public List<Brand> getBrands() {
        return brandJpa.findBrandEntities();
    }
    
    public void modifyBrand(Brand brand) throws Exception {
        brandJpa.edit(brand);
    }
    
    public void deleteBrand(int brandId) throws Exception {
        brandJpa.destroy(brandId);
    }
}
