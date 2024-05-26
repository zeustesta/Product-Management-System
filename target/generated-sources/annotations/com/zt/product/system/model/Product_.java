package com.zt.product.system.model;

import com.zt.product.system.model.Brand;
import com.zt.product.system.model.Category;
import com.zt.product.system.model.Supplier;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-26T17:33:42", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> productModel;
    public static volatile SingularAttribute<Product, Integer> productId;
    public static volatile ListAttribute<Product, Supplier> suppliers;
    public static volatile SingularAttribute<Product, Integer> productStock;
    public static volatile SingularAttribute<Product, String> productDescrip;
    public static volatile SingularAttribute<Product, Category> category;
    public static volatile SingularAttribute<Product, Brand> brand;
    public static volatile SingularAttribute<Product, String> productName;
    public static volatile SingularAttribute<Product, Float> productPrice;

}