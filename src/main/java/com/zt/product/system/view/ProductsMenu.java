package com.zt.product.system.view;

import com.zt.product.system.controller.MainController;
import com.zt.product.system.model.Brand;
import com.zt.product.system.model.Notification;
import com.zt.product.system.model.Product;
import com.zt.product.system.model.Supplier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ProductsMenu extends javax.swing.JFrame {
    
    private TableRowSorter filter;
    private MainController controller = null;

    public ProductsMenu() {
        controller = new MainController();
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setTitle("Menu de Productos");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtNameFilter = new javax.swing.JTextField();
        btnAddProduct = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnGotoSuppliers = new javax.swing.JButton();
        btnGotoBrands = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDeleteProduct = new javax.swing.JButton();
        btnEditProduct = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bxFilterMethod = new javax.swing.JComboBox<>();
        bxFilter = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtModelFilter = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnGotoModifyPrices = new javax.swing.JButton();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        txtNameFilter.setBackground(new java.awt.Color(51, 51, 51));
        txtNameFilter.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNameFilter.setForeground(new java.awt.Color(255, 255, 255));
        txtNameFilter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNameFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameFilterKeyTyped(evt);
            }
        });

        btnAddProduct.setBackground(new java.awt.Color(102, 102, 102));
        btnAddProduct.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setText("Agregar producto");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnGotoSuppliers.setBackground(new java.awt.Color(102, 102, 102));
        btnGotoSuppliers.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnGotoSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        btnGotoSuppliers.setText("Ir a proveedores");
        btnGotoSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotoSuppliersActionPerformed(evt);
            }
        });

        btnGotoBrands.setBackground(new java.awt.Color(102, 102, 102));
        btnGotoBrands.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnGotoBrands.setForeground(new java.awt.Color(255, 255, 255));
        btnGotoBrands.setText("Ir a marcas");
        btnGotoBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotoBrandsActionPerformed(evt);
            }
        });

        tblProducts.setBackground(new java.awt.Color(255, 255, 255));
        tblProducts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tblProducts.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProducts);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("MENU DE PRODUCTOS");

        btnDeleteProduct.setBackground(new java.awt.Color(102, 102, 102));
        btnDeleteProduct.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDeleteProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteProduct.setText("Eliminar producto");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        btnEditProduct.setBackground(new java.awt.Color(102, 102, 102));
        btnEditProduct.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnEditProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnEditProduct.setText("Editar producto");
        btnEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProductActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar por nombre:");

        bxFilterMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Metodo de filtrado:");

        jLabel4.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Filtro:");

        txtModelFilter.setBackground(new java.awt.Color(51, 51, 51));
        txtModelFilter.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtModelFilter.setForeground(new java.awt.Color(255, 255, 255));
        txtModelFilter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtModelFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModelFilterKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Buscar por modelo:");

        btnGotoModifyPrices.setBackground(new java.awt.Color(102, 102, 102));
        btnGotoModifyPrices.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnGotoModifyPrices.setForeground(new java.awt.Color(255, 255, 255));
        btnGotoModifyPrices.setText("Modificar precio");
        btnGotoModifyPrices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotoModifyPricesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bxFilterMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(txtNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddProduct)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditProduct)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteProduct)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGotoModifyPrices)
                        .addGap(18, 18, 18)
                        .addComponent(btnGotoSuppliers)
                        .addGap(18, 18, 18)
                        .addComponent(btnGotoBrands)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddProduct)
                            .addComponent(btnEditProduct)
                            .addComponent(btnDeleteProduct)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bxFilterMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNameFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtModelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnGotoModifyPrices)
                    .addComponent(btnGotoSuppliers)
                    .addComponent(btnGotoBrands))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGotoBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoBrandsActionPerformed
        this.dispose();
        new BrandsMenu().setVisible(true);
    }//GEN-LAST:event_btnGotoBrandsActionPerformed
                                       
    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        if (checkSuppliersAndBrands()) {
            this.dispose();
            new AddProduct().setVisible(true);
        } else {
            Notification.showMessage("Debe existir al menos un proveedor y una marca en el sistema.", "Error", "Agregado fallido");
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnGotoSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoSuppliersActionPerformed
        this.dispose();
        new SuppliersMenu().setVisible(true);
    }//GEN-LAST:event_btnGotoSuppliersActionPerformed
   
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        populateTable();
        initComboboxes();
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        if (tblProducts.getRowCount() > 0) {
            if (tblProducts.getSelectedRow() != -1) {
                int productId = Integer.parseInt(String.valueOf(tblProducts.getValueAt(tblProducts.getSelectedRow(), 0)));
                
                controller.deleteProduct(productId);
                Notification.showMessage("Producto borrado correctamente", "Info", "Borrado exitoso");
                populateTable();
            } else {
                Notification.showMessage("Se debe seleccionar una fila para poder borrar", "Error", "Borrado fallido");
            }
        } else {
            Notification.showMessage("La tabla no contiene registros", "Error", "Borrado fallido");
        }
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProductActionPerformed
        if (tblProducts.getRowCount() > 0) {
            if (tblProducts.getSelectedRow() != -1) {
                int productId = Integer.parseInt(String.valueOf(tblProducts.getValueAt(tblProducts.getSelectedRow(), 0)));
                this.dispose();
                new ModifyProduct(productId).setVisible(true);
            } else {
                Notification.showMessage("Se debe seleccionar una fila para poder modificar", "Error", "Edicion fallida");
            }
        } else {
            Notification.showMessage("La tabla no contiene registros", "Error", "Edicion fallida");
        }
    }//GEN-LAST:event_btnEditProductActionPerformed

    private void txtNameFilterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameFilterKeyTyped
        txtNameFilter.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String string = txtNameFilter.getText();
                txtNameFilter.setText(string);
                filterByName();
            }
        });
        filter = new TableRowSorter(tblProducts.getModel());
        tblProducts.setRowSorter(filter);
    }//GEN-LAST:event_txtNameFilterKeyTyped

    private void btnGotoModifyPricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoModifyPricesActionPerformed
        if (tblProducts.getRowCount() > 0) {
            this.dispose();
            new ModifyPrices().setVisible(true);
        } else {
            Notification.showMessage("La tabla no contiene registros", "Error", "Modificacion fallida");
        }
    }//GEN-LAST:event_btnGotoModifyPricesActionPerformed

    private void txtModelFilterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModelFilterKeyTyped
        txtModelFilter.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String string = txtModelFilter.getText();
                txtModelFilter.setText(string);
                filterByModel();
            }
        });
        filter = new TableRowSorter(tblProducts.getModel());
        tblProducts.setRowSorter(filter);
    }//GEN-LAST:event_txtModelFilterKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnEditProduct;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGotoBrands;
    private javax.swing.JButton btnGotoModifyPrices;
    private javax.swing.JButton btnGotoSuppliers;
    private javax.swing.JComboBox<String> bxFilter;
    private javax.swing.JComboBox<String> bxFilterMethod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtModelFilter;
    private javax.swing.JTextField txtNameFilter;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            };
        };
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        String[] titles = {"ID", "Nombre", "Modelo", "Descripcion", "Marca", "Stock", "Precio", "Proveedores", "Categoria"};
        
        tableModel.setColumnIdentifiers(titles);
        
        List<Product> productList = controller.getProducts();
        
        if (productList != null) {
            for (Product p : productList) {
                Object[] object = {p.getProductId(), p.getProductName(), p.getProductModel(), p.getProductDescrip(), p.getBrand().getBrandName(), 
                                   p.getProductStock(), p.getProductPrice(), getSuppliersNames(p.getSuppliers()), p.getCategory().getCategoryName()
                };
                tableModel.addRow(object);   
            }
        }
        
        tblProducts.setModel(tableModel);
        
        tblProducts.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblProducts.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblProducts.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblProducts.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tblProducts.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tblProducts.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        tblProducts.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        tblProducts.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        tblProducts.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
        
    }
    
    private void populateTable(String filterMethod, String filterValue) {
        DefaultTableModel tableModel = (DefaultTableModel) tblProducts.getModel();
        tableModel.setRowCount(0);

        List<Product> filteredProducts = filterProducts(filterMethod, filterValue);

        for (Product p : filteredProducts) {
            Object[] object = {p.getProductId(), p.getProductName(), p.getProductModel(), p.getProductDescrip(), p.getBrand().getBrandName(), 
                               p.getProductStock(), p.getProductPrice(), getSuppliersNames(p.getSuppliers()), p.getCategory().getCategoryName()
            };
            tableModel.addRow(object);  
        }
        
        tblProducts.setModel(tableModel);
    }
    
    private void initComboboxes() {
        bxFilter.removeAllItems();
        bxFilterMethod.removeAllItems();

        bxFilter.addItem(null);
        bxFilter.setEnabled(false);

        bxFilterMethod.addItem(null);

        bxFilterMethod.addItem("Marca");
        bxFilterMethod.addItem("Proveedor");

        bxFilterMethod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedMethod = (String) bxFilterMethod.getSelectedItem();
                populateFilterComboBox(selectedMethod);
            }
        });
        
        bxFilter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedMethod = (String) bxFilterMethod.getSelectedItem();
                String filterValue = (String) bxFilter.getSelectedItem();
                populateTable(selectedMethod, filterValue);
            }
        }); 
    }

    private void populateFilterComboBox(String selectedMethod) {
        bxFilter.setEnabled(true);
        bxFilter.removeAllItems();
        bxFilter.addItem(null); 
        
        if (selectedMethod != null) {
            switch (selectedMethod) {
                case "Marca":
                    List<Brand> brands = controller.getBrands();
                    for (Brand b : brands) {
                        bxFilter.addItem(b.getBrandName());
                    }
                    break;
                case "Proveedor":
                    List<Supplier> suppliers = controller.getSuppliers();
                    for (Supplier s : suppliers) {
                        bxFilter.addItem(s.getSupplierName());
                    }
                    break;
            }
        }
    }
    
    private List<Product> filterProducts(String filterMethod, String filterValue) {
        List<Product> allProducts = controller.getProducts();
        List<Product> filteredProducts = new ArrayList<>();
        
        if (filterValue != null && filterMethod != null) {
            switch (filterMethod) {
                case "Marca":
                    for (Product p : allProducts) {
                        if (p.getBrand().getBrandName() == filterValue) {
                            filteredProducts.add(p);
                        }
                    }
                    break;
                case "Proveedor":
                    for (Product p : allProducts) {
                        String suppliersNames = getSuppliersNames(p.getSuppliers());
                        if (suppliersNames.contains(filterValue)) {
                            filteredProducts.add(p);
                        }
                    }
                    break;
            }
        } else {
            filteredProducts = allProducts;
        }
        return filteredProducts;
    }
    
    private void filterByName() {
        int tableColumn = 1;
        filter.setRowFilter(RowFilter.regexFilter(txtNameFilter.getText(), tableColumn));
    }
    
    private void filterByModel() {
        int tableColumn = 2;
        filter.setRowFilter(RowFilter.regexFilter(txtModelFilter.getText(), tableColumn));
    }

    private String getSuppliersNames(List<Supplier> suppliers) {
        StringBuilder namesBuilder = new StringBuilder();
        for (Supplier s : suppliers) {
            if (namesBuilder.length() > 0) {
                namesBuilder.append(" - ");
            }
            namesBuilder.append(s.getSupplierName());
        }
        return namesBuilder.toString();
    }    

    private boolean checkSuppliersAndBrands() {
        if ((controller.countSuppliers() > 0) && (controller.countBrands() > 0)) {
            return true;
        } 
        
        return false;
    }
}
