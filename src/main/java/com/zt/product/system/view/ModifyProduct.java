package com.zt.product.system.view;

import com.zt.product.system.controller.MainController;
import com.zt.product.system.model.Brand;
import com.zt.product.system.model.Category;
import com.zt.product.system.model.Notification;
import com.zt.product.system.model.Product;
import com.zt.product.system.model.Supplier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ModifyProduct extends javax.swing.JFrame {

    private MainController controller = null;
    private Product product = new Product();
    
    public ModifyProduct(int productId) {
        controller = new MainController();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Editar Producto");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        getProductData(productId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtProductStock = new javax.swing.JTextField();
        txtProductPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProductDescription = new javax.swing.JTextArea();
        btnEditProduct = new javax.swing.JButton();
        bxProductCategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        bxProductBrand = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        bxProductSupplier1 = new javax.swing.JComboBox<>();
        bxProductSupplier2 = new javax.swing.JComboBox<>();
        bxProductSupplier3 = new javax.swing.JComboBox<>();
        bxProductSupplier4 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtProductModel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("EDITAR PRODUCTO");

        txtProductName.setText("Nombre del producto");

        txtProductStock.setText("Stock");

        txtProductPrice.setText("Precio");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Precio:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Marca:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Proveedor:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Stock:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Descripcion:");

        txtProductDescription.setColumns(20);
        txtProductDescription.setRows(5);
        jScrollPane1.setViewportView(txtProductDescription);

        btnEditProduct.setBackground(new java.awt.Color(0, 204, 0));
        btnEditProduct.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnEditProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnEditProduct.setText("Editar");
        btnEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProductActionPerformed(evt);
            }
        });

        bxProductCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Categoria:");

        bxProductBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        bxProductSupplier1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bxProductSupplier2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bxProductSupplier3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bxProductSupplier4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Modelo:");

        txtProductModel.setText("Modelo del producto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnBack))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(btnEditProduct))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bxProductSupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bxProductSupplier2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bxProductSupplier3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bxProductSupplier4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bxProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductModel))))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bxProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtProductModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(bxProductSupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bxProductSupplier2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bxProductSupplier3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bxProductSupplier4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bxProductBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(bxProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnEditProduct)
                .addGap(23, 23, 23)
                .addComponent(btnBack)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProductActionPerformed
        String name = txtProductName.getText();
        String model = txtProductModel.getText();
        int stock = Integer.parseInt(txtProductStock.getText());
        float price = Float.parseFloat(txtProductPrice.getText());
        String descrip = txtProductDescription.getText();
        
        ArrayList<Supplier> suppliers = getSuppliersList();
        Brand brand = getSelectedBrand();
        Category category = getSelectedCategory();
        
        if (areFieldsValid(name, price, stock, brand, suppliers, category)) {
            controller.modifyProduct(this.product, name, model, stock, price, suppliers, brand, descrip, category);
            Notification.showMessage("Producto modificado correctamente", "Info", "Modificacion exitosa");
            this.dispose();
            new ProductsMenu().setVisible(true);   
        } else {
            Notification.showMessage("Algo salio mal", "Error", "Modificacion fallida");
        }
    }//GEN-LAST:event_btnEditProductActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new ProductsMenu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditProduct;
    private javax.swing.JComboBox<String> bxProductBrand;
    private javax.swing.JComboBox<String> bxProductCategory;
    private javax.swing.JComboBox<String> bxProductSupplier1;
    private javax.swing.JComboBox<String> bxProductSupplier2;
    private javax.swing.JComboBox<String> bxProductSupplier3;
    private javax.swing.JComboBox<String> bxProductSupplier4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtProductDescription;
    private javax.swing.JTextField txtProductModel;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtProductStock;
    // End of variables declaration//GEN-END:variables

    private void initComboboxes() {
        bxProductBrand.removeAllItems();
        bxProductCategory.removeAllItems();
        bxProductSupplier1.removeAllItems();
        bxProductSupplier2.removeAllItems();
        bxProductSupplier3.removeAllItems();
        bxProductSupplier4.removeAllItems();
        
        bxProductSupplier1.addItem(null);
        bxProductSupplier2.addItem(null);
        bxProductSupplier3.addItem(null);
        bxProductSupplier4.addItem(null);
    }
    
    private void getProductData(int productId) {
        initComboboxes();
        this.product = controller.getProduct(productId);
        List<Supplier> allSuppliers = controller.getSuppliers();
        List<Brand> allBrands = controller.getBrands();
        List<Category> allCategories = controller.getCategories();
        
        txtProductName.setText(this.product.getProductName());
        txtProductModel.setText(this.product.getProductModel());
        txtProductDescription.setText(this.product.getProductDescrip());
        txtProductPrice.setText(String.valueOf(this.product.getProductPrice()));
        txtProductStock.setText(String.valueOf(this.product.getProductStock()));
        
        configureSuppliers(allSuppliers, this.product.getSuppliers());
        
        for (Brand brand : allBrands) {
            bxProductBrand.addItem(brand.getBrandName());
        }
        bxProductBrand.setSelectedItem(this.product.getBrand().getBrandName());
        
        for (Category category : allCategories) {
            bxProductCategory.addItem(category.getCategoryName());
        }
        bxProductCategory.setSelectedItem(this.product.getCategory().getCategoryName());
        
    }
    
    private Brand getSelectedBrand() {
        return controller.getBrandByName(String.valueOf(bxProductBrand.getSelectedItem()));
    }
    
    private Category getSelectedCategory() {
        return controller.getCategoryByName(String.valueOf(bxProductCategory.getSelectedItem()));
    }
    
    private ArrayList<Supplier> getSuppliersList() {
    ArrayList<Supplier> selectedSuppliers = new ArrayList<>();
        Set<String> selectedSupplierNames = new HashSet<>();
    
    String supplierName1 = (String) bxProductSupplier1.getSelectedItem();
    if (supplierName1 != null) {
        if (!selectedSupplierNames.add(supplierName1)) {
            JOptionPane.showMessageDialog(null, "El proveedor " + supplierName1 + " ya ha sido seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }
        selectedSuppliers.add(controller.getSupplierByName(supplierName1));
    }

    String supplierName2 = (String) bxProductSupplier2.getSelectedItem();
    if (supplierName2 != null) {
        if (!selectedSupplierNames.add(supplierName2)) {
            JOptionPane.showMessageDialog(null, "El proveedor " + supplierName2 + " ya ha sido seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }
        selectedSuppliers.add(controller.getSupplierByName(supplierName2));
    }

    String supplierName3 = (String) bxProductSupplier3.getSelectedItem();
    if (supplierName3 != null) {
        if (!selectedSupplierNames.add(supplierName3)) {
            JOptionPane.showMessageDialog(null, "El proveedor " + supplierName3 + " ya ha sido seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }
        selectedSuppliers.add(controller.getSupplierByName(supplierName3));
    }

    String supplierName4 = (String) bxProductSupplier4.getSelectedItem();
    if (supplierName4 != null) {
        if (!selectedSupplierNames.add(supplierName4)) {
            JOptionPane.showMessageDialog(null, "El proveedor " + supplierName4 + " ya ha sido seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
            return new ArrayList<>();
        }
        selectedSuppliers.add(controller.getSupplierByName(supplierName4));
    }
    
    return selectedSuppliers;
}
    
    public void configureSuppliers(List<Supplier> allSuppliers, List<Supplier> currentSuppliers) {
        JComboBox<String>[] comboBoxes = new JComboBox[]{bxProductSupplier1, bxProductSupplier2, bxProductSupplier3, bxProductSupplier4};
        
        for (int i = 0; i < comboBoxes.length; i++) {
            configureCombobox(comboBoxes[i], allSuppliers, i < currentSuppliers.size() ? currentSuppliers.get(i) : null);
        }
    }
    
    private void configureCombobox(JComboBox<String> comboBox, List<Supplier> allSuppliers, Supplier defaultSupplier) {
        
        for (Supplier supplier : allSuppliers) {
            comboBox.addItem(supplier.getSupplierName());
        }
        if (defaultSupplier != null) {
            comboBox.setSelectedItem(defaultSupplier.getSupplierName());
        } else {
            comboBox.setSelectedItem(null);
        }
    }
    
    private boolean areFieldsValid(String name, float price, int stock, Brand brand, ArrayList<Supplier> suppliers, Category category) {
        if ((name == "") || (price == 0) || (stock == 0) || (brand == null) || (category == null) || (suppliers.size() == 0)) {
            return false;
        }
        
        return true;
    }
}
