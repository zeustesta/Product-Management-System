package com.zt.product.system.view;

import com.zt.product.system.controller.MainController;
import com.zt.product.system.model.Notification;
import com.zt.product.system.model.Product;
import com.zt.product.system.model.Supplier;
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
        txtFilter = new javax.swing.JTextField();
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

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        txtFilter.setBackground(new java.awt.Color(51, 51, 51));
        txtFilter.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtFilter.setForeground(new java.awt.Color(255, 255, 255));
        txtFilter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterActionPerformed(evt);
            }
        });
        txtFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilterKeyTyped(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGotoSuppliers)
                        .addGap(18, 18, 18)
                        .addComponent(btnGotoBrands))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                        .addComponent(btnAddProduct)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditProduct)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteProduct)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProduct)
                    .addComponent(btnDeleteProduct)
                    .addComponent(btnEditProduct)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnGotoSuppliers)
                    .addComponent(btnGotoBrands))
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

    private void txtFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterActionPerformed

    private void btnGotoBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoBrandsActionPerformed
        this.dispose();
        new BrandsMenu().setVisible(true);
    }//GEN-LAST:event_btnGotoBrandsActionPerformed
                                       
    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        this.dispose();
        new AddProduct().setVisible(true);
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
                new ModifyProduct(productId).setVisible(true);
            } else {
                Notification.showMessage("Se debe seleccionar una fila para poder modificar", "Error", "Edicion fallida");
            }
        } else {
            Notification.showMessage("La tabla no contiene registros", "Error", "Edicion fallida");
        }
    }//GEN-LAST:event_btnEditProductActionPerformed

    private void txtFilterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilterKeyTyped
        txtFilter.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String string = txtFilter.getText();
                txtFilter.setText(string);
                filterByName();
            }
        });
        filter = new TableRowSorter(tblProducts.getModel());
        tblProducts.setRowSorter(filter);
    }//GEN-LAST:event_txtFilterKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnEditProduct;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGotoBrands;
    private javax.swing.JButton btnGotoSuppliers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtFilter;
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
        
        String[] titles = {"ID", "Nombre", "Descripcion", "Marca", "Stock", "Precio", "Proveedores", "Categoria"};
        
        tableModel.setColumnIdentifiers(titles);
        
        List<Product> productList = controller.getProducts();
        
        if (productList != null) {
            for (Product p : productList) {
                if (p.isActive()) {
                    Object[] object = {p.getProductId(), p.getProductName(), p.getProductDescrip(), p.getBrand().getBrandName(), 
                                       p.getProductStock(), p.getProductPrice(), getSuppliersName(p.getSuppliers()), p.getCategory().getCategoryName()
                    };
                    tableModel.addRow(object);   
                }
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
    }
    
    private List<String> getSuppliersName(List<Supplier> suppliers) {
        List<String> names = new ArrayList<>();
        
        for (Supplier s : suppliers) {
            names.add(s.getSupplierName());
        }
        
        return names;
    }
    
    private void filterByName() {
        int tableColumn = 1;
        filter.setRowFilter(RowFilter.regexFilter(txtFilter.getText(), tableColumn));
    }
}
