package com.zt.product.system.view;

import com.zt.product.system.controller.MainController;
import com.zt.product.system.model.Notification;
import com.zt.product.system.model.Supplier;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SuppliersMenu extends javax.swing.JFrame {
    
    private TableRowSorter filter;
    private MainController controller = null;
    
    public SuppliersMenu() {
        controller = new MainController();
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setTitle("Menu de Proveedores");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSupplier = new javax.swing.JTextField();
        btnAddSupplier = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnGotoBrands = new javax.swing.JButton();
        btnGotoProducts = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEditSupplier = new javax.swing.JButton();
        btnDeleteSupplier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSuppliers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1180, 583));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar proveedor:");

        txtSupplier.setBackground(new java.awt.Color(51, 51, 51));
        txtSupplier.setForeground(new java.awt.Color(255, 255, 255));
        txtSupplier.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierActionPerformed(evt);
            }
        });

        btnAddSupplier.setBackground(new java.awt.Color(102, 102, 102));
        btnAddSupplier.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAddSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSupplier.setText("Agregar proveedor");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
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

        btnGotoBrands.setBackground(new java.awt.Color(102, 102, 102));
        btnGotoBrands.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnGotoBrands.setForeground(new java.awt.Color(255, 255, 255));
        btnGotoBrands.setText("Ir a marcas");
        btnGotoBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotoBrandsActionPerformed(evt);
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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("MENU DE PROVEEDORES");

        btnEditSupplier.setBackground(new java.awt.Color(102, 102, 102));
        btnEditSupplier.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnEditSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnEditSupplier.setText("Editar proveedor");
        btnEditSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSupplierActionPerformed(evt);
            }
        });

        btnDeleteSupplier.setBackground(new java.awt.Color(102, 102, 102));
        btnDeleteSupplier.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDeleteSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteSupplier.setText("Eliminar proveedor");
        btnDeleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSupplierActionPerformed(evt);
            }
        });

        tblSuppliers.setBackground(new java.awt.Color(255, 255, 255));
        tblSuppliers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tblSuppliers.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tblSuppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblSuppliers);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGotoProducts)
                .addGap(18, 18, 18)
                .addComponent(btnGotoBrands)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddSupplier)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditSupplier)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteSupplier)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditSupplier)
                    .addComponent(btnDeleteSupplier)
                    .addComponent(btnAddSupplier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnGotoProducts)
                    .addComponent(btnGotoBrands))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        populateTable();
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSupplierActionPerformed
        if (tblSuppliers.getRowCount() > 0) {
            if (tblSuppliers.getSelectedRow() != -1) {
                int supplierId = Integer.parseInt(String.valueOf(tblSuppliers.getValueAt(tblSuppliers.getSelectedRow(), 0)));

                controller.deleteSupplier(supplierId);
                Notification.showMessage("Proveedor borrado correctamente", "Info", "Borrado exitoso");
                populateTable();
            } else {
                Notification.showMessage("Se debe seleccionar una fila para poder borrar", "Error", "Borrado fallido");
            }
        } else {
            Notification.showMessage("La tabla no contiene registros", "Error", "Borrado fallido");
        }
    }//GEN-LAST:event_btnDeleteSupplierActionPerformed

    private void btnEditSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSupplierActionPerformed
        if (tblSuppliers.getRowCount() > 0) {
            if (tblSuppliers.getSelectedRow() != -1) {
                int supplierId = Integer.parseInt(String.valueOf(tblSuppliers.getValueAt(tblSuppliers.getSelectedRow(), 0)));

                new ModifyBrand(supplierId).setVisible(true);

            } else {
                Notification.showMessage("Se debe seleccionar una fila para poder modificar", "Error", "Edicion fallida");
            }
        } else {
            Notification.showMessage("La tabla no contiene registros", "Error", "Edicion fallida");
        }
    }//GEN-LAST:event_btnEditSupplierActionPerformed

    private void btnGotoProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoProductsActionPerformed
        this.dispose();
        new ProductsMenu().setVisible(true);
    }//GEN-LAST:event_btnGotoProductsActionPerformed

    private void btnGotoBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoBrandsActionPerformed
        this.dispose();
        new BrandsMenu().setVisible(true);
    }//GEN-LAST:event_btnGotoBrandsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed
        this.dispose();
        new AddSupplier().setVisible(true);
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void txtSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierActionPerformed
        txtSupplier.addKeyListener(new KeyAdapter() {
            private void KeyReleased(final KeyEvent e) {
                String string = txtSupplier.getText();
                txtSupplier.setText(string);
                filterSupplier();
            }
        });
        filter = new TableRowSorter(tblSuppliers.getModel());
        tblSuppliers.setRowSorter(filter);
    }//GEN-LAST:event_txtSupplierActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnDeleteSupplier;
    private javax.swing.JButton btnEditSupplier;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGotoBrands;
    private javax.swing.JButton btnGotoProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSuppliers;
    private javax.swing.JTextField txtSupplier;
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
        
        String[] titles = {"ID", "Nombre", "Telefono"};
        
        tableModel.setColumnIdentifiers(titles);
        
        List<Supplier> supplierList = controller.getSuppliers();
        
        if (supplierList != null) {
            for (Supplier s : supplierList) {
                Object[] object = {s.getSupplierId(), s.getSupplierName(), s.getSupplierPhone()};
                tableModel.addRow(object);   
            }
        }
        
        tblSuppliers.setModel(tableModel);
        
        tblSuppliers.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblSuppliers.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblSuppliers.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
    }
    
    private void filterSupplier() {
        int tableColumn = 1;
        filter.setRowFilter(RowFilter.regexFilter(txtSupplier.getText(), tableColumn));
    }
}
