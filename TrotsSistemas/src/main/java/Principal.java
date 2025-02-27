/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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

        Background = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        CadCliente = new javax.swing.JMenuItem();
        CadProduto = new javax.swing.JMenuItem();
        CadPedido = new javax.swing.JMenuItem();
        CadListadePreco = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        ConsultaCliente = new javax.swing.JMenuItem();
        ConsultaProduto = new javax.swing.JMenuItem();
        ConsultaPedido = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        RelatorioCliente = new javax.swing.JMenuItem();
        RelatorioPedidos = new javax.swing.JMenuItem();
        Relatorioprodutos = new javax.swing.JMenuItem();
        RelatorioListadePrecos = new javax.swing.JMenuItem();
        menuUtilitarios = new javax.swing.JMenu();
        MenuDelete = new javax.swing.JMenu();
        DeletarCliente = new javax.swing.JMenuItem();
        DeletarProduto = new javax.swing.JMenuItem();
        DeletarPrecos = new javax.swing.JMenuItem();
        MenuTema = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trots Sistemas - gestão de Vendas");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1024, 296));
        setResizable(false);

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
        CadPedido.setText("Pedido");
        CadPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadPedidoActionPerformed(evt);
            }
        });
        menuCadastro.add(CadPedido);

        CadListadePreco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CadListadePreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/table_(add)_16x16.gif"))); // NOI18N
        CadListadePreco.setText("Lista de Preço");
        CadListadePreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadListadePrecoActionPerformed(evt);
            }
        });
        menuCadastro.add(CadListadePreco);

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
        ConsultaPedido.setText("Pedido");
        menuConsulta.add(ConsultaPedido);

        menu.add(menuConsulta);

        menuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/Table.png"))); // NOI18N
        menuRelatorios.setMnemonic('r');
        menuRelatorios.setText("Relatórios");

        RelatorioCliente.setText("Clientes");
        RelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioClienteActionPerformed(evt);
            }
        });
        menuRelatorios.add(RelatorioCliente);

        RelatorioPedidos.setText("Pedidos");
        menuRelatorios.add(RelatorioPedidos);

        Relatorioprodutos.setText("Produtos");
        menuRelatorios.add(Relatorioprodutos);

        RelatorioListadePrecos.setText("Lista de Preços");
        menuRelatorios.add(RelatorioListadePrecos);

        menu.add(menuRelatorios);

        menuUtilitarios.setMnemonic('u');
        menuUtilitarios.setText("Utilitarios");

        MenuDelete.setText("Remover");

        DeletarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        DeletarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16x16/user2_(delete)_16x16.gif"))); // NOI18N
        DeletarCliente.setText("Cliente");
        MenuDelete.add(DeletarCliente);

        DeletarProduto.setText("Produto");
        MenuDelete.add(DeletarProduto);

        DeletarPrecos.setText("Preços");
        MenuDelete.add(DeletarPrecos);

        menuUtilitarios.add(MenuDelete);

        MenuTema.setText("Temas");
        menuUtilitarios.add(MenuTema);

        menu.add(menuUtilitarios);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
        // TODO add your handling code here:
        DialogCadastro tela = new DialogCadastro(this, true);
        
        tela.setVisible(true);
    }//GEN-LAST:event_CadClienteActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void ConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultaProdutoActionPerformed

    private void RelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RelatorioClienteActionPerformed

    private void CadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadProdutoActionPerformed
        // TODO add your handling code here:
        DialogCadastroProduto tela = new DialogCadastroProduto(this, true);
        
        tela.setVisible(true);
    }//GEN-LAST:event_CadProdutoActionPerformed

    private void CadPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadPedidoActionPerformed
        // TODO add your handling code here:
        DialogCadastroPedido tela = new DialogCadastroPedido(this, true);
        
        tela.setVisible(true);
    }//GEN-LAST:event_CadPedidoActionPerformed

    private void CadListadePrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadListadePrecoActionPerformed
        // TODO add your handling code here:
        DialogCadastroListaPreco tela = new DialogCadastroListaPreco(this, true);
        
        tela.setVisible(true);
    }//GEN-LAST:event_CadListadePrecoActionPerformed

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
                System.out.println(info.getName());
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JMenuItem CadCliente;
    private javax.swing.JMenuItem CadListadePreco;
    private javax.swing.JMenuItem CadPedido;
    private javax.swing.JMenuItem CadProduto;
    private javax.swing.JMenuItem ConsultaCliente;
    private javax.swing.JMenuItem ConsultaPedido;
    private javax.swing.JMenuItem ConsultaProduto;
    private javax.swing.JMenuItem DeletarCliente;
    private javax.swing.JMenuItem DeletarPrecos;
    private javax.swing.JMenuItem DeletarProduto;
    private javax.swing.JMenu MenuDelete;
    private javax.swing.JMenu MenuTema;
    private javax.swing.JMenuItem RelatorioCliente;
    private javax.swing.JMenuItem RelatorioListadePrecos;
    private javax.swing.JMenuItem RelatorioPedidos;
    private javax.swing.JMenuItem Relatorioprodutos;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuUtilitarios;
    // End of variables declaration//GEN-END:variables
}
