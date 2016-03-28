/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Amostra;
import com.dmodena.model.NumberValidator;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Classe principal para armazenamento de dados e cálculos de valores estatísticos.
 * @author dmodena
 */
public class FrmAmostra extends javax.swing.JFrame {
    private final String VERSAO = "1.2.1";
    Amostra amostra;
    NumberValidator numberValidator;
    ArrayList<Double> valores;
    DefaultListModel<String> modelAmostra;
    
    /**
     * Creates new form FrmAmostra
     */
    public FrmAmostra() {
        initComponents();
        this.setLocationRelativeTo(null);
        limparObjetos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstValores = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        lblQtdValores = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfMedia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfMediana = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfVariancia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfDesvioPadrao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCoeficienteVariacao = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuOutros = new javax.swing.JMenu();
        mnuItemModa = new javax.swing.JMenuItem();
        mnuItemQuantis = new javax.swing.JMenuItem();
        mnuLimpar = new javax.swing.JMenu();
        mnuItemTudo = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("sdHelper - Geral");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));

        jLabel1.setText("Insira cada valor abaixo e clique em Incluir");

        jLabel2.setLabelFor(tfValor);
        jLabel2.setText("Valor");

        tfValor.setToolTipText("Valor a ser adicionado. Use ponto (.) para separar as casas decimais.");
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.setToolTipText("Inclui o valor no grupo de valores.");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        lstValores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstValores.setToolTipText("Valores incluídos para cálculo.");
        lstValores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstValoresValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstValores);

        jLabel3.setLabelFor(lstValores);
        jLabel3.setText("Valores");

        btnExcluir.setText("Excluir Valor");
        btnExcluir.setToolTipText("Exclui o valor selecionado da lista.");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.setToolTipText("Calcula os valores abaixo de acordo com números inseridos.");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblQtdValores.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQtdValores)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(tfValor))
                    .addComponent(btnIncluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQtdValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jLabel4.setLabelFor(tfMedia);
        jLabel4.setText("Média");

        tfMedia.setToolTipText("Média aritmética dos valores inseridos.");
        tfMedia.setDisabledTextColor(java.awt.Color.black);
        tfMedia.setEnabled(false);

        jLabel5.setLabelFor(tfMediana);
        jLabel5.setText("Mediana");

        tfMediana.setToolTipText("Mediana dos valores inseridos.");
        tfMediana.setDisabledTextColor(java.awt.Color.black);
        tfMediana.setEnabled(false);

        jLabel6.setLabelFor(tfVariancia);
        jLabel6.setText("Variância");

        tfVariancia.setToolTipText("Variância dos valores inseridos.");
        tfVariancia.setDisabledTextColor(java.awt.Color.black);
        tfVariancia.setEnabled(false);

        jLabel7.setLabelFor(tfDesvioPadrao);
        jLabel7.setText("Desvio Padrão");

        tfDesvioPadrao.setToolTipText("Desvio padrão dos valores inseridos.");
        tfDesvioPadrao.setDisabledTextColor(java.awt.Color.black);
        tfDesvioPadrao.setEnabled(false);

        jLabel8.setLabelFor(tfCoeficienteVariacao);
        jLabel8.setText("Coeficiente de Variação");

        tfCoeficienteVariacao.setToolTipText("Coeficiente de variação dos valores inseridos. Multiplique por 100 para obter porcentagem.");
        tfCoeficienteVariacao.setDisabledTextColor(java.awt.Color.black);
        tfCoeficienteVariacao.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCoeficienteVariacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfDesvioPadrao, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfMedia, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(tfMediana)
                                .addComponent(tfVariancia)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfMediana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfVariancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfDesvioPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfCoeficienteVariacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        mnuOutros.setText("Outros");

        mnuItemModa.setText("Moda");
        mnuItemModa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemModaActionPerformed(evt);
            }
        });
        mnuOutros.add(mnuItemModa);

        mnuItemQuantis.setText("Quantis");
        mnuItemQuantis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemQuantisActionPerformed(evt);
            }
        });
        mnuOutros.add(mnuItemQuantis);

        jMenuBar1.add(mnuOutros);

        mnuLimpar.setText("Limpar");

        mnuItemTudo.setText("Tudo");
        mnuItemTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemTudoActionPerformed(evt);
            }
        });
        mnuLimpar.add(mnuItemTudo);

        jMenuBar1.add(mnuLimpar);

        mnuAjuda.setText("Ajuda");

        mnuItemSobre.setText("Sobre...");
        mnuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemSobreActionPerformed(evt);
            }
        });
        mnuAjuda.add(mnuItemSobre);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        if(valorValido()) {
            valores = new ArrayList<>();        
        
            amostra.adicionarNumero(Double.parseDouble(tfValor.getText()));        
            valores = amostra.getValores();        

            atualizarLista();            
        }        
        
        limparValor();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if(valores.size() > 0) {
            DecimalFormat df = new DecimalFormat("#.######");
            String media, mediana, variancia, desvioPadrao, coeficienteVariacao;
            
            media = df.format(amostra.getMedia());
            mediana = df.format(amostra.getMediana());
            variancia = df.format(amostra.getVariancia());
            desvioPadrao = df.format(amostra.getDesvioPadrao());
            coeficienteVariacao = df.format(amostra.getCoeficienteVariacao());
                        
            tfMedia.setText(media);
            tfMediana.setText(mediana);
            tfVariancia.setText(variancia);
            tfDesvioPadrao.setText(desvioPadrao);
            tfCoeficienteVariacao.setText(coeficienteVariacao);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void lstValoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstValoresValueChanged
        checaHabilitaExclusao();
    }//GEN-LAST:event_lstValoresValueChanged

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String unformatted = lstValores.getSelectedValue();        
        Double valor = Double.parseDouble(unformatted.replaceAll(",", "."));
        
        amostra.removerNumero(valor);
        valores.remove(valor);        
        
        atualizarLista();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void mnuItemTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemTudoActionPerformed
        int confirmarLimpar = JOptionPane.showConfirmDialog(null, "Deseja limpar todos os valores?");
        if(confirmarLimpar == JOptionPane.YES_OPTION) {
            limparResultados();
            limparObjetos();
            atualizarLista();            
            limparValor();
        }
        
    }//GEN-LAST:event_mnuItemTudoActionPerformed

    private void mnuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemSobreActionPerformed
        JOptionPane.showMessageDialog(this, " sdHelper - Versão " + VERSAO + "\n Desenvolvido por Douglas Modena\n 2016 - MIT License\n github.com/dmodena/sdHelper", "sdHelper - Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mnuItemSobreActionPerformed

    private void mnuItemQuantisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemQuantisActionPerformed
        DlgQuantis dlgQuantis = new DlgQuantis(this, true, amostra);
        dlgQuantis.setVisible(true);
    }//GEN-LAST:event_mnuItemQuantisActionPerformed

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        btnIncluirActionPerformed(evt);
    }//GEN-LAST:event_tfValorActionPerformed

    private void mnuItemModaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemModaActionPerformed
        DlgModa dlgModa = new DlgModa(this, true, amostra);
        dlgModa.setVisible(true);
    }//GEN-LAST:event_mnuItemModaActionPerformed

    private void limparObjetos() {
        amostra = new Amostra();
        valores = new ArrayList<>();
        modelAmostra = new DefaultListModel<>();
    }
    
    private void limparValor() {
        tfValor.setText("");
        tfValor.requestFocus();
    }   
    
    private void limparResultados() {
        tfMedia.setText("");
        tfMediana.setText("");
        tfVariancia.setText("");
        tfDesvioPadrao.setText("");
        tfCoeficienteVariacao.setText("");
    }
    
    private void checaHabilitaExclusao() {
        if(valores.size() > 0 && !lstValores.isSelectionEmpty()) btnExcluir.setEnabled(true);
        else btnExcluir.setEnabled(false);
    }
    
    private void atualizarLista() {
        modelAmostra = new DefaultListModel<>();
        DecimalFormat df = new DecimalFormat("#.######");
        
        for(Double v : valores) {
            String elemento = df.format(v);
            modelAmostra.addElement(elemento);
        }
        
        lstValores.setModel(modelAmostra);
        lblQtdValores.setText(String.valueOf(valores.size()));
    }
    
    private boolean valorValido() {
        boolean valido = false;
        
        if(!tfValor.getText().trim().isEmpty()) {
            numberValidator = new NumberValidator();
            valido = numberValidator.validate(tfValor.getText().trim());
        }        
        
        return valido;
    }
    
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
            java.util.logging.Logger.getLogger(FrmAmostra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAmostra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAmostra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAmostra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAmostra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblQtdValores;
    private javax.swing.JList<String> lstValores;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuItemModa;
    private javax.swing.JMenuItem mnuItemQuantis;
    private javax.swing.JMenuItem mnuItemSobre;
    private javax.swing.JMenuItem mnuItemTudo;
    private javax.swing.JMenu mnuLimpar;
    private javax.swing.JMenu mnuOutros;
    private javax.swing.JTextField tfCoeficienteVariacao;
    private javax.swing.JTextField tfDesvioPadrao;
    private javax.swing.JTextField tfMedia;
    private javax.swing.JTextField tfMediana;
    private javax.swing.JTextField tfValor;
    private javax.swing.JTextField tfVariancia;
    // End of variables declaration//GEN-END:variables
}
