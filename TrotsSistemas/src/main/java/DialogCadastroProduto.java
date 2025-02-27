/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author 2023122760328
 */
public class DialogCadastroProduto extends javax.swing.JDialog {

    /**
     * Creates new form Cadastro
     */
    public DialogCadastroProduto(java.awt.Frame parent, boolean modal) {
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

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FORM = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        PaineldeCad1 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblEnder = new javax.swing.JLabel();
        lblTelFixo = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        txtEnder = new javax.swing.JTextField();
        lblEnder7 = new javax.swing.JLabel();
        lblEnder5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNome1 = new javax.swing.JTextField();
        btnNovo1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setResizable(false);

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setAlignmentX(50.0F);
        background.setAlignmentY(50.0F);
        background.setMinimumSize(new java.awt.Dimension(720, 720));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 50);
        flowLayout1.setAlignOnBaseline(true);
        background.setLayout(flowLayout1);

        jScrollPane1.setAlignmentX(50.0F);
        jScrollPane1.setAlignmentY(50.0F);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(720, 600));

        FORM.setBackground(new java.awt.Color(255, 255, 255));
        FORM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FORM.setForeground(new java.awt.Color(255, 255, 255));
        FORM.setAlignmentX(100.0F);
        FORM.setAlignmentY(100.0F);
        FORM.setAutoscrolls(true);
        FORM.setMaximumSize(new java.awt.Dimension(720, 32767));
        FORM.setMinimumSize(new java.awt.Dimension(720, 600));
        FORM.setPreferredSize(new java.awt.Dimension(720, 600));
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
        PaineldeCad1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        PaineldeCad1.setForeground(new java.awt.Color(0, 0, 0));
        PaineldeCad1.setAlignmentX(50.0F);
        PaineldeCad1.setAlignmentY(50.0F);
        PaineldeCad1.setMaximumSize(new java.awt.Dimension(300, 500));
        PaineldeCad1.setMinimumSize(new java.awt.Dimension(300, 300));

        lblNome1.setForeground(new java.awt.Color(0, 0, 0));
        lblNome1.setText("Nome");

        txtCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtCelular.setForeground(new java.awt.Color(0, 0, 0));

        lblEnder.setForeground(new java.awt.Color(0, 0, 0));
        lblEnder.setText("Endereço");

        lblTelFixo.setForeground(new java.awt.Color(0, 0, 0));
        lblTelFixo.setText("Tel. Fixo");

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.setForeground(new java.awt.Color(0, 0, 0));

        txtEnder.setBackground(new java.awt.Color(255, 255, 255));
        txtEnder.setForeground(new java.awt.Color(0, 0, 0));

        lblEnder7.setForeground(new java.awt.Color(0, 0, 0));
        lblEnder7.setText("E-mail");

        lblEnder5.setForeground(new java.awt.Color(0, 0, 0));
        lblEnder5.setText("Tel. Cel.");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));

        txtNome1.setBackground(new java.awt.Color(255, 255, 255));
        txtNome1.setForeground(new java.awt.Color(0, 0, 0));

        btnNovo1.setBackground(new java.awt.Color(255, 255, 255));
        btnNovo1.setForeground(new java.awt.Color(0, 0, 0));
        btnNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnNovo1.setMnemonic('N');
        btnNovo1.setText("Novo");

        btnCancelar1.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar1.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        btnCancelar1.setText("Cancelar");

        lblCEP.setForeground(new java.awt.Color(0, 0, 0));
        lblCEP.setText("CEP");

        txtCEP.setBackground(new java.awt.Color(255, 255, 255));
        txtCEP.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterar.setForeground(new java.awt.Color(0, 0, 0));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/repeat.png"))); // NOI18N
        btnAlterar.setMnemonic('A');
        btnAlterar.setText("Alterar");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PaineldeCad1Layout = new javax.swing.GroupLayout(PaineldeCad1);
        PaineldeCad1.setLayout(PaineldeCad1Layout);
        PaineldeCad1Layout.setHorizontalGroup(
            PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaineldeCad1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar1)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaineldeCad1Layout.createSequentialGroup()
                        .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelFixo)
                            .addComponent(lblEnder7))
                        .addGap(18, 18, 18)
                        .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(lblEnder5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCelular)
                                .addGap(6, 6, 6))
                            .addComponent(txtEmail)))
                    .addGroup(PaineldeCad1Layout.createSequentialGroup()
                        .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome1)
                            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCEP)
                                    .addComponent(lblEnder))))
                        .addGap(4, 4, 4)
                        .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtCEP)
                            .addComponent(txtEnder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PaineldeCad1Layout.setVerticalGroup(
            PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaineldeCad1Layout.createSequentialGroup()
                        .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome1)
                            .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCEP)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnder)
                            .addComponent(txtEnder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelFixo)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnder5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnder7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo1)
                    .addComponent(btnCancelar1)
                    .addComponent(btnAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FORM.add(PaineldeCad1);

        jScrollPane1.setViewportView(FORM);

        background.add(jScrollPane1);

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
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

        /* Create and display the dialog */
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
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblEnder;
    private javax.swing.JLabel lblEnder5;
    private javax.swing.JLabel lblEnder7;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblTelFixo;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnder;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
