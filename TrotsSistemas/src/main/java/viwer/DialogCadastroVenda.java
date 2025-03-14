package viwer;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license Click
 * nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this
 * template
 */
/**
 *
 * @author 2023122760328
 */
public class DialogCadastroVenda extends javax.swing.JDialog {

    /**
     * Creates new form Cadastro
     */
    public DialogCadastroVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Popup = new javax.swing.JPopupMenu();
        inserir = new javax.swing.JMenuItem();
        excluir = new javax.swing.JMenuItem();
        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FORM = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        PaineldeCad1 = new javax.swing.JPanel();
        btnNovo1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        overflow = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        lblValor = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblLanche = new javax.swing.JLabel();
        cmbSabor = new javax.swing.JComboBox();
        txtNome1 = new javax.swing.JTextField();
        btnPesqCli = new javax.swing.JButton();
        btnAddLanche = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        spnQtde = new javax.swing.JSpinner();

        inserir.setText("inserir");
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });
        Popup.add(inserir);

        excluir.setText("excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        Popup.add(excluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(720, 720));

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(530, 530));
        background.setPreferredSize(new java.awt.Dimension(430, 530));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 15);
        flowLayout1.setAlignOnBaseline(true);
        background.setLayout(flowLayout1);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(600, 400));

        FORM.setBackground(new java.awt.Color(255, 255, 255));
        FORM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FORM.setForeground(new java.awt.Color(255, 255, 255));
        FORM.setAlignmentX(100.0F);
        FORM.setAlignmentY(100.0F);
        FORM.setAutoscrolls(true);
        FORM.setMaximumSize(new java.awt.Dimension(1024, 800));
        FORM.setMinimumSize(new java.awt.Dimension(650, 650));
        FORM.setName(""); // NOI18N
        FORM.setPreferredSize(new java.awt.Dimension(650, 650));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 15);
        flowLayout2.setAlignOnBaseline(true);
        FORM.setLayout(flowLayout2);

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trots/Trots_com_Slogan_Logo_ico.png"))); // NOI18N
        Logo.setAlignmentX(50.0F);
        Logo.setAlignmentY(50.0F);
        FORM.add(Logo);

        PaineldeCad1.setBackground(new java.awt.Color(204, 204, 204));
        PaineldeCad1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registrar Venda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        PaineldeCad1.setForeground(new java.awt.Color(0, 0, 0));
        PaineldeCad1.setAlignmentX(50.0F);
        PaineldeCad1.setAlignmentY(50.0F);
        PaineldeCad1.setAutoscrolls(true);
        PaineldeCad1.setMaximumSize(new java.awt.Dimension(300, 500));
        PaineldeCad1.setMinimumSize(new java.awt.Dimension(450, 450));
        PaineldeCad1.setName(""); // NOI18N
        PaineldeCad1.setPreferredSize(new java.awt.Dimension(450, 450));

        btnNovo1.setBackground(new java.awt.Color(255, 255, 255));
        btnNovo1.setForeground(new java.awt.Color(0, 0, 0));
        btnNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        btnNovo1.setText("Confirmar Venda");
        btnNovo1.setAutoscrolls(true);
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        btnCancelar1.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar1.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        btnCancelar1.setText("Cancelar");

        overflow.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Ervas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tblPedido.setBackground(new java.awt.Color(255, 255, 255));
        tblPedido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tblPedido.setForeground(new java.awt.Color(0, 0, 0));
        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"sad",  new Integer(7),  new Double(500.0),  new Double(10.89)},
                {"Erva Mate - Menta & Cereja ",  new Integer(3),  new Double(500.0),  new Double(10.89)},
                {"aasd",  new Integer(5),  new Double(500.0),  new Double(10.89)},
                {"aasdasd",  new Integer(8),  new Double(500.0),  new Double(10.89)}
            },
            new String [] {
                "Sabor", "Qtde", "Peso", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedido.setComponentPopupMenu(Popup);
        tblPedido.setGridColor(new java.awt.Color(0, 0, 0));
        tblPedido.setMinimumSize(new java.awt.Dimension(400, 520));
        tblPedido.setPreferredSize(new java.awt.Dimension(400, 520));
        tblPedido.setSelectionBackground(new java.awt.Color(0, 0, 204));
        tblPedido.setShowGrid(true);
        tblPedido.getTableHeader().setResizingAllowed(false);
        tblPedido.getTableHeader().setReorderingAllowed(false);
        overflow.setViewportView(tblPedido);

        lblValor.setBackground(new java.awt.Color(255, 255, 255));
        lblValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblValor.setForeground(new java.awt.Color(0, 0, 0));
        lblValor.setText("TOTAL: R$ 0,0");

        lblNome1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(0, 0, 0));
        lblNome1.setText("Cliente");

        lblLanche.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLanche.setForeground(new java.awt.Color(0, 0, 0));
        lblLanche.setText("Item");

        cmbSabor.setBackground(new java.awt.Color(255, 255, 255));
        cmbSabor.setForeground(new java.awt.Color(0, 0, 0));
        cmbSabor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Um", "limão caipira", "lima & cereja", "eucalipto" }));

        txtNome1.setBackground(new java.awt.Color(255, 255, 255));
        txtNome1.setForeground(new java.awt.Color(0, 0, 0));
        txtNome1.setText("Teste");
        txtNome1.setEnabled(false);

        btnPesqCli.setBackground(new java.awt.Color(255, 255, 255));
        btnPesqCli.setForeground(new java.awt.Color(0, 0, 0));
        btnPesqCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/zoom_16x16.gif"))); // NOI18N
        btnPesqCli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCliActionPerformed(evt);
            }
        });

        btnAddLanche.setBackground(new java.awt.Color(255, 255, 255));
        btnAddLanche.setForeground(new java.awt.Color(0, 0, 0));
        btnAddLanche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnAddLanche.setText("Incluir");
        btnAddLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLancheActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Qtde");

        spnQtde.setModel(new javax.swing.SpinnerNumberModel(5, 0, 10, 1));

        javax.swing.GroupLayout PaineldeCad1Layout = new javax.swing.GroupLayout(PaineldeCad1);
        PaineldeCad1.setLayout(PaineldeCad1Layout);
        PaineldeCad1Layout.setHorizontalGroup(
            PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaineldeCad1Layout.createSequentialGroup()
                        .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PaineldeCad1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PaineldeCad1Layout.createSequentialGroup()
                                        .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaineldeCad1Layout.createSequentialGroup()
                                                .addComponent(lblNome1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                                                .addComponent(lblLanche)
                                                .addGap(7, 7, 7)))
                                        .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                                                .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cmbSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaineldeCad1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overflow, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaineldeCad1Layout.setVerticalGroup(
            PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesqCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome1)
                        .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLanche)
                    .addComponent(cmbSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(overflow, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblValor)
                .addGap(26, 26, 26)
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );

        FORM.add(PaineldeCad1);

        jScrollPane1.setViewportView(FORM);

        background.add(jScrollPane1);

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLancheActionPerformed
        // TODO add your handling code here:
        String item = cmbSabor.getSelectedItem().toString();
        int qtde = (int) spnQtde.getValue();
        double peso = 500 * qtde;
        double valor = qtde * 10.89;
        inserirTabela(item,qtde,peso,valor);
    }//GEN-LAST:event_btnAddLancheActionPerformed

    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(
                    this,
                    "Essa fucionalidade ainda não esta pronta",
                    "Registro de Venda",
                    JOptionPane.INFORMATION_MESSAGE
            );
    }//GEN-LAST:event_inserirActionPerformed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void btnPesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCliActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(
                    this,
                    "Essa fucionalidade ainda não esta pronta",
                    "Registro de Venda",
                    JOptionPane.INFORMATION_MESSAGE
            );
    }//GEN-LAST:event_btnPesqCliActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
        int linha = tblPedido.getSelectedRow();
        if (linha >= 0) {
            int confirmPane = JOptionPane.showConfirmDialog(
                    this,
                    "Deseja realmente Excluir o Pedido?"
            );

            if (confirmPane == JOptionPane.YES_OPTION) {
                ((DefaultTableModel) tblPedido.getModel()).removeRow(linha);
                JOptionPane.showMessageDialog(
                        this,
                        "Excluido com sucesso!",
                        "Cadastro de Produto",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }

    }//GEN-LAST:event_excluirActionPerformed

    private void inserirTabela(String sabor, int qtde, double peso, double valor) {
        ((DefaultTableModel) tblPedido.getModel()).addRow(new Object[4]);

        int linha = tblPedido.getRowCount() - 1;
        int col = 0;
        tblPedido.setValueAt(sabor, linha, col++);
        tblPedido.setValueAt(qtde, linha, col++);
        tblPedido.setValueAt(peso, linha, col++);
        tblPedido.setValueAt(valor, linha, col++);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogCadastro dialog = new DialogCadastro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FORM;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PaineldeCad1;
    private javax.swing.JPopupMenu Popup;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAddLanche;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnPesqCli;
    private javax.swing.JComboBox cmbSabor;
    private javax.swing.JMenuItem excluir;
    private javax.swing.JMenuItem inserir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLanche;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JScrollPane overflow;
    private javax.swing.JSpinner spnQtde;
    private javax.swing.JTable tblPedido;
    private javax.swing.JTextField txtNome1;
    // End of variables declaration//GEN-END:variables
}
