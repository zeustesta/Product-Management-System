package com.zt.product.system.view;

import com.zt.product.system.controller.MainController;
import com.zt.product.system.model.Brand;
import com.zt.product.system.model.Notification;
import com.zt.product.system.model.Supplier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ModifyPrices extends javax.swing.JFrame {

    private MainController controller = null;
    
    public ModifyPrices() {
        controller = new MainController();
        initComponents();
        this.setTitle("Menu de Modificacion");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spnPercent = new javax.swing.JSpinner();
        bxType = new javax.swing.JComboBox<>();
        cbxDecrement = new javax.swing.JCheckBox();
        cbxIncrement = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFinish = new javax.swing.JButton();
        bxTypeSelection = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("MODIFICAR PRECIOS");

        bxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxDecrement.setBackground(new java.awt.Color(204, 204, 204));
        cbxDecrement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxDecrement.setForeground(new java.awt.Color(0, 0, 0));
        cbxDecrement.setText("Decremento");
        cbxDecrement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbxIncrement.setBackground(new java.awt.Color(204, 204, 204));
        cbxIncrement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxIncrement.setForeground(new java.awt.Color(0, 0, 0));
        cbxIncrement.setText("Incremento");
        cbxIncrement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Operacion:");

        jLabel3.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Porcentaje:");

        jLabel4.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mediante:");

        btnFinish.setBackground(new java.awt.Color(0, 204, 0));
        btnFinish.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnFinish.setText("Modificar");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        bxTypeSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFinish)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(cbxIncrement, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(cbxDecrement))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spnPercent, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bxType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(bxTypeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxIncrement)
                    .addComponent(cbxDecrement))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bxTypeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnFinish)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        String operation = getOperation();
        String type = (String) bxType.getSelectedItem();
        String typeSelection = (String) bxTypeSelection.getSelectedItem();
        int percent = (Integer) spnPercent.getValue();
        
        if (areFieldsValid(type, typeSelection, operation, percent)) {
            controller.modifyPrices(operation, type, typeSelection, percent);
            Notification.showMessage("Precios modificados correctamente", "Info", "Modificacion exitosa");
        } else {
            Notification.showMessage("Algo salio mal", "Error", "Modificacion fallida");
        }
    }//GEN-LAST:event_btnFinishActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        initComboboxes();
    }//GEN-LAST:event_formWindowOpened

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new ProductsMenu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFinish;
    private javax.swing.JComboBox<String> bxType;
    private javax.swing.JComboBox<String> bxTypeSelection;
    private javax.swing.JCheckBox cbxDecrement;
    private javax.swing.JCheckBox cbxIncrement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spnPercent;
    // End of variables declaration//GEN-END:variables

    private void initComboboxes() {
        bxType.removeAllItems();
        bxTypeSelection.removeAllItems();
        bxTypeSelection.setEnabled(false);
        
        bxType.addItem("Marca");
        bxType.addItem("Proveedor");
        
        bxType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedType = (String) bxType.getSelectedItem();
                populateTypeSelectionComboBox(selectedType);
            }
        });
    }
    
    private void populateTypeSelectionComboBox(String selectedType) {
        bxTypeSelection.setEnabled(true);
        bxTypeSelection.removeAllItems();
        
        if (selectedType != null) {
            switch (selectedType) {
                case "Marca":
                    List<Brand> brands = controller.getBrands();
                    for (Brand b : brands) {
                        bxTypeSelection.addItem(b.getBrandName());
                    }
                    break;
                case "Proveedor":
                    List<Supplier> suppliers = controller.getSuppliers();
                    for (Supplier s : suppliers) {
                        bxTypeSelection.addItem(s.getSupplierName());
                    }
                    break;
            }
        }
    }
    
    private boolean areFieldsValid(String type, String typeSelection, String operation, int percent) {
        if ((type == "") || (typeSelection == "") || (operation == null) || (percent == 0)) {
            Notification.showMessage("Todos los campos deben estar completos", "Error", "Modificacion fallida");
            return false;
        }
        
        if ((operation == "Decremento") && (percent == 100)) {
            Notification.showMessage("El precio no puede ser igual a '0'", "Error", "Modificacion fallida");
            return false;
        }
        
        return true;
    }
    
    private String getOperation() {
        if (cbxIncrement.isSelected() && cbxDecrement.isSelected()) {
            Notification.showMessage("Seleccione solo un tipo de operacion", "Error", "Modificacion fallida");
        } else {
            if (cbxIncrement.isSelected() && !cbxDecrement.isSelected()) {
                return (String) cbxIncrement.getText();
            } else if (!cbxIncrement.isSelected() && cbxDecrement.isSelected()) {
                return (String) cbxDecrement.getText();
            }
        }
        return null;
    }
}
