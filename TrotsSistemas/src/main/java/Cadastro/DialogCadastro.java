package Cadastro;

import Sistema.Endereco;
import Utils.MainUtils;
import Utils.SwingUtils;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

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
public class DialogCadastro extends javax.swing.JDialog {

    private File arq;

    /**
     * Creates new form Cadastro
     */
    public DialogCadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        arq = null;
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
        PaineldeCad = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();
        btnPesqCli = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtTel = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        painelEnderec = new javax.swing.JPanel();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        lblNum = new javax.swing.JLabel();
        txtNumResidencial = new javax.swing.JSpinner();
        labelRef = new javax.swing.JLabel();
        txtRef = new javax.swing.JTextField();
        lblComplem = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblLogradouro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox();
        lblUf = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(720, 720));
        setResizable(false);

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setForeground(new java.awt.Color(0, 0, 0));
        background.setAlignmentX(50.0F);
        background.setAlignmentY(50.0F);
        background.setMinimumSize(new java.awt.Dimension(720, 720));
        background.setPreferredSize(new java.awt.Dimension(720, 720));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20);
        flowLayout2.setAlignOnBaseline(true);
        background.setLayout(flowLayout2);

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
        FORM.setMinimumSize(new java.awt.Dimension(650, 720));
        FORM.setName(""); // NOI18N
        FORM.setPreferredSize(new java.awt.Dimension(650, 720));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 15);
        flowLayout1.setAlignOnBaseline(true);
        FORM.setLayout(flowLayout1);

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trots/Trots_com_Slogan_Logo_ico.png"))); // NOI18N
        Logo.setAlignmentX(50.0F);
        Logo.setAlignmentY(50.0F);
        FORM.add(Logo);

        PaineldeCad.setBackground(new java.awt.Color(204, 204, 204));
        PaineldeCad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        PaineldeCad.setForeground(new java.awt.Color(0, 0, 0));
        PaineldeCad.setAlignmentX(50.0F);
        PaineldeCad.setAlignmentY(50.0F);
        PaineldeCad.setAutoscrolls(true);
        PaineldeCad.setMaximumSize(new java.awt.Dimension(720, 620));
        PaineldeCad.setMinimumSize(new java.awt.Dimension(620, 560));
        PaineldeCad.setName(""); // NOI18N
        PaineldeCad.setPreferredSize(new java.awt.Dimension(620, 560));

        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setText("My name");
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNome.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnNovo.setBackground(new java.awt.Color(255, 255, 255));
        btnNovo.setForeground(new java.awt.Color(0, 0, 0));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnNovo.setMnemonic('N');
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblCpf.setForeground(new java.awt.Color(0, 0, 0));
        lblCpf.setText("CPF");

        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setText("999.999.999-99");

        btnAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterar.setForeground(new java.awt.Color(0, 0, 0));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/repeat.png"))); // NOI18N
        btnAlterar.setMnemonic('A');
        btnAlterar.setText("Alterar");
        btnAlterar.setAutoscrolls(true);
        btnAlterar.setEnabled(false);

        Foto.setBackground(new java.awt.Color(0, 0, 0));
        Foto.setForeground(new java.awt.Color(255, 255, 255));
        Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        Foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FotoMouseClicked(evt);
            }
        });
        Foto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FotoKeyPressed(evt);
            }
        });

        btnPesqCli.setBackground(new java.awt.Color(255, 255, 255));
        btnPesqCli.setForeground(new java.awt.Color(0, 0, 0));
        btnPesqCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/zoom_16x16.gif"))); // NOI18N
        btnPesqCli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesqCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCliActionPerformed(evt);
            }
        });

        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("E-MAIL");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setText("Email");
        txtEmail.setAlignmentX(10.0F);
        txtEmail.setAlignmentY(10.0F);
        txtEmail.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtEmail.setPreferredSize(new java.awt.Dimension(100, 26));

        lblTel.setBackground(new java.awt.Color(255, 255, 255));
        lblTel.setForeground(new java.awt.Color(0, 0, 0));
        lblTel.setText("Tel. Cel.");
        lblTel.setAlignmentX(10.0F);
        lblTel.setAlignmentY(10.0F);

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.setText("(99) 99999-9999");
        txtTel.setToolTipText("Telefone Celular");
        txtTel.setActionCommand("<Not Set>");
        txtTel.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setMinimumSize(new java.awt.Dimension(200, 200));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(400, 210));

        painelEnderec.setBackground(new java.awt.Color(51, 51, 51));
        painelEnderec.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.black));
        painelEnderec.setAlignmentX(10.0F);
        painelEnderec.setAlignmentY(10.0F);
        painelEnderec.setAutoscrolls(true);
        painelEnderec.setMinimumSize(new java.awt.Dimension(245, 350));
        painelEnderec.setPreferredSize(new java.awt.Dimension(300, 350));
        painelEnderec.setLayout(new java.awt.GridLayout(8, 2, 10, 10));

        lblCEP.setBackground(new java.awt.Color(255, 255, 255));
        lblCEP.setForeground(new java.awt.Color(255, 255, 255));
        lblCEP.setText("  CEP");
        lblCEP.setAlignmentX(10.0F);
        lblCEP.setAlignmentY(10.0F);
        painelEnderec.add(lblCEP);

        txtCEP.setBackground(new java.awt.Color(255, 255, 255));
        txtCEP.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setText("11111-111");
        txtCEP.setAlignmentX(10.0F);
        txtCEP.setAlignmentY(10.0F);
        txtCEP.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCEPFocusLost(evt);
            }
        });
        painelEnderec.add(txtCEP);

        lblNum.setForeground(new java.awt.Color(255, 255, 255));
        lblNum.setText("  Nº");
        lblNum.setAlignmentX(10.0F);
        lblNum.setAlignmentY(10.0F);
        painelEnderec.add(lblNum);

        txtNumResidencial.setModel(new javax.swing.SpinnerNumberModel());
        txtNumResidencial.setAlignmentX(10.0F);
        txtNumResidencial.setAlignmentY(10.0F);
        txtNumResidencial.setAutoscrolls(true);
        painelEnderec.add(txtNumResidencial);

        labelRef.setForeground(new java.awt.Color(255, 255, 255));
        labelRef.setText("  Referência");
        labelRef.setAlignmentX(10.0F);
        labelRef.setAlignmentY(10.0F);
        painelEnderec.add(labelRef);

        txtRef.setBackground(new java.awt.Color(255, 255, 255));
        txtRef.setForeground(new java.awt.Color(0, 0, 0));
        txtRef.setText("Ref");
        txtRef.setAlignmentX(10.0F);
        txtRef.setAlignmentY(10.0F);
        painelEnderec.add(txtRef);

        lblComplem.setForeground(new java.awt.Color(255, 255, 255));
        lblComplem.setText("  Complemento");
        lblComplem.setAlignmentX(10.0F);
        lblComplem.setAlignmentY(10.0F);
        painelEnderec.add(lblComplem);

        txtComplemento.setBackground(new java.awt.Color(255, 255, 255));
        txtComplemento.setForeground(new java.awt.Color(0, 0, 0));
        txtComplemento.setText("Compl");
        txtComplemento.setAlignmentX(10.0F);
        txtComplemento.setAlignmentY(10.0F);
        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });
        painelEnderec.add(txtComplemento);

        lblLogradouro.setForeground(new java.awt.Color(255, 255, 255));
        lblLogradouro.setText("  Logradouro");
        lblLogradouro.setAlignmentX(10.0F);
        lblLogradouro.setAlignmentY(10.0F);
        painelEnderec.add(lblLogradouro);

        txtLogradouro.setBackground(new java.awt.Color(255, 255, 255));
        txtLogradouro.setForeground(new java.awt.Color(0, 0, 0));
        txtLogradouro.setText("Ender");
        txtLogradouro.setAlignmentX(10.0F);
        txtLogradouro.setAlignmentY(10.0F);
        txtLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogradouroActionPerformed(evt);
            }
        });
        painelEnderec.add(txtLogradouro);

        bairroLabel.setForeground(new java.awt.Color(255, 255, 255));
        bairroLabel.setText("  Bairro");
        bairroLabel.setAlignmentX(10.0F);
        bairroLabel.setAlignmentY(10.0F);
        painelEnderec.add(bairroLabel);

        txtBairro.setBackground(new java.awt.Color(255, 255, 255));
        txtBairro.setForeground(new java.awt.Color(0, 0, 0));
        txtBairro.setText("Bairro");
        txtBairro.setAlignmentX(10.0F);
        txtBairro.setAlignmentY(10.0F);
        painelEnderec.add(txtBairro);

        lblCidade.setBackground(new java.awt.Color(255, 255, 255));
        lblCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCidade.setText("  Cidade");
        lblCidade.setAlignmentX(10.0F);
        lblCidade.setAlignmentY(10.0F);
        painelEnderec.add(lblCidade);

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Um", "Vitória", "Colatina", "Aracruz", "Baixo Guandu" }));
        cmbCidade.setAlignmentX(10.0F);
        cmbCidade.setAlignmentY(10.0F);
        painelEnderec.add(cmbCidade);

        lblUf.setForeground(new java.awt.Color(255, 255, 255));
        lblUf.setText("  Estado");
        lblUf.setAlignmentX(10.0F);
        lblUf.setAlignmentY(10.0F);
        painelEnderec.add(lblUf);

        txtUf.setBackground(new java.awt.Color(255, 255, 255));
        txtUf.setForeground(new java.awt.Color(0, 0, 0));
        txtUf.setText("Estado");
        txtUf.setAlignmentX(10.0F);
        txtUf.setAlignmentY(10.0F);
        painelEnderec.add(txtUf);

        jScrollPane2.setViewportView(painelEnderec);

        btnDeletar.setBackground(new java.awt.Color(255, 255, 255));
        btnDeletar.setForeground(new java.awt.Color(0, 0, 0));
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/user2_(delete)_16x16.gif"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setEnabled(false);

        javax.swing.GroupLayout PaineldeCadLayout = new javax.swing.GroupLayout(PaineldeCad);
        PaineldeCad.setLayout(PaineldeCadLayout);
        PaineldeCadLayout.setHorizontalGroup(
            PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldeCadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PaineldeCadLayout.createSequentialGroup()
                        .addGroup(PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNome))
                            .addComponent(lblEmail)
                            .addComponent(lblTel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf)
                            .addComponent(txtNome)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(txtTel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaineldeCadLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        PaineldeCadLayout.setVerticalGroup(
            PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldeCadLayout.createSequentialGroup()
                .addGroup(PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaineldeCadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesqCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNome)
                                .addComponent(txtNome)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTel)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PaineldeCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo)
                    .addComponent(btnDeletar))
                .addContainerGap())
        );

        FORM.add(PaineldeCad);

        jScrollPane1.setViewportView(FORM);

        background.add(jScrollPane1);

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void txtLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogradouroActionPerformed

    private void FotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FotoMouseClicked
        // TODO add your handling code here:
        MostrarFoto();
    }//GEN-LAST:event_FotoMouseClicked

    private void FotoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FotoKeyPressed
        // TODO add your handling code here:
        MostrarFoto();

    }//GEN-LAST:event_FotoKeyPressed

    private void btnPesqCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesqCliActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        String email = txtEmail.getText();
        String tel = txtTel.getText();
        String cep = txtCEP.getText();
        String cidade = cmbCidade.getSelectedItem().toString();

        if (validarCampos()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Usuario: " + nome + ". Cadastrado com sucesso!",
                    "Cadastro de Cliente",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private boolean validarCampos() {
        String msgError = "";
        String cpf = txtCpf.getText();

        lblNome.setForeground(Color.black);
        lblCEP.setForeground(Color.white);
        lblEmail.setForeground(Color.black);
        lblCpf.setForeground(Color.black);

        if (txtNome.getText().isEmpty()) {
            msgError = msgError + "Digite seu nome.\n";
            lblNome.setForeground(Color.red);
        }
        if (txtCEP.getText().isEmpty()) {
            msgError = msgError + "Digite seu CEP.\n";
            lblCEP.setForeground(Color.red);
        }
        if (txtEmail.getText().isEmpty()) {
            msgError = msgError + "Digite seu EMAIL.\n";
            lblEmail.setForeground(Color.red);
        }
        if (cpf.isEmpty()) {
            msgError = msgError + "Digite seu CPF.\n";
            lblCpf.setForeground(Color.red);
        }
        if (!MainUtils.ValidarCPF(cpf)) {
            msgError = msgError + "CPF inválido!.\n";
            lblCpf.setForeground(Color.red);
        }

        if (msgError.isEmpty()) {
//            não a erros
            return true;
        } else {
            //            mostra o erro
            JOptionPane.showMessageDialog(
                    this,
                    msgError,
                    "CADASTRO DE CLIENTE",
                    JOptionPane.ERROR_MESSAGE
            );
            return false;
        }
    }

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCEPFocusLost
        // TODO add your handling code here:
        try {
            JOptionPane.showMessageDialog(
                    this,
                    "Consultando Integração...",
                    "Busca Cep",
                    JOptionPane.INFORMATION_MESSAGE
            );
            Endereco ender = MainUtils.consultarCEP(txtCEP.getText());

            if (ender != null) {
                txtLogradouro.setText(ender.getLogradouro());
                txtUf.setText(ender.getUf());
                txtBairro.setText(ender.getBairro());
                txtRef.setText(ender.getReferencia());
                cmbCidade.setSelectedItem(ender.getCidade());

                SwingUtils.toggleEnabledAndEditable(txtLogradouro);
                SwingUtils.toggleEnabledAndEditable(txtUf);
                SwingUtils.toggleEnabledAndEditable(txtBairro);
                SwingUtils.toggleEnabledAndEditable(txtRef);
            } else {
                JOptionPane.showMessageDialog(
                        this,
                        "CEP Invalido!",
                        "CADASTRO DE CLIENTE",
                        JOptionPane.ERROR_MESSAGE
                );
                SwingUtils.toggleEnabledAndEditable(txtLogradouro);
                SwingUtils.toggleEnabledAndEditable(txtUf);
                SwingUtils.toggleEnabledAndEditable(txtBairro);
                SwingUtils.toggleEnabledAndEditable(txtRef);
            }
        } catch (IOException ex) {
            Logger.getLogger(DialogCadastro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    this,
                    ex,
                    "CADASTRO DE CLIENTE",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_txtCEPFocusLost


    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void habilitarSpiner(JCheckBox chk, JSpinner spn) {
        if (chk.isSelected()) {
            spn.setEnabled(true);
        } else {
            spn.setEnabled(false);
            spn.setValue(0);
        }
    }

    private void MostrarFoto() {
        JFileChooser fileWindow = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagens", "png", "jpeg", "gif", "jpg");

        //        config da janela
        fileWindow.setMultiSelectionEnabled(false);
        fileWindow.setAcceptAllFileFilterUsed(false);
        fileWindow.setFileFilter(filtro);

        // Abrir no último diretório aberto. Na primeira vez é NULL
        fileWindow.setCurrentDirectory(arq);

        if (fileWindow.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File arq = fileWindow.getSelectedFile();
            ImageIcon foto = new ImageIcon(arq.getPath());

            // Redimensionar
            Image imagem = foto.getImage();
            Image Scale = imagem.getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_DEFAULT);
            foto.setImage(Scale);
            Foto.setIcon(foto);
        }
    }

    private void limparCampos() {
        txtNome.setText("");
        txtCpf.setText("");
        txtTel.setText("");
        txtEmail.setText("");
        Foto.setText("Foto");
        Foto.setIcon(null);

        txtCEP.setText("");
        txtLogradouro.setText("");
        txtNumResidencial.setValue(0);
        txtComplemento.setText("");
        txtBairro.setText("");
        txtRef.setText("");
        cmbCidade.setSelectedIndex(0);
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
                if ("Metal".equals(info.getName())) {
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
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PaineldeCad;
    private javax.swing.JPanel background;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesqCli;
    private javax.swing.JComboBox cmbCidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelRef;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplem;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblUf;
    private javax.swing.JPanel painelEnderec;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JSpinner txtNumResidencial;
    private javax.swing.JTextField txtRef;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables

}
