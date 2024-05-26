package com.zt.product.system.view;

import com.zt.product.system.controller.MainController;
import com.zt.product.system.model.Brand;
import com.zt.product.system.model.Notification;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class BrandsMenu extends javax.swing.JFrame {
    
    private TableRowSorter filter;
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
        btnAddBrand = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnGotoSuppliers = new javax.swing.JButton();
        btnGotoProducts = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBrands = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEditBrand = new javax.swing.JButton();
        btnDeleteBrand = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        txtBrand.setBackground(new java.awt.Color(51, 51, 51));
        txtBrand.setForeground(new java.awt.Color(255, 255, 255));
        txtBrand.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBrandKeyTyped(evt);
            }
        });

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

        tblBrands.setBackground(new java.awt.Color(255, 255, 255));
        tblBrands.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tblBrands.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tblBrands.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblBrands);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("MENU DE MARCAS");

        btnEditBrand.setBackground(new java.awt.Color(102, 102, 102));
        btnEditBrand.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnEditBrand.setForeground(new java.awt.Color(255, 255, 255));
        btnEditBrand.setText("Editar marca");
        btnEditBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditBrandActionPerformed(evt);
            }
        });

        btnDeleteBrand.setBackground(new java.awt.Color(102, 102, 102));
        btnDeleteBrand.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDeleteBrand.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteBrand.setText("Eliminar marca");
        btnDeleteBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBrandActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar marca:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 712, Short.MAX_VALUE)
                        .addComponent(btnAddBrand)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditBrand)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteBrand)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGotoSuppliers)
                .addGap(18, 18, 18)
                .addComponent(btnGotoProducts)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddBrand)
                    .addComponent(btnEditBrand)
                    .addComponent(btnDeleteBrand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnGotoSuppliers)
                    .addComponent(btnGotoProducts))
                .addGap(53, 53, 53))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        populateTable();
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBrandActionPerformed
        if (tblBrands.getRowCount() > 0) {
            if (tblBrands.getSelectedRow() != -1) {
                int brandId = Integer.parseInt(String.valueOf(tblBrands.getValueAt(tblBrands.getSelectedRow(), 0)));
                
                controller.deleteBrand(brandId);
                Notification.showMessage("Marca borrada correctamente", "Info", "Borrado exitoso");
                populateTable();
            } else {
                Notification.showMessage("Se debe seleccionar una fila para poder borrar", "Error", "Borrado fallido");
            }
        } else {
            Notification.showMessage("La tabla no contiene registros", "Error", "Borrado fallido");
        }
    }//GEN-LAST:event_btnDeleteBrandActionPerformed

    private void btnEditBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditBrandActionPerformed
        if (tblBrands.getRowCount() > 0) {
            if (tblBrands.getSelectedRow() != -1) {
                int brandId = Integer.parseInt(String.valueOf(tblBrands.getValueAt(tblBrands.getSelectedRow(), 0)));
                
                this.dispose();
                new ModifyBrand(brandId).setVisible(true);
                
            } else {
                Notification.showMessage("Se debe seleccionar una fila para poder modificar", "Error", "Edicion fallida");
            }
        } else {
            Notification.showMessage("La tabla no contiene registros", "Error", "Edicion fallida");
        }
    }//GEN-LAST:event_btnEditBrandActionPerformed

    private void txtBrandKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandKeyTyped
        txtBrand.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String string = txtBrand.getText();
                txtBrand.setText(string);
                filterBrand();
            }
        });
        filter = new TableRowSorter(tblBrands.getModel());
        tblBrands.setRowSorter(filter);
    }//GEN-LAST:event_txtBrandKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBrand;
    private javax.swing.JButton btnDeleteBrand;
    private javax.swing.JButton btnEditBrand;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGotoProducts;
    private javax.swing.JButton btnGotoSuppliers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBrands;
    private javax.swing.JTextField txtBrand;
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
        
        String[] titles = {"ID", "Nombre"};
        
        tableModel.setColumnIdentifiers(titles);
        
        List<Brand> brandList = controller.getBrands();
        
        if (brandList != null) {
            for (Brand b : brandList) {
                Object[] object = {b.getBrandId(), b.getBrandName()};
                tableModel.addRow(object);   
            }
        }
        
        tblBrands.setModel(tableModel);
        
        tblBrands.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblBrands.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
    }
    
    private void filterBrand() {
        int tableColumn = 1;
        filter.setRowFilter(RowFilter.regexFilter(txtBrand.getText(), tableColumn));
    }
}
