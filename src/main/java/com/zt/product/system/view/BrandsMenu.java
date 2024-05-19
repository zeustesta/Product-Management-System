package com.zt.product.system.view;

import com.zt.product.system.controller.MainController;

public class BrandsMenu extends javax.swing.JFrame {
    
    private MainController controller = null;

    public BrandsMenu() {
        controller = new MainController();
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setTitle("Menu de Marcas");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBrand = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAddBrand = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnGotoSuppliers = new javax.swing.JButton();
        btnGotoProducts = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEditBrand = new javax.swing.JButton();
        btnDeleteBrand = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        txtBrand.setBackground(new java.awt.Color(51, 51, 51));
        txtBrand.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtBrand.setForeground(new java.awt.Color(255, 255, 255));
        txtBrand.setText("Nombre de la marca");
        txtBrand.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(102, 102, 102));
        btnSearch.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Buscar");

        btnAddBrand.setBackground(new java.awt.Color(102, 102, 102));
        btnAddBrand.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAddBrand.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBrand.setText("Agregar marca");
        btnAddBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBrandActionPerformed(evt);
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

        btnGotoProducts.setBackground(new java.awt.Color(102, 102, 102));
        btnGotoProducts.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnGotoProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnGotoProducts.setText("Ir a productos");
        btnGotoProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotoProductsActionPerformed(evt);
            }
        });

        tblProducts.setBackground(new java.awt.Color(255, 255, 255));
        tblProducts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
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
        jLabel1.setText("MENU DE MARCAS");

        btnEditBrand.setBackground(new java.awt.Color(102, 102, 102));
        btnEditBrand.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnEditBrand.setForeground(new java.awt.Color(255, 255, 255));
        btnEditBrand.setText("Editar marca");

        btnDeleteBrand.setBackground(new java.awt.Color(102, 102, 102));
        btnDeleteBrand.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDeleteBrand.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteBrand.setText("Eliminar marca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 399, Short.MAX_VALUE)
                                .addComponent(btnAddBrand)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditBrand)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteBrand))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGotoSuppliers)
                        .addGap(18, 18, 18)
                        .addComponent(btnGotoProducts)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddBrand)
                    .addComponent(btnDeleteBrand)
                    .addComponent(btnEditBrand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnGotoSuppliers)
                    .addComponent(btnGotoProducts))
                .addGap(22, 22, 22))
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

    private void btnAddBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBrandActionPerformed
        this.dispose();
        new AddBrand().setVisible(true);
    }//GEN-LAST:event_btnAddBrandActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnGotoSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoSuppliersActionPerformed
        this.dispose();
        new SuppliersMenu().setVisible(true);
    }//GEN-LAST:event_btnGotoSuppliersActionPerformed

    private void btnGotoProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoProductsActionPerformed
        this.dispose();
        new ProductsMenu().setVisible(true);
    }//GEN-LAST:event_btnGotoProductsActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBrand;
    private javax.swing.JButton btnDeleteBrand;
    private javax.swing.JButton btnEditBrand;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGotoProducts;
    private javax.swing.JButton btnGotoSuppliers;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtBrand;
    // End of variables declaration//GEN-END:variables
}
