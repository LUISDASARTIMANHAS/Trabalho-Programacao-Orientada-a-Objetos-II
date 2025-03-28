package viwer;

import LDAUtils.swing.LDASwingUtils;
import control.GUIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license Click
 * nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this
 * template
 */
/**
 *
 * @author 2023122760328
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        GrpTema = new javax.swing.ButtonGroup();
        Background = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        CadCliente = new javax.swing.JMenuItem();
        CadProduto = new javax.swing.JMenuItem();
        CadPedido = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        ConsultaCliente = new javax.swing.JMenuItem();
        ConsultaProduto = new javax.swing.JMenuItem();
        ConsultaPedido = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        RelatorioCliente = new javax.swing.JMenuItem();
        Relatorioprodutos = new javax.swing.JMenuItem();
        RelatorioPedidos = new javax.swing.JMenuItem();
        menuUtilitarios = new javax.swing.JMenu();
        MenuTema = new javax.swing.JMenu();
        WinTema = new javax.swing.JRadioButtonMenuItem();
        MotifTema = new javax.swing.JRadioButtonMenuItem();
        NimbusTema = new javax.swing.JRadioButtonMenuItem();
        MetalTema = new javax.swing.JRadioButtonMenuItem();
        DarkTema = new javax.swing.JRadioButtonMenuItem();
        LightTema = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trots Sistemas - gestão de Vendas");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1024, 292));
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trots/Trots_Novos_desktop_1024x292.png"))); // NOI18N
        Background.setAutoscrolls(true);
        getContentPane().add(Background, java.awt.BorderLayout.CENTER);

        menuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Add.png"))); // NOI18N
        menuCadastro.setMnemonic('c');
        menuCadastro.setText("Cadastros");

        CadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Person.png"))); // NOI18N
        CadCliente.setText("Cliente");
        CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(CadCliente);

        CadProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/shopping_cart_(add)_16x16.gif"))); // NOI18N
        CadProduto.setText("Produto");
        CadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(CadProduto);

        CadPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CadPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Dollar.png"))); // NOI18N
        CadPedido.setText("Venda");
        CadPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadPedidoActionPerformed(evt);
            }
        });
        menuCadastro.add(CadPedido);

        Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Turn off.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        menuCadastro.add(Sair);

        menu.add(menuCadastro);

        menuConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        menuConsulta.setMnemonic('p');
        menuConsulta.setText("Consultas");

        ConsultaCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ConsultaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Person.png"))); // NOI18N
        ConsultaCliente.setText("Cliente");
        ConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteActionPerformed(evt);
            }
        });
        menuConsulta.add(ConsultaCliente);

        ConsultaProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ConsultaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/shopping_cart_16x16.gif"))); // NOI18N
        ConsultaProduto.setText("Produto");
        ConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaProdutoActionPerformed(evt);
            }
        });
        menuConsulta.add(ConsultaProduto);

        ConsultaPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ConsultaPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Dollar.png"))); // NOI18N
        ConsultaPedido.setText("Venda");
        ConsultaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaPedidoActionPerformed(evt);
            }
        });
        menuConsulta.add(ConsultaPedido);

        menu.add(menuConsulta);

        menuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Table.png"))); // NOI18N
        menuRelatorios.setMnemonic('r');
        menuRelatorios.setText("Relatórios");

        RelatorioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Person.png"))); // NOI18N
        RelatorioCliente.setText("Clientes");
        RelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioClienteActionPerformed(evt);
            }
        });
        menuRelatorios.add(RelatorioCliente);

        Relatorioprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/shopping_cart_16x16.gif"))); // NOI18N
        Relatorioprodutos.setText("Produtos");
        menuRelatorios.add(Relatorioprodutos);

        RelatorioPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Dollar.png"))); // NOI18N
        RelatorioPedidos.setText("Vendas");
        menuRelatorios.add(RelatorioPedidos);

        menu.add(menuRelatorios);

        menuUtilitarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/settings1_16x16.gif"))); // NOI18N
        menuUtilitarios.setMnemonic('u');
        menuUtilitarios.setText("Utilitarios");

        MenuTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/settings2_16x16.gif"))); // NOI18N
        MenuTema.setText("Temas");

        GrpTema.add(WinTema);
        WinTema.setMnemonic('W');
        WinTema.setSelected(true);
        WinTema.setText("Windows");
        WinTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MudarTemaActionPerformed(evt);
            }
        });
        MenuTema.add(WinTema);

        GrpTema.add(MotifTema);
        MotifTema.setMnemonic('F');
        MotifTema.setText("Motif");
        MotifTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MudarTemaActionPerformed(evt);
            }
        });
        MenuTema.add(MotifTema);

        GrpTema.add(NimbusTema);
        NimbusTema.setMnemonic('N');
        NimbusTema.setText("Nimbus");
        NimbusTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MudarTemaActionPerformed(evt);
            }
        });
        MenuTema.add(NimbusTema);

        GrpTema.add(MetalTema);
        MetalTema.setMnemonic('M');
        MetalTema.setText("Metal");
        MetalTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MudarTemaActionPerformed(evt);
            }
        });
        MenuTema.add(MetalTema);

        GrpTema.add(DarkTema);
        DarkTema.setMnemonic('D');
        DarkTema.setText("Dark");
        DarkTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MudarTemaActionPerformed(evt);
            }
        });
        MenuTema.add(DarkTema);

        GrpTema.add(LightTema);
        LightTema.setMnemonic('L');
        LightTema.setText("Light");
        LightTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MudarTemaActionPerformed(evt);
            }
        });
        MenuTema.add(LightTema);

        menuUtilitarios.add(MenuTema);

        menu.add(menuUtilitarios);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
        // TODO add your handling code here:
        GUIManager gui = GUIManager.getMyInstance();
        gui.abrirCadCli();
    }//GEN-LAST:event_CadClienteActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        GUIManager gui = GUIManager.getMyInstance();
        gui.sair();
    }//GEN-LAST:event_SairActionPerformed

    private void ConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaProdutoActionPerformed
        // TODO add your handling code here:
        GUIManager gui = GUIManager.getMyInstance();
        gui.abrirBuscaProd();
    }//GEN-LAST:event_ConsultaProdutoActionPerformed

    private void RelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioClienteActionPerformed
        // TODO add your handling code here:
        GUIManager gui = GUIManager.getMyInstance();
        gui.abrirRelatorioCli();
    }//GEN-LAST:event_RelatorioClienteActionPerformed

    private void CadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadProdutoActionPerformed
        // TODO add your handling code here:
        GUIManager gui = GUIManager.getMyInstance();
        gui.abrirCadProd();
    }//GEN-LAST:event_CadProdutoActionPerformed

    private void CadPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadPedidoActionPerformed
        // TODO add your handling code here:
        GUIManager gui = GUIManager.getMyInstance();
        gui.abrirCadVenda();
    }//GEN-LAST:event_CadPedidoActionPerformed

    private void ConsultaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaPedidoActionPerformed
        // TODO add your handling code here:
        GUIManager gui = GUIManager.getMyInstance();
        gui.abrirBuscaProd();
    }//GEN-LAST:event_ConsultaPedidoActionPerformed

    private void ConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteActionPerformed
        // TODO add your handling code here:
        GUIManager gui = GUIManager.getMyInstance();
        gui.abrirBuscaCli();
    }//GEN-LAST:event_ConsultaClienteActionPerformed

    private void MudarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MudarTemaActionPerformed
        // TODO add your handling code here:
        TrocarLookAndFeel(GrpTema.getSelection().getMnemonic());
    }//GEN-LAST:event_MudarTemaActionPerformed

    private void TrocarLookAndFeel(int NomeLook) {
        String lookAndFeel = switch (NomeLook) {
            case 'W' ->
                "Windows";
            case 'M' ->
                "Metal";
            case 'F' ->
                "CDE/Motif";
            case 'N' ->
                "Nimbus";
            case 'L' ->
                "com.formdev.flatlaf.FlatLightLaf";
            case 'D' ->
                "com.formdev.flatlaf.FlatDarkLaf";
            default ->
                "Metal";
        };
        LDASwingUtils.ChangeLookAndFeel("Principal", lookAndFeel, this);
        pack();
        System.out.println("Look: " + lookAndFeel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JMenuItem CadCliente;
    private javax.swing.JMenuItem CadPedido;
    private javax.swing.JMenuItem CadProduto;
    private javax.swing.JMenuItem ConsultaCliente;
    private javax.swing.JMenuItem ConsultaPedido;
    private javax.swing.JMenuItem ConsultaProduto;
    private javax.swing.JRadioButtonMenuItem DarkTema;
    private javax.swing.ButtonGroup GrpTema;
    private javax.swing.JRadioButtonMenuItem LightTema;
    private javax.swing.JMenu MenuTema;
    private javax.swing.JRadioButtonMenuItem MetalTema;
    private javax.swing.JRadioButtonMenuItem MotifTema;
    private javax.swing.JRadioButtonMenuItem NimbusTema;
    private javax.swing.JMenuItem RelatorioCliente;
    private javax.swing.JMenuItem RelatorioPedidos;
    private javax.swing.JMenuItem Relatorioprodutos;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JRadioButtonMenuItem WinTema;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuUtilitarios;
    // End of variables declaration//GEN-END:variables
}
