package viwer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author 2023122760328
 */
public class DialogBuscaCli extends javax.swing.JDialog {

    /**
     * Creates new form Cadastro
     */
    public DialogBuscaCli(java.awt.Frame parent, boolean modal) {
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
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSabor = new javax.swing.JLabel();
        txtSabor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        spinValor = new javax.swing.JSpinner();
        lblPeso = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        lblComplem2 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setPreferredSize(new java.awt.Dimension(826, 620));

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
        PaineldeCad1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N
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
        painelEnderec.setLayout(new java.awt.GridLayout(6, 2, 15, 15));

        lblNome.setBackground(new java.awt.Color(255, 255, 255));
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Smile.png"))); // NOI18N
        lblNome.setText("Nome");
        lblNome.setAlignmentX(10.0F);
        lblNome.setAlignmentY(10.0F);
        painelEnderec.add(lblNome);

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setText("SKU10");
        txtNome.setAlignmentX(10.0F);
        txtNome.setAlignmentY(10.0F);
        txtNome.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        painelEnderec.add(txtNome);

        lblSabor.setForeground(new java.awt.Color(255, 255, 255));
        lblSabor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Retort.png"))); // NOI18N
        lblSabor.setText("Sabor");
        lblSabor.setAlignmentX(10.0F);
        lblSabor.setAlignmentY(10.0F);
        painelEnderec.add(lblSabor);

        txtSabor.setBackground(new java.awt.Color(255, 255, 255));
        txtSabor.setForeground(new java.awt.Color(0, 0, 0));
        txtSabor.setText("Eucalipto");
        txtSabor.setAlignmentX(10.0F);
        txtSabor.setAlignmentY(10.0F);
        txtSabor.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        painelEnderec.add(txtSabor);

        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Dollar.png"))); // NOI18N
        lblValor.setText("  Valor (R$)");
        lblValor.setAlignmentX(10.0F);
        lblValor.setAlignmentY(10.0F);
        painelEnderec.add(lblValor);

        spinValor.setModel(new javax.swing.SpinnerNumberModel(10.85d, 1.0d, null, 1.0d));
        spinValor.setAlignmentX(10.0F);
        spinValor.setAlignmentY(10.0F);
        spinValor.setAutoscrolls(true);
        painelEnderec.add(spinValor);

        lblPeso.setForeground(new java.awt.Color(255, 255, 255));
        lblPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Target.png"))); // NOI18N
        lblPeso.setText("Peso (G)");
        lblPeso.setAlignmentX(10.0F);
        lblPeso.setAlignmentY(10.0F);
        painelEnderec.add(lblPeso);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinner2.setAlignmentX(10.0F);
        jSpinner2.setAlignmentY(10.0F);
        jSpinner2.setAutoscrolls(true);
        painelEnderec.add(jSpinner2);

        lblComplem2.setForeground(new java.awt.Color(255, 255, 255));
        lblComplem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Table.png"))); // NOI18N
        lblComplem2.setText("Quantidade Em Estoque");
        lblComplem2.setAlignmentX(10.0F);
        lblComplem2.setAlignmentY(10.0F);
        painelEnderec.add(lblComplem2);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 10));
        jSpinner3.setAlignmentX(10.0F);
        jSpinner3.setAlignmentY(10.0F);
        jSpinner3.setAutoscrolls(true);
        painelEnderec.add(jSpinner3);

        javax.swing.GroupLayout PaineldeCad1Layout = new javax.swing.GroupLayout(PaineldeCad1);
        PaineldeCad1.setLayout(PaineldeCad1Layout);
        PaineldeCad1Layout.setHorizontalGroup(
            PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelEnderec, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaineldeCad1Layout.setVerticalGroup(
            PaineldeCad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldeCad1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelEnderec, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        FORM.add(PaineldeCad1);

        jScrollPane1.setViewportView(FORM);

        background.add(jScrollPane1);

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FORM;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PaineldeCad1;
    private javax.swing.JPanel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JLabel lblComplem2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSabor;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel painelEnderec;
    private javax.swing.JSpinner spinValor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSabor;
    // End of variables declaration//GEN-END:variables
}
