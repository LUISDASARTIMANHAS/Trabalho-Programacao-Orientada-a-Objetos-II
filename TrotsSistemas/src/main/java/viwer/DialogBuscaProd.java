package viwer;

import control.GUIManager;
import domain.Erva;
import swing.LDASwingUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license Click
 * nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this
 * template
 */
/**
 *
 * @author LUIS DAS ARTIMANHAS
 */
public class DialogBuscaProd extends javax.swing.JDialog {

    private Erva ProdutoSelecionado = null;
    /**
     * Creates new form Cadastro
     */

    public DialogBuscaProd(java.awt.Frame parent, boolean modal) {
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
        painelEnderec = new javax.swing.JPanel();
        lblProd = new javax.swing.JLabel();
        cmbProd = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        spnPeso = new javax.swing.JSpinner();
        lblObs = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        lblEstoque = new javax.swing.JLabel();
        spnEstoque = new javax.swing.JSpinner();
        btnSelecionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblWait = new javax.swing.JButton();
        lblWait1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

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
        PaineldeCad1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        PaineldeCad1.setForeground(new java.awt.Color(0, 0, 0));
        PaineldeCad1.setAlignmentX(50.0F);
        PaineldeCad1.setAlignmentY(50.0F);
        PaineldeCad1.setMaximumSize(new java.awt.Dimension(300, 500));
        PaineldeCad1.setMinimumSize(new java.awt.Dimension(300, 300));

        painelEnderec.setBackground(new java.awt.Color(51, 51, 51));
        painelEnderec.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.black));
        painelEnderec.setAlignmentX(50.0F);
        painelEnderec.setAlignmentY(50.0F);
        painelEnderec.setAutoscrolls(true);
        painelEnderec.setLayout(new java.awt.GridLayout(5, 2, 15, 15));

        lblProd.setBackground(new java.awt.Color(255, 255, 255));
        lblProd.setForeground(new java.awt.Color(255, 255, 255));
        lblProd.setText("Produto");
        painelEnderec.add(lblProd);

        cmbProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Um", "Aqui vai ter o select do banco de dados" }));
        cmbProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdActionPerformed(evt);
            }
        });
        painelEnderec.add(cmbProd);

        lblNome.setBackground(new java.awt.Color(255, 255, 255));
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Smile.png"))); // NOI18N
        lblNome.setText("Nome");
        lblNome.setAlignmentX(10.0F);
        lblNome.setAlignmentY(10.0F);
        painelEnderec.add(lblNome);

        txtNome.setEditable(false);
        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setText("Selecione um");
        txtNome.setAlignmentX(10.0F);
        txtNome.setAlignmentY(10.0F);
        txtNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNome.setEnabled(false);
        painelEnderec.add(txtNome);

        lblPeso.setForeground(new java.awt.Color(255, 255, 255));
        lblPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Target.png"))); // NOI18N
        lblPeso.setText("Peso (G)");
        lblPeso.setAlignmentX(10.0F);
        lblPeso.setAlignmentY(10.0F);
        painelEnderec.add(lblPeso);

        spnPeso.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnPeso.setAlignmentX(10.0F);
        spnPeso.setAlignmentY(10.0F);
        spnPeso.setAutoscrolls(true);
        spnPeso.setEnabled(false);
        painelEnderec.add(spnPeso);

        lblObs.setBackground(new java.awt.Color(255, 255, 255));
        lblObs.setForeground(new java.awt.Color(255, 255, 255));
        lblObs.setText("Descrição");
        painelEnderec.add(lblObs);

        txtObs.setEditable(false);
        txtObs.setBackground(new java.awt.Color(255, 255, 255));
        txtObs.setForeground(new java.awt.Color(0, 0, 0));
        txtObs.setText("Selecione um");
        txtObs.setAlignmentX(10.0F);
        txtObs.setAlignmentY(10.0F);
        txtObs.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtObs.setEnabled(false);
        txtObs.setMinimumSize(new java.awt.Dimension(100, 26));
        painelEnderec.add(txtObs);

        lblEstoque.setForeground(new java.awt.Color(255, 255, 255));
        lblEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Table.png"))); // NOI18N
        lblEstoque.setText("Quantidade Em Estoque");
        lblEstoque.setAlignmentX(10.0F);
        lblEstoque.setAlignmentY(10.0F);
        painelEnderec.add(lblEstoque);

        spnEstoque.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 10));
        spnEstoque.setAlignmentX(10.0F);
        spnEstoque.setAlignmentY(10.0F);
        spnEstoque.setAutoscrolls(true);
        spnEstoque.setEnabled(false);
        painelEnderec.add(spnEstoque);

        btnSelecionar.setBackground(new java.awt.Color(255, 255, 255));
        btnSelecionar.setForeground(new java.awt.Color(0, 0, 0));
        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/png/16x16/accept.png"))); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Abort.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblWait.setBackground(new java.awt.Color(255, 255, 255));
        lblWait.setForeground(new java.awt.Color(0, 0, 0));
        lblWait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/wait_16x16.gif"))); // NOI18N
        lblWait.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblWait.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        lblWait.setMaximumSize(new java.awt.Dimension(30, 30));
        lblWait.setMinimumSize(new java.awt.Dimension(30, 30));
        lblWait.setPreferredSize(new java.awt.Dimension(30, 30));

        lblWait1.setBackground(new java.awt.Color(255, 255, 255));
        lblWait1.setForeground(new java.awt.Color(0, 0, 0));
        lblWait1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/wait_16x16.gif"))); // NOI18N
        lblWait1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblWait1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

        javax.swing.GroupLayout PaineldeCad1Layout = new javax.swing.GroupLayout(PaineldeCad1);
        PaineldeCad1.setLayout(PaineldeCad1Layout);
        PaineldeCad1Layout.setHorizontalGroup(
            PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaineldeCad1Layout.createSequentialGroup()
                            .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(painelEnderec, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblWait, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PaineldeCad1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblWait1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PaineldeCad1Layout.setVerticalGroup(
            PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWait, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelEnderec, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionar)
                    .addComponent(btnCancelar)))
            .addGroup(PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PaineldeCad1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblWait1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        FORM.add(PaineldeCad1);

        jScrollPane1.setViewportView(FORM);

        background.add(jScrollPane1);

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        GUIManager gui = GUIManager.getMyInstance();
        gui.carregarCombo(cmbProd, Erva.class);
        lblWait.setVisible(false);
    }//GEN-LAST:event_formComponentShown

    private void cmbProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdActionPerformed
        // TODO add your handling code here:
//        ao selecionar um item atualizar os txt
        Erva erva = (Erva) cmbProd.getSelectedItem();
        if (erva != null) {
            txtNome.setText(erva.getNome());
            spnPeso.setValue(erva.getPeso());
            spnEstoque.setValue(erva.getQtdeEstoque());
            txtObs.setText(erva.getDescricao());
        }
    }//GEN-LAST:event_cmbProdActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        Erva erva = (Erva) cmbProd.getSelectedItem();
        if (erva != null) {
            ProdutoSelecionado = erva;
            this.setVisible(false);
        } else {
            LDASwingUtils.messageError(this, "Selecione um Produto!", "BUSCAR PRODUTOS");
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ProdutoSelecionado = null;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FORM;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PaineldeCad1;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JComboBox<String> cmbProd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblProd;
    private javax.swing.JButton lblWait;
    private javax.swing.JButton lblWait1;
    private javax.swing.JPanel painelEnderec;
    private javax.swing.JSpinner spnEstoque;
    private javax.swing.JSpinner spnPeso;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObs;
    // End of variables declaration//GEN-END:variables

    public Erva getErvaSelecionada() {
        return ProdutoSelecionado;
    }

}
